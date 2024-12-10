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
	
	/**método movimiento**/
	public static String movimiento() {
		
		return "volar";
	}
	
	/** método crearHalcon**/
	
	public void crearHalcon(String nombre, int edad, String genero) {
		
		listado.add(new Ave(nombre, edad, "montañas", genero, "café glorioso"));
		halcones++;
	}
	
	/** método crearAguila**/
	
	public void crearAguila(String nombre, int edad, String genero) {
		
		listado.add(new Ave(nombre, edad, "monatañas", genero, "blanco y amarillo"));
		aguilas++;
	}
	
	
	/** método cantidadAves**/
	public static int cantidadAves() {
		
		return halcones + aguilas;
	}
	

}
