package zooAnimales;

import java.util.*;

import gestion.Zona;

public class Anfibio extends Animal {
	
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	private ArrayList<Anfibio> listado;
	
	public Anfibio() {
		
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		
		super(nombre, edad, habitat, genero);
		
		this.colorPiel= colorPiel;
		this.venenoso = venenoso;
		
	}
	
	public void setColorPiel(String nuevoColorPiel) {
		
		colorPiel = nuevoColorPiel;
		
	}
	
	public String getColorPiel() {
		
		return colorPiel;
		
	}
	
	public void setVenenoso(boolean nuevoVenenoso) {
		
		venenoso = nuevoVenenoso;
		
	}
	
	public boolean getVenenoso() {
		
		return venenoso;
	}
	
	public ArrayList<Anfibio> getListado(){
		
		return listado;
	}
	
	public static String movimiento() {
		
		return "saltar";
	}
	

	
	public void crearRana(String nombre, int edad, String genero) {
		
		listado.add(new Anfibio(nombre, edad, "selva", genero, "rojo", true));
		ranas++;
	}
	
	
	public void crearSalamandra(String nombre, int edad, String genero) {
		
		listado.add(new Anfibio(nombre, edad, "selva", genero,"negro y amarillo", false));
		salamandras++;
	}
	
	
	public static int cantidadAnfibios() {
		
		return ranas + salamandras;
	}

}
