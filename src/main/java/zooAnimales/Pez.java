package zooAnimales;

import java.util.*;

import gestion.Zona;

public class Pez extends Animal {
	
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	private ArrayList<Pez> listado;
	
	public Pez() {
		
	}
	
	public Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		
	}
	
	public void setColorEscamas(String nuevoColorEscamas) {
		
		colorEscamas = nuevoColorEscamas;
		
	}
	
	public String getColorEscamas() {
		
		return colorEscamas;
		
	}
	
	public void setCantidadAletas(int nuevaCantidadAletas) {
		
		cantidadAletas = nuevaCantidadAletas;
		
	}
	
	public int getCantidadAletas() {
		
		return cantidadAletas;
	}
	
	public ArrayList<Pez> getListado(){
		
		return listado;
	}
	
	public static String movimiento() {
		
		return "nadar";
	}
	
	/** método crearSalmones**/
	
	public void crearSalmon(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		
		listado.add(new Pez(totalAnimales, nombre, edad, "océano", genero, zona, "rojo", 6));
		salmones++;
	}
	
	/** método crearBacalao**/
	
	public void crearBacalao(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		
		listado.add(new Pez(totalAnimales, nombre, edad, "océano", genero, zona, "gris", 6));
		bacalaos++;
	}
	
	
	/** método cantidadPeces**/
	public static int cantidadPeces() {
		
		return salmones + bacalaos;
	}
}
