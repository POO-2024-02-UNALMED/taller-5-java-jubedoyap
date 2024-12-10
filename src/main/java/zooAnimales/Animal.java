package zooAnimales;

import gestion.*;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona = new Zona[1];

	public Animal() {
		
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	
	public static int getTotalAnimales(){
		
		totalAnimales = Mamifero.cantidadMamiferos()+ Ave.cantidadAves()+Reptil.cantidadReptiles()+Pez.cantidadReptiles()+Anfibio.cantidadAnfibios();
		return totalAnimales;
		
	}
	
	public void setNombre(String nuevoNombre) {
		
		nombre = nuevoNombre ;
	}
	
	public String getNombre(){
		
		return nombre;
		
	}
	
	public void setEdad(int nuevaEdad) {
		
		edad = nuevaEdad ;
	}
	
	public int getEdad(){
		
		return edad;
		
	}
	
	public void setHabitat(String nuevoHabitat) {
		
		habitat = nuevoHabitat ;
	}
	
	public String getHabitat(){
		
		return habitat;
		
	}
	
	public void setGenero(String nuevoGenero) {
		
		genero = nuevoGenero ;
	}
	
	public String getGenero(){
		
		return genero;
		
	}
	
	public void setZona(Zona nuevaZona) {
		
		zona[1] = nuevaZona;
		
	}
	
	public Zona getZona() {
		
		return zona[1];
		
	}
	

	public void totalPorTipo() {
		
		System.out.println("Mamíferos: "+ Mamifero.cantidadMamiferos());
		System.out.println("Aves: "+ Ave.cantidadAves());
		System.out.println("Reptiles: "+ Reptil.cantidadReptiles());
		System.out.println("Peces: "+ Pez.cantidadPeces());
		System.out.println("Anfibios: "+ Anfibio.cantidadSalamandras());
	}
	

	public String toString() {
		
		if (zona != null) {
			
			return "Mi nombre es " + nombre +", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + 
					", la zona en la que me ubico es " + zona[1].getNombre() + ", en el " + zona[1].getZoo().getNombre() + ".";
					
		}
		else {
			
			return "Mi nombre es " + nombre +", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
		}
	}
	

	public static String movimiento() {
		
		return "desplazarse";
	}
}
