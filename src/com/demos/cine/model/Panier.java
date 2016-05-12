package com.demos.cine.model;

import java.util.ArrayList;

public class Panier {
	
	ArrayList<LignePanier> contenu = new ArrayList<LignePanier>(); ;

	public Panier() {
		super();
		
	}
	
	public void ajouter(Article a, int qte) {
		LignePanier lp = new LignePanier(a, qte);
		contenu.add(lp);
		
	}
	
	
	public double getPrixTotalHT() {
		
		double prix=0;
		for(LignePanier lp:contenu){
			prix+=lp.getArticle().getPrixHT()*lp.getQteCommande();
		}
		
		return prix;
	}

	@Override
	public String toString() {
		String description="";
		for(LignePanier lp:contenu){
			description+=lp.getArticle().getReference()+""+lp.getQteCommande()+"\n";
		}
		
		
		return description;
	}
	
	
	
}
