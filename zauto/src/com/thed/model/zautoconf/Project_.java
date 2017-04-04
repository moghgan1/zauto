package com.thed.model.zautoconf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project_ {

	private Integer id;
	private String name;
	private List<Release> releases = null;

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

	public List<Release> getReleases() {
		return releases;
	}

	public void setReleases(List<Release> releases) {
		this.releases = releases;
	}

}
