package gestion;

import java.util.*;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void setNombre(String nuevoNombre) {
		
		nombre = nuevoNombre;
		
	}
	
	public String getNombre(){
		
		return nombre;
		
	}
	
	public void setUbicacion(String nuevaUbicacion) {
		
		ubicacion = nuevaUbicacion;
		
	}
	
	public String getUbicacion() {
		
		return ubicacion;
		
	}
	
	
	public ArrayList<Zona> getZonas() {
		
		return zonas;
		
	}
	

	
	public void AgregarZonas(Zona nuevaZona) {
		
		zonas.add(nuevaZona);
		
	}
	

	
	public int cantidadTotalAnimales() {
		
		int totalAnimales = 0;
		
		for (int i = 0; i< zonas.size(); i++) {
			totalAnimales += zonas.get(i).cantidadAnimales(); //Se entra a cada zona y se llama el método que retorna la cantidad de animales que hay en la zona
		}
		
		return totalAnimales;
	}
	
	

}
