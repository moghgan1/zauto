package com.thed.model.zautoconf;

import java.util.HashMap;
import java.util.Map;

public class Release {

	private Integer id;
	private String name;
	private String automationFrameworkSelected;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutomationFrameworkSelected() {
		return automationFrameworkSelected;
	}

	public void setAutomationFrameworkSelected(String automationFrameworkSelected) {
		this.automationFrameworkSelected = automationFrameworkSelected;
	}

}
