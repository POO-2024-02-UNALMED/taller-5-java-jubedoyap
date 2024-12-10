package gestion;

import zooAnimales.*;

import java.util.*;

public class Zona {
	
	private String nombre;
	private Zoologico[] zoo = new Zoologico[1];
	private ArrayList<Animal> animales;
	
	public Zona() {
		
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo[1] = zoo;
		
	}
	
	public void setNombre(String nuevoNombre) {
		
		nombre = nuevoNombre;
		
	}
	
	public String getNombre(){
		
		return nombre;
		
	}
	
	public void setZoo(Zoologico nuevoZoo) {
		
		zoo[1] = nuevoZoo;
		
	}
	
	public Zoologico getZoo() {
		
		return zoo[1];
		
	}
	
	public ArrayList<Animal> getAnimales(){
		
		return animales;
		
	}
	
	
	public void agregarAnimales(Animal nuevoAnimal) {
		
		animales.add(nuevoAnimal);
		
	}
	

	public int cantidadAnimales() {
		
		return animales.size();
	}

}
