package zooAnimales;

import gestion.*;

public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona = new Zona[1];

	public Animal() {
		
	}
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona[1] = zona;
	}
	
	public void setTotalAnimales(int nuevoTotalAnimales) {
		
		totalAnimales = nuevoTotalAnimales ;
		
	}
	
	public int getTotalAnimales(){
		
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
	
	/** método total por tipo**/
	public void totalPorTipo() {
		
		System.out.println("Mamíferos: "+ Mamifero.cantidadMamiferos());
		System.out.println("Aves: "+ Ave.cantidadAves());
		System.out.println("Reptiles: "+ Reptil.cantidadReptiles());
		System.out.println("Peces: "+ Pez.cantidadPeces());
		System.out.println("Anfibios: "+ Anfibio.cantidadSalamandras());
	}
	
	/** método toString**/
	public String toString() {
		
		if (zona != null) {
			
			return "Mi nombre es " + nombre +", tengo una edad de " + edad + ", habito en " + habitat + " y mi género es " + genero + 
					", la zona en la que me ubico es " + zona[1].getNombre() + ", en el " + zona[1].getZoo().getNombre() + ".";
					
		}
		else {
			
			return "Mi nombre es " + nombre +", tengo una edad de " + edad + ", habito en " + habitat + " y mi género es " + genero;
		}
	}
	
	/** método movimiento**/
	public static String movimiento() {
		
		return "desplazarse";
	}
}
