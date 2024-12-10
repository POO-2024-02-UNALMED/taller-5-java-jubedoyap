package zooAnimales;

import gestion.*;
import java.util.*;

import gestion.Zona;

public class Ave extends Animal {
	
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	private ArrayList<Ave> listado;
	
	public Ave() {
		
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		
		super(nombre, edad, habitat, genero);
		
		
		this.colorPlumas = colorPlumas;
		
	}
	
	public void setColorPlumas(String nuevoColorPlumas) {
		
		colorPlumas = nuevoColorPlumas;
		
	}
	
	public String getColorPlumas() {
		
		return colorPlumas;
		
	}
	
	public ArrayList<Ave> getListado(){
		
		return listado;
	}
	
	public static String movimiento() {
		
		return "volar";
	}
	
	
	public static void crearHalcon(String nombre, int edad, String genero) {
		
		listado.add(new Ave(nombre, edad, "montanas", genero, "cafe glorioso"));
		halcones++;
	}
	
	
	public static void crearAguila(String nombre, int edad, String genero) {
		
		listado.add(new Ave(nombre, edad, "montanas", genero, "blanco y amarillo"));
		aguilas++;
	}
	
	
	public static int cantidadAves() {
		
		return halcones + aguilas;
	}
	

}
