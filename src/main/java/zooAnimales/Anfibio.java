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
	
	public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		
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
	
	/** método crearRana**/
	
	public void crearRana(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		
		listado.add(new Anfibio(totalAnimales, nombre, edad, "selva", genero, zona, "rojo", true));
		ranas++;
	}
	
	/** método crearSalamandra**/
	
	public void crearSalamandra(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		
		listado.add(new Anfibio(totalAnimales, nombre, edad, "océano", genero, zona, "negro", false));
		salamandras++;
	}
	
	
	/** método cantidadAnfibios**/
	public static int cantidadSalamandras() {
		
		return ranas + salamandras;
	}

}
