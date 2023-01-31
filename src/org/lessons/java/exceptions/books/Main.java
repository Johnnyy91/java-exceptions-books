package org.lessons.java.exceptions.books;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	    System.out.println("Inserisci il numero di libri: ");
	    
	    int n = s.nextInt();
	    Libro[] libri = new Libro[n];
	    
	    for (int i = 0; i < n; i++) {
	      System.out.println("Inserisci i dati del libro " + (i + 1));
	      
	      System.out.println("Titolo: ");
	      String titolo = s.next();
	      
	      System.out.println("Numero di pagine: ");
	      int numeroPagine = s.nextInt();
	      
	      System.out.println("Autore: ");
	      String autore = s.next();
	      
	      System.out.println("Editore: ");
	      String editore = s.next();
	      
	      try {
	        libri[i] = new Libro(titolo, autore, editore, numeroPagine);
	      } catch (Exception e) {
	        System.out.println("Errore: " + e.getMessage());
	        i--;
	      }
	    }
	    
	    System.out.println("Catalogo dei libri:");
	    
	    s.close();

	}
}
