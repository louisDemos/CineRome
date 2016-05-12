package com.demos.cine.model;

public class Prix {
	
	private double valeur;
	
	public Prix(double p) throws Exception{
		
		// si prix n�gatif l'objet prix n'est pas cr�e
		setPrix(p);
	}
	
	public double getPrix(){
		return valeur;		
	}
	public void setPrix (double p) throws Exception{
		if(p<0){
			throw new Exception("prix negatif");
		}
		valeur=p;
	}

}
