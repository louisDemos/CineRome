package com.demos.cine.model;

public class ProjetPrincipal {

	public static void main(String[] args) {
		Article a1 = new Article(100, "123456789", "livre1", 5);
		Article a2 = new Article(100, "123456", "livre 2", 8);
		
		Panier p = new Panier();
		
		p.ajouter(a1, 1);
		p.ajouter(a2, 5);
		
		System.out.println(p);
		System.out.println(p.getPrixTotalHT());
		
		

	}

}
