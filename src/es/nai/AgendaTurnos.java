package es.nai;

import java.util.ArrayList;

public class AgendaTurnos {
	private String motivo;
	private String[] turno = new String[4]; 
	private String[] turnoe = new String[4];
	private int turnosCant = 0;
	private ArrayList<String[]> turnos = new ArrayList<String[]>();
	private ArrayList<String>t=new ArrayList<>();
	//Setea turnos para ver si esta disponible
	public void setTurno(String dia,String nom) {
		turno = new String[4];
		turno[0] = nom;
		turno[1]= dia ;
		turno[2]="Disponible";
		turno[3]=getMotivo();
		this.turnos.add(turno);
	}
	//Recolecta info para generar el turno del paciente!
	public String mostrarAgenda() {
		String as = null;
		String d = null;
		for (int i = 0; i < this.turnos.size(); i++) {
			String[] tu = this.turnos.get(i);
			turnoe[0] = new String(tu[0]);
			turnoe[1] = new String(tu[1]);
			turnoe[2] = new String(tu[2]);
			as =  "Turno numer "+i+" "+turno[0]+" "+turno[1]+ " de Junio de 2021 " + turno[2]+ "  "+ turno[3]+"\n";
			d=turno[2];
			this.turnosCant++;
		}
		//Limite de 8 turnos o salta este if
		if(this.turnosCant > 8) {
			return "Los turnos para el día"+ d +"ya alcanzo el limite de 8";
			
		}
		t.add(as);
		return as;
	}
	
	public ArrayList<String> getT() {
		return t;
	}
	public void setT(ArrayList<String> t) {
		this.t = t;
	}
	public void mostrar() {
		
	}
	
	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public ArrayList<String[]> getTurnos() {
		return turnos;
	}
	public void setTurnos(ArrayList<String[]> turnos) {
		this.turnos = turnos;
	}
	@Override
	public String toString() {
		return "AgendaTurnos [turnos=" + turnos + "]";
	}
	

}
