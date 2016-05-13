package com.demos.cine.model;

public class Article {
	
	// article 
	
	private double prixHT;
	private String reference;
	private String designation;
	private int qtestock;
	
	public Article(double prixHT, String reference, String designation, int qtestock) {
		super();
		this.prixHT = prixHT;
		this.reference = reference;
		this.designation = designation;
		this.qtestock = qtestock;
	}

	public double getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	public String getReference() {
		return reference;
	}
	public String getDesignation() {
		return designation;
	}
	public int getQtestock() {
		return qtestock;
	}
	
	public void incrementStock(int qte) {		
		qtestock+=qte;		
	}
	
	public void decrementStock(int qte) {		
		qtestock-=qte;	
	}

	@Override
	public String toString() {
		return "Article [prixHT=" + prixHT + ", reference=" + reference + ", designation=" + designation + ", qtestock="
				+ qtestock + "]";
	}
	
	

}
