package es.nai;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int num = -1;
		Scanner sn = new Scanner(System.in);
		int cantidad = 0;
		AgendaTurnos ags = new AgendaTurnos();
		Odontologos os  =new Odontologos();
		//System.out.println("Cuantos odontologos quiere agregar");
		//cantidad =sn.nextInt();
		os.agregarOdontologos(cantidad);
		os.mostrardatos();
		do {
			
		os.juntarPartes();
		os.listaEncontrarOdontologo();
		do {
			num = -1;
			System.out.println("Si desea mostrar lista con días disponible de odontologo seleccionado tipee 1 si desea salir 0");
			int numero = sn.nextInt();
			if(numero == 1) {
			
			os.mostrarlista();
			sn.nextLine();
			}else {
				num = 0;
			}
		}while(num != 0);
		do {
			num = -1;
			System.out.println("Si desea cargar turno tipee 2 o 3 para mostrar lista de turnos si no 0");
			int numero = sn.nextInt();
			if(numero == 2) {
			os.turn();
				}else if(numero == 3){
					os.mostrarListaTurnos();
				}else {
					num=0;
				}
		}while(num !=0);
		}while(num != 0);
		}
		
}
