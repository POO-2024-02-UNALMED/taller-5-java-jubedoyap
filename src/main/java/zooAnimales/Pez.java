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
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		
		super(nombre, edad, habitat, genero);
		
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
	
	public void crearSalmon(String nombre, int edad, String genero) {
		
		listado.add(new Pez(nombre, edad, "océano", genero, "rojo", 6));
		salmones++;
	}
	
	/** método crearBacalao**/
	
	public void crearBacalao(String nombre, int edad, String genero) {
		
		listado.add(new Pez(nombre, edad, "océano", genero, "gris", 6));
		bacalaos++;
	}
	
	
	/** método cantidadPeces**/
	public static int cantidadPeces() {
		
		return salmones + bacalaos;
	}
}
