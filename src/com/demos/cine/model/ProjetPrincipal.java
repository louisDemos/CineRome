package com.demos.cine.model;

public class ProjetPrincipal {

	public static void main(String[] args) {
		Article a1 = new Article("123", "livre1", 100, 1);
		Article a2 = new Article("123", "livre1", 100);
		
		Panier p = new Panier();
		
		p.ajouter(a1, 3);
		p.ajouter(a2, 1);
		
		System.out.println(a2);
		System.out.println(p);
		System.out.println(p.getPrixTotalHT());
		
		

	}

}
