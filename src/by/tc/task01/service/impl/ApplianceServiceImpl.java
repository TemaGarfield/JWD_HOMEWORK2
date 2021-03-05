package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.IOException;
import java.util.Map;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public Appliance find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		Map<String, Object> params = appliance.getSpecifications();

		if (params.isEmpty()) {
			return appliance;
		}

		switch (appliance.getType()) {
			case "Oven":
				Oven oven = new Oven(
						Double.valueOf(params.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Oven.WEIGHT.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Oven.CAPACITY.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Oven.DEPTH.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Oven.HEIGHT.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Oven.WIDTH.toString()).toString())
				);

				return oven;

			case "Laptop":
				Laptop laptop = new Laptop(
						Double.valueOf(params.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()).toString()),
						params.get(SearchCriteria.Laptop.OS.toString()).toString(),
						Integer.valueOf(params.get(SearchCriteria.Laptop.MEMORY_ROM.toString()).toString()),
						Integer.valueOf(params.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Laptop.CPU.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString()).toString())
				);

				return laptop;

			case "Refrigerator":
				Refrigerator refrigerator = new Refrigerator(
						Double.valueOf(params.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Refrigerator.WEIGHT.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Refrigerator.HEIGHT.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.Refrigerator.WIDTH.toString()).toString())
				);

				return refrigerator;

			case "VacuumCleaner":
				VacuumCleaner vacuumCleaner = new VacuumCleaner(
						Double.valueOf(params.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()).toString()),
						params.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()).toString(),
						params.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()).toString(),
						params.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString()).toString(),
						Integer.valueOf(params.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()).toString())
				);

				return vacuumCleaner;

			case "TabletPC":
				TabletPC tabletPC = new TabletPC(
						Double.valueOf(params.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()).toString()),
						Integer.valueOf(params.get(SearchCriteria.TabletPC.MEMORY_ROM.toString()).toString()),
						Double.valueOf(params.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()).toString()),
						params.get(SearchCriteria.TabletPC.COLOR.toString()).toString()
				);

				return tabletPC;

			case "Speakers":
				Speakers speakers = new Speakers(
						Double.valueOf(params.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()).toString()),
						Integer.valueOf(params.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()).toString()),
						params.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString()).toString(),
						Double.valueOf(params.get(SearchCriteria.Speakers.CORD_LENGTH.toString()).toString())
						);

				return speakers;
		}

		return appliance;
	}

}

//you may add your own new classes
