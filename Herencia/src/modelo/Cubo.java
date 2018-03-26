package modelo;

import static javax.swing.JOptionPane.*;

public class Cubo extends Cuadrado {

	public static void main(String[] args) {
		int salir=0;
		try {
			do {
				int lado=Integer.parseInt(showInputDialog("Ingrese el lado"));
				Cuadrado cuadrado=new Cuadrado(lado);
				do {
					switch (salir=menu(lado)) {
					case 1:
						showMessageDialog(null, "El area del cuadrado es: "+cuadrado.calcularArea(lado));
						break;
						
					case 2:
						showMessageDialog(null, "El perimetro del cuadrado es: "+cuadrado.calcularPerimetro(lado));
						break;

					case 3:
						showMessageDialog(null, "El volumen del cubo es: "+calcularVolumen(lado));
						break;

					case 4:
						showMessageDialog(null, "El area lateral del cubo es: "+calcularAreaLateral(lado));
						break;

					case 5:
						showMessageDialog(null, "Saliendo...");
						break;

					default:
						break;
					}
				} while (salir!=5 && salir!=0);
			} while (salir==0);
		} catch (Exception e) {
			showMessageDialog(null, "Saliendo...");
		}
	}
	
	static int menu(int lado){
		int opcion=0;
		try {
			String salida="                    ********MENU********\n";
			salida+="      1.- Calcular area de un cuadrado\n";
			salida+="      2.- Calcular perimetro de un cuadrado\n";
			salida+="      3.- Calcular volumen de un cubo\n";
			salida+="      4.- Calcular area lateral de un cubo\n";
			salida+="      5.- Salir\n";
			salida+="\nNOTA: Para ingresar un nuevo lado, da click en cancelar\n";
			salida+="\nIngrese la opción que desea con el dato Lado= "+lado+" : ";
			opcion=Integer.parseInt(showInputDialog(salida));
			if (opcion>5) {
				showMessageDialog(null, "No ingresaste una opción valida");
			}
		} catch (Exception e) {
		}
		return opcion;
	}
	
	static int calcularVolumen(int lado){
		int resultado=lado*lado*lado;
		return resultado;
	}
	
	static int calcularAreaLateral(int lado){
		int resultado=6*(lado*lado);
		return resultado;
	}

}
