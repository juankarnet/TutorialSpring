package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.modelo.Bebida;
import com.example.demo.servicio.BebidaServicio;

@Controller
@RequestMapping("bar")
public class BebidasControlador {

	@Autowired
	BebidaServicio bebidaServicio;
	
	@RequestMapping("cerveza")
	public String cerveza(ModelMap mp){
		Bebida bebida = new Bebida();
		mp.put("cerveza", bebida);
		return "bar/cerveza";
	}
	
	@RequestMapping("refresco")
	public String refresco(ModelMap mp){
		Bebida refresco = new Bebida(25,"Tónica", "Swheppes");
		mp.put("refresco", refresco);
		return "bar/refresco";
	}
	
	@RequestMapping("listaBebidas")
	public String getLista(ModelMap mp){
		mp.put("lista", bebidaServicio.getLista());
		return "bar/lista";
	}
	
	@RequestMapping(value="/bebida/{i}", method = RequestMethod.GET)
	public String bebida(@PathVariable("i") int i, ModelMap mp){
	    mp.put("bebida", bebidaServicio.getBebida(i));
	    return "bar/bebida";
	}
	
	@RequestMapping("/listajson")
	@ResponseBody
	public List<Bebida> listaJson(ModelMap mp){
		return bebidaServicio.getLista();
	}
	
    @RequestMapping("ListaJsonHTML")
    public String listaJsonHtml(ModelMap mp){
        return "bar/ListaJsonH";
    }
	
}
