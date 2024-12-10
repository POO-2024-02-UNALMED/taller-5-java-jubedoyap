package zooAnimales;

import java.util.*;

import gestion.Zona;

public class Reptil extends Animal {
	
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	private ArrayList<Reptil> listado;
	
	public Reptil() {
		
	}
	
	public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
		
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		
	}
	
	public void setColorEscamas(String nuevoColorEscamas) {
		
		colorEscamas = nuevoColorEscamas;
		
	}
	
	public String getColorEscamas() {
		
		return colorEscamas;
		
	}
	
	public void setLargoCola(int nuevoLargoCola) {
		
		largoCola = nuevoLargoCola;
		
	}
	
	public int getLargoCola() {
		
		return largoCola;
		
	}
	
	public ArrayList<Reptil> getListado(){
		
		return listado;
	}
	
	public static String movimiento() {
		
		return "reptar";
	}
	
	/** método crearIguana**/
	
	public void crearIguana(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		
		listado.add(new Reptil(totalAnimales, nombre, edad, "humedal", genero, zona, "verde", 3));
		iguanas++;
	}
	
	/** método crearSerpiente**/
	
	public void crearSerpiente(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		
		listado.add(new Reptil(totalAnimales, nombre, edad, "jungla", genero, zona, "blanco", 1));
		serpientes++;
	}
	
	
	/** método cantidadReptiles**/
	public static int cantidadReptiles() {
		
		return iguanas + serpientes;
	}

}
