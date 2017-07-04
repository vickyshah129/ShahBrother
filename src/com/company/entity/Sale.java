package com.company.entity;

public class Sale {

	private int id;
	private String name;
	private Customer customer;
	private String ramarks;
	private String manualCode;

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
