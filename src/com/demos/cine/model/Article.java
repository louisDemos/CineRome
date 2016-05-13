package com.demos.cine.model;

public class Article {
	
	private double prixHT;
	private String reference;
	private String designation;
	private int qtestock;
	private boolean dematerialise;
	
	

	public Article(String reference, String designation, double prixHT,  int qtestock) {
		super();
		this.prixHT = prixHT;
		this.reference = reference;
		this.designation = designation;
		this.qtestock = qtestock;
		this.dematerialise=false;
	}
	
	public Article(String reference, String designation, double prixHT) {
		super();
		this.prixHT = prixHT;
		this.reference = reference;
		this.designation = designation;
		this.qtestock = 0;
		this.dematerialise=true;
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
	
	public boolean isDematerialise() {
		return dematerialise;
	}

	public void setDematerialise(boolean dematerialise) {
		this.dematerialise = dematerialise;
	}
	
	public void incrementStock(int qte) {		
		qtestock+=qte;		
	}
	
	public void decrementStock(int qte) {		
		qtestock-=qte;	
	}

	@Override
	public String toString() {
		String description = "";
		if(!isDematerialise()){
		
		description= " reference=" + reference + ", designation=" + designation + ",prixHT=" + prixHT + ", qtestock="
				+ qtestock + "";
	
		}
		else{
			description=" reference=" + reference + ", designation=" + designation + ",prixHT=" + prixHT + ", objet dématérialisé";
		}
		return description;
	}
	

}
