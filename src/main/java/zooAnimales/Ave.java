package zooAnimales;

import java.util.*;

import gestion.Zona;

public class Ave extends Animal {
	
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	private ArrayList<Ave> listado;
	
	public Ave() {
		
	}
	
	public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		
		
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
	
	/**método movimiento**/
	public static String movimiento() {
		
		return "volar";
	}
	
	/** método crearHalcon**/
	
	public void crearHalcon(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		
		listado.add(new Ave(totalAnimales, nombre, edad, "montañas", genero, zona, "café glorioso"));
		halcones++;
	}
	
	/** método crearAguila**/
	
	public void crearAguila(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		
		listado.add(new Ave(totalAnimales, nombre, edad, "monatañas", genero, zona, "blanco y amarillo"));
		aguilas++;
	}
	
	
	/** método cantidadAves**/
	public static int cantidadAves() {
		
		return halcones + aguilas;
	}
	

}
