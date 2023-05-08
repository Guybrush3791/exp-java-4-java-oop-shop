package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int code;
	private String name;
	private String description;
	private int price;
	private int iva;
	
	public Prodotto(String name, String description,
					int price, int iva) {
		
		Random rnd = new Random();
		
		code = rnd.nextInt(999999);
		
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);
	}
	
	public int getCode() {
		
		return code;
	}
	public String getPaddedCode() {
		
		String strCode = "" + code;
		int strLng = strCode.length();
		
		for (int x=0;x<9-strLng;x++) {
			strCode = "0" + strCode;
		}
		
		return strCode;
	}
	
	public String getName() {
		
		return name;
	}
	public String getFullname() {
		
		return getCode() + "-" + getName();
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getDescription() {
		
		return description;
	}
	public void setDescription(String description) {
		
		this.description = description;
	}
	public int getPrice() {
		
		return price;
	}
	public int getIvaPrice() {
		
		return (int) (getPrice() * (1 + getIva() / 100f));
	}
	public void setPrice(int price) {
		
		this.price = price;
	}
	public int getIva() {
		
		return iva;
	}
	public void setIva(int iva) {
		
		this.iva = iva;
	}
	
	@Override
	public String toString() {
		
		return "[" + getCode() + "/" + getPaddedCode() + "]\n" 
				+ getName() + " - \"" + getFullname() + "\"" 
			+ "\n" + getDescription() 
			+ "\n" + getPrice() + "E (" + getIva() + "%)"
				+ " --> " + getIvaPrice() + "E";
	}
}
