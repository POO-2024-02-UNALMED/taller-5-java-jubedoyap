package zooAnimales;

import java.util.*;

import gestion.Zona;

public class Mamifero extends Animal {
	
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	private ArrayList<Mamifero> listado;
	
	public Mamifero() {
		
	}
	
	public Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
		
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public void setPelaje(boolean nuevoPelaje) {
		
		pelaje = nuevoPelaje;
		
	}
	
	public boolean getPelaje() {
		
		return pelaje;
		
	}
	
	public void setPatas(int nuevasPatas) {
		
		patas = nuevasPatas;
		
	}
	
	public int getPatas() {
		
		return patas;
		
	}
	
	public ArrayList<Mamifero> getListado(){
		
		return listado;
	}
	
	/** método crearCaballo**/
	
	public void crearCaballo(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		
		listado.add(new Mamifero(totalAnimales, nombre, edad, "pradera", genero, zona, true, 4));
		caballos++;
	}
	
	/** método crearLeon**/
	
	public void crearLeon(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		
		listado.add(new Mamifero(totalAnimales, nombre, edad, "selva", genero, zona, true, 4));
		leones++;
	}
	
	
	/** método cantidadMamiferos**/
	public static int cantidadMamiferos() {
		
		return caballos + leones;
	}

}
