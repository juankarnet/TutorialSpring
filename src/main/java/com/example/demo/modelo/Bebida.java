package com.example.demo.modelo;

public class Bebida {

	private int precio;
	private String nombre;
	private String marca;
	
	public Bebida() {
		super();
		this.nombre = "cerveza";
        this.marca = "duff";
        this.precio = 99;
	}
	
	public Bebida(int precio, String nombre, String marca) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
