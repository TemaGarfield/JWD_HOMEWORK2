package by.tc.task01.main;

import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		// you may add your own code here
		if ("".equals(appliance.getType())) {
			System.out.println("Sorry! I can't find appliance.");
		} else {
			switch (appliance.getType()) {
				case "Oven":
					Oven oven = (Oven) appliance;

					System.out.println(oven.formattedString());
					break;

				case "Laptop":
					Laptop laptop = (Laptop) appliance;

					System.out.println(laptop.formattedString());
					break;

				case "Refrigerator":
					Refrigerator refrigerator = (Refrigerator) appliance;

					System.out.println(refrigerator.formattedString());
					break;

				case "VacuumCleaner":
					VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
					System.out.println(vacuumCleaner.formattedString());
					break;

				case "TabletPC":
					TabletPC tabletPC = (TabletPC) appliance;

					System.out.println(tabletPC.formattedString());
					break;

				case "Speakers":
					Speakers speakers = (Speakers) appliance;

					System.out.println(speakers.formattedString());
					break;

				default:
					System.out.print(appliance.getType() + " : ");
					for (Map.Entry<String, Object> item:appliance.getSpecifications().entrySet()) {
						System.out.print(item.getKey() + "=" + item.getValue() + ", ");
					}
					break;

			}
		}
	}
	
	// you may add your own code here

}
