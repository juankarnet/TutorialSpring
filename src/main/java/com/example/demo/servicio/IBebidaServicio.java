package com.example.demo.servicio;

import java.util.List;

import com.example.demo.modelo.Bebida;

public interface IBebidaServicio {

	/**
	 * 
	 * @return
	 */
	public List<Bebida> getLista();
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public Bebida getBebida(int i);
}
