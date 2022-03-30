package Ejercicio_2;

import java.util.Scanner;

public class Bombero {

	static String nombre;
	String apellido;
	int edad;
	boolean casado;
	boolean especilista;
	
	
	
	public static void buscarBombero() {
		Scanner scanner = new Scanner(System.in);
		Bombero bombero1 = new Bombero();
		bombero1.setNombre("juan");
		bombero1.setApellido("Santo");
		bombero1.setEdad(27);
		bombero1.setCasado(true);
		bombero1.setEcilista(false);
		 String respuestaNombre;
		System.out.println("A que bombero estas buscando?");
		System.out.println("Dime su nombre. ");
		respuestaNombre =scanner.next();
		if(respuestaNombre.equals(bombero1.getNombre())){
			System.out.println("El usuario "+respuestaNombre+" existe");
			System.out.println("Nombre : "+bombero1.getNombre());
			System.out.println("Apellido : "+bombero1.getApellido());
			System.out.println("Edad : "+bombero1.getEdad());
			System.out.println("Casado : "+bombero1.getCasado());
			System.out.println("Especialista :"+bombero1.getEspecilista());
		}else {
			System.out.println("El usuario : "+respuestaNombre+" no exite");
		
		}
	}
	
	//NOMBRE
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nuevoNombre){
		nombre= nuevoNombre;
	}
	//APELLINO
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String nuevoApellido){
		apellido= nuevoApellido;
	}
	//EDAD
	public int getEdad() {
		return edad;
	}
	public void setEdad(int nuevaEdad) {
		edad=nuevaEdad;
	}
	//CASADO
	public boolean getCasado() {
		return casado;
	}
	public void setCasado(boolean noCasado) {
		casado = noCasado;
	}
	//ESPECIALISTA
	public boolean getEspecilista() {
		return especilista;
	}
	public void setEcilista(boolean noEspecilista) {
		especilista = noEspecilista;
	}
}
