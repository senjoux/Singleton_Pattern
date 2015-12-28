package com.ham.pattern.singleton;

		public class Demo {
		
			public static void main(String[] args) {
		
				//erreur de compilation, le constructeur est privée 
				//Connexion c=new Connexion();
				
				Connexion c=Connexion.getInstance();
				c.salut();
			}
		
		}

		
		