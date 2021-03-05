package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO{
	private static final String FILE_PATH = "resources\\appliances_db.txt";

	@Override
	public Appliance find(Criteria criteria) throws IOException{
		FileReader fileReader = new FileReader(FILE_PATH);
		BufferedReader reader = new BufferedReader(fileReader);
		Appliance app = new Appliance();

		List<String> params = criteria.generateParams();
		String line = reader.readLine();
		while (line != null) {
			if (line.isEmpty()) {
				line = reader.readLine();
			}
			line = line.replaceAll(";", "");

			String[] parseByColon = parseByColon(line);
			if (parseByColon[0].equals(criteria.getGroupSearchName())) {
				String[] parseByComma = parseByComma(parseByColon[1]);
				int counter = 0;
				for (String param:parseByComma) {
					if (params.contains(param)) {
						counter++;
					}
				}

				if (counter == params.size()) {
					app.setType(parseByColon[0]);

					for (String param:parseByComma) {
						app.add(parseByEqually(param)[0], parseByEqually(param)[1]);
					}
				}
			}
			line = reader.readLine();
		}

		return app;
	}
	
	// you may add your own code here

	public static String[] parseByColon(String data) {
		return data.split(" : ");
	}

	public static String[] parseByComma(String data) {
		return data.split(", ");
	}

	public static String[] parseByEqually(String data) {
		return data.split("=");
	}
}


//you may add your own new classes
