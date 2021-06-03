package es.nai;

public class AgendaGeneríca {
	private String dia = "";
	private String mes ="Junio";
	private String ano ="2021";
	private String horaDesde = "";
	private String horaHasta = "";
	private int duracionConsulta = 30;
	private String comentario="";
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getHoraDesde() {
		return horaDesde;
	}
	public void setHoraDesde(String horaDesde) {
		this.horaDesde = horaDesde;
	}
	public String getHoraHasta() {
		return horaHasta;
	}
	public void setHoraHasta(String horaHasta) {
		this.horaHasta = horaHasta;
	}
	public int getDuracionConsulta() {
		return duracionConsulta;
	}
	public void setDuracionConsulta(int duracionConsulta) {
		this.duracionConsulta = duracionConsulta;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public AgendaGeneríca(String dia, String horaDesde, String horaHasta, String comentario) {
		this.dia = dia;
		this.horaDesde = horaDesde;
		this.horaHasta = horaHasta;
		this.comentario = comentario;
	}
	public AgendaGeneríca() {
	}
	@Override
	public String toString() {
		return "AgendaGeneríca [dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", horaDesde=" + horaDesde
				+ ", horaHasta=" + horaHasta + ", duracionConsulta=" + duracionConsulta + ", comentario=" + comentario
				+ "]";
	}
	
	
}
