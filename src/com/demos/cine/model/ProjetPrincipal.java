package com.demos.cine.model;

public class ProjetPrincipal {

	public static void main(String[] args) {
		
		Panier p = new Panier();
		
		Article a1;
		try {
			a1 = new Article(new Prix(100), "123456789", "livre1", 5);
			p.ajouter(a1, 1);
		} catch (Exception e) {			
			System.out.println("article non créé car prix incorrect");
		}
		
		Article a2;
		try {
			a2 = new Article(new Prix(100), "123456", "livre 2", 8);
			p.ajouter(a2, 5);
		} catch (Exception e) {
			System.out.println("article non créé car prix incorrect");			
		}
		
		
		System.out.println(p);
		System.out.println(p.getPrixTotalHT());
		
		

	}

}
