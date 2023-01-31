package org.lessons.java.exceptions.books;

public class Libro {
	
	private String titolo;
	private String autore;
	private String editore;
	private int numeroPagine;
	
	public Libro(String titolo, String autore, String editore, int numeroPagine) throws Exception {
		super();
		
		if (numeroPagine <= 0) {
		      throw new Exception("Numero di pagine non valido");}
		
		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;
		this.numeroPagine = numeroPagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception{
		if (titolo == null || titolo.trim().length() == 0) {
		      throw new Exception("Titolo non valido");
		      }
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception{
		if (autore == null || autore.trim().length() == 0) {
		      throw new Exception("Autore non valido");
		      }
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws Exception{
		if (editore == null || editore.trim().length() == 0) {
		      throw new Exception("Editore non valido");
		}
		this.editore = editore;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) throws Exception{
		if (numeroPagine <= 0) {
		      throw new Exception("Numero di pagine non valido");}
		this.numeroPagine = numeroPagine;
	}
	
}
