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
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		
		super(nombre, edad, habitat, genero);
		
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
	
	public void crearCaballo(String nombre, int edad, String genero) {
		
		listado.add(new Mamifero(nombre, edad, "pradera", genero, true, 4));
		caballos++;
	}
	
	/** método crearLeon**/
	
	public void crearLeon(String nombre, int edad, String genero) {
		
		listado.add(new Mamifero(nombre, edad, "selva", genero, true, 4));
		leones++;
	}
	
	
	/** método cantidadMamiferos**/
	public static int cantidadMamiferos() {
		
		return caballos + leones;
	}

}
