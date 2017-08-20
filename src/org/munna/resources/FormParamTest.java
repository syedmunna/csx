package org.munna.resources;

import javax.ws.rs.FormParam;

public class FormParamTest {
	@FormParam("id")
	private int id;
	@FormParam("name")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
