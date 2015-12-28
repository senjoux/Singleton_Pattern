package com.ham.pattern.singleton;

		public class Connexion {
			private static Connexion instance = new Connexion(); 
			
			private Connexion(){};
			
			public static Connexion getInstance(){
				return instance;
			}
			
			public void salut(){
				System.out.println("hello from Tunisia ");
			}
		}

		
		