package sv.edu.fia.ues.siatg;

public class Tasistencia {

	private String id_asistencia;
	private String id_asesoria;
	private String estado_as;

	public Tasistencia() {
	}

	public Tasistencia(String id_asistencia, String id_asesoria, String estado_as) {
		this.id_asistencia = id_asistencia;
		this.id_asesoria = id_asesoria;
		this.estado_as = estado_as;

	}

	public String getId_asistencia() {
		return id_asistencia;
	}

	public void setId_asistencia(String id_asistencia) {
		this.id_asistencia = id_asistencia;
	}

	public String getId_asesoria() {
		return id_asesoria;
	}

	public void setId_asesoria(String id_asesoria) {
		this.id_asesoria = id_asesoria;
	}

	public String getEstado_as() {
		return estado_as;
	}

	public void setEstado_as(String estado_as) {
		this.estado_as = estado_as;
	}

}
