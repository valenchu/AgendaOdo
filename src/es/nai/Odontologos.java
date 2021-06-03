package es.nai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Odontologos {
	private String nombre;
	private String apellido;
	private String n;
	private String[] d;
	private int dni;
	private int dniCopare;
	private ArrayList<AgendaGeneríca> ag = new ArrayList<>();
	private ArrayList<Odontologos> o = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	AgendaTurnos ac = new AgendaTurnos();
	int indice;

	public Odontologos(int dni, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public Odontologos() {
	}

//Agrega odontologos. sacando comentado agregar manual 
	public void agregarOdontologos(int numer) {
//	//	for (int i = 0; i < numer; i++) {
//			System.out.println("Ingrese nombre ");
//			nombre = sc.next();
//			System.out.println("Ingrese apellido");
//			apellido = sc.next();
//			System.out.println("Ingrese DNI");
//			dni = sc.nextInt();
//			this.o.add(new Odontologos(dni, nombre, apellido));
//			
//			
//		}
		this.o.add(new Odontologos(123, "Valentin", "Cassino"));
		this.o.add(new Odontologos(456, "Rogelio", "Dias"));
		this.o.add(new Odontologos(789, "Zarate", "Bernardo"));
	}

	// Muestra los odontologos
	public void mostrardatos() {
		for (Odontologos odo : this.o) {
			System.out.println(odo);
		}
		toString();
	}

//Agrego agenda
	public void agregarAgendaGenerica() {
//		Scanner op = new Scanner(System.in);
//		String dia, horaH, horaD, comen;
//		System.out.println("Ingrese dia");
//		dia = op.next();
//		op.nextLine();
//		System.out.println("Ingrese hasta que hora");
//		horaH = op.next();
//		op.nextLine();
//		System.out.println("Ingrese desde que hora");
//		horaD = op.next();
//		op.nextLine();
//		System.out.println("Ingrese comentarios días feriados");
//		comen = op.next();
//		op.nextLine();
//		this.ag.add(new AgendaGeneríca(dia, horaD, horaH, comen));

		this.ag.add(new AgendaGeneríca("11", "12", "8", "no"));
		this.ag.add(new AgendaGeneríca("14", "12", "8", "no"));
		this.ag.add(new AgendaGeneríca("24", "12", "8", "no"));
		this.ag.add(new AgendaGeneríca("12", "12", "8", "no"));
	}

//Si quita los comentarios se pueden agregar días manualmente!
	public void juntarPartes() {

		ArrayList<Object> omop = new ArrayList<>();
		System.out.println("Ingrese DNI odontologo a agregar días disponibles ");
		this.dniCopare = sc.nextInt();
		// System.out.println("Cuantos días disponibles quiere agregar");
		// int diasDisp= sc.nextInt();
		// for(int i = 0; i < diasDisp;i++) {
		agregarAgendaGenerica();
		// }
	}

//Busco odontologo por el DNI
	public void listaEncontrarOdontologo() {
		// Encontrar indice

		for (int i = 0; i < o.size(); i++) {
			if (this.dniCopare == o.get(i).getDni()) {
				this.indice = i;
				setN(o.get(i).getNombre());
			} else {
				System.out.println("no se encontro resultado");
			}
		}
	}

//Organiza el objeto de Odontologo con todos sus días marcados como habilitados
	public void mostrarlista() {
		ArrayList<Object> omop = new ArrayList<>();
		omop.add(o.get(this.indice));
		for (int i = 0; i < Math.max(o.size(), ag.size()); i++) {
			if (i < ag.size())
				omop.add(ag.get(i));
		}
		for (int i = 0; i < omop.size(); i++) {
			System.out.print(omop.get(i).toString() + " \n");
		}
	}

//llamar turnos
	public void turn() {
		int cont = -1;

		System.out.println("Diga motivo turno");
		String motivo = sc.next();
		sc.nextLine();
		ac.setMotivo(motivo);
		System.out.println("Diga día de turno");
		String dia = sc.next();
		int dor = Integer.parseInt(dia);
		for (int i = 0; i < getAg().size(); i++) {
			int dedo = Integer.parseInt(getAg().get(i).getDia());
			if (dor == dedo) {
				cont++;
			}
		}
		if (cont != -1) {
			ac.setTurno(dia, getN());
			System.out.println(ac.mostrarAgenda());

		} else {
			System.out.println("No tiene disponible el día brindado para dar turnos el Odontologo");
		}
	}
//muestr lista turnos
	public void mostrarListaTurnos() {
		for (int j = 0; j < ac.getT().size(); j++) {
			System.out.println(ac.getT().get(j));

		}

	}

	@Override
	public String toString() {
		return "Odontologos [dni= " + dni + "nombre= " + nombre + ", apellido= " + apellido + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public ArrayList<AgendaGeneríca> getAg() {
		return ag;
	}

	public void setAg(ArrayList<AgendaGeneríca> ag) {
		this.ag = ag;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String[] getD() {
		return d;
	}

	public void setD(String[] d) {
		this.d = d;
	}

}
