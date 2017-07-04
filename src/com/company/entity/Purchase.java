package com.company.entity;

public class Purchase {

	private int id;
	private Company company;
	private String remarks;
	private String dateTime;
	private Item item;
	private String Description;
	private int Quantity;
	private int Rate;
	private int amount;
	private int purchaseRate;
	private int saleRate;
	private int retailRate;
	private int fixRate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getRate() {
		return Rate;
	}
	public void setRate(int rate) {
		Rate = rate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPurchaseRate() {
		return purchaseRate;
	}
	public void setPurchaseRate(int purchaseRate) {
		this.purchaseRate = purchaseRate;
	}
	public int getSaleRate() {
		return saleRate;
	}
	public void setSaleRate(int saleRate) {
		this.saleRate = saleRate;
	}
	public int getRetailRate() {
		return retailRate;
	}
	public void setRetailRate(int retailRate) {
		this.retailRate = retailRate;
	}
	public int getFixRate() {
		return fixRate;
	}
	public void setFixRate(int fixRate) {
		this.fixRate = fixRate;
	}
	
}
