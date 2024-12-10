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
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		
		super(nombre, edad, habitat, genero);
		
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
	
	
	public void crearIguana(String nombre, int edad, String genero) {
		
		listado.add(new Reptil(nombre, edad, "humedal", genero, "verde", 3));
		iguanas++;
	}
	
	
	public void crearSerpiente(String nombre, int edad, String genero) {
		
		listado.add(new Reptil(nombre, edad, "jungla", genero, "blanco", 1));
		serpientes++;
	}
	
	
	public static int cantidadReptiles() {
		
		return iguanas + serpientes;
	}

}
