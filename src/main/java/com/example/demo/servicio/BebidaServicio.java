package com.example.demo.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bebida;

@Service
public class BebidaServicio implements IBebidaServicio {

	List<Bebida> lista = new ArrayList<Bebida>();
	
	public BebidaServicio() {
        //añadimos la bebida por defecto
        Bebida b = new Bebida();
        lista.add(b);
        //añadimos otra bebida
        b = new Bebida(99, "quantum", "nuka cola");
        lista.add(b);
    }
	
	@Override
	public List<Bebida> getLista() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Bebida getBebida(int i) {
		// TODO Auto-generated method stub
		if(i<lista.size() && i >-1)
            return lista.get(i);
        return new Bebida(200, "agua", "del grifo");
	}

}
