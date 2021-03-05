package by.tc.task01.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public Map<String, Object> getCriteria() { return  criteria; }

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public List<String> generateParams() {
		List<String> params = new ArrayList<>();

		for (Map.Entry<String, Object> item:criteria.entrySet()) {
			String param = item.getKey() + "=" + item.getValue().toString();
			params.add(param);
		}

		return params;
	}
	
	// you may add your own code here

}
