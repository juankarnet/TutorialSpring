package com.example.demo.controlador;

//import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
//public class MiControlador implements ErrorController {
public class MiControlador{
	
	@RequestMapping("")
	@ResponseBody
	String welcome(){
		return "Hola Mundo!";
	}
	
	@RequestMapping("hola")
	String hola(@RequestParam(value="name", required=false, defaultValue="World") String name, ModelMap mp){
		mp.put("textoHola", "Hola " + name + "!");
		return "HolaMundo";
	}
	
	@RequestMapping("adios")
	String adios(ModelMap mp){
		mp.put("textoAdios", "Adios Mundo!");
		return "AdiosMundo";
	}
	
	@RequestMapping("login")
	String login(ModelMap mp){
		return "login";
	}
	
//	@RequestMapping("/error")
//	String errorHandler(){
//		return "error";
//	}
//
//	@Override
//	public String getErrorPath() {
//		// TODO Auto-generated method stub
//		return "/error";
//	}
}
