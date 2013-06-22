package sv.edu.fia.ues.siatg;

public class Tdocenteasignado {
	//variables que son campos de la tabla
	private String id_docente;
	private Float porcentaje_doc;
	private String modalidad;
	
	public Tdocenteasignado(){
		
	}
	
	public Tdocenteasignado(String id_docente, Float porcentaje_doc, String modalidad){
		this.id_docente = id_docente;
		this.porcentaje_doc = porcentaje_doc;
		this.modalidad = modalidad;
	}

	public String getId_docente() {
		return id_docente;
	}
	public void setId_docente(String id_docente) {
		this.id_docente = id_docente;
	}
	public Float getPorcentaje_doc() {
		return porcentaje_doc;
	}
	public void setPorcentaje_doc(Float porcentaje_doc) {
		this.porcentaje_doc = porcentaje_doc;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}	
}
