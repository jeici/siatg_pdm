package sv.edu.fia.ues.siatg;

public class Tdefensa {

	private String id_defensa;
	private String id_tg;
	private String id_ubicacion;
	//private String id_etapa;
	private String hora;
	private String fecha;
	public Tdefensa() {
	}

	public Tdefensa(String id_defensa, String id_tg, String id_ubicacion, String id_etapa, String hora, String fecha) {
		this.id_defensa = id_defensa;
		this.id_tg = id_tg;
		this.id_ubicacion = id_ubicacion;
		//this.id_etapa = id_etapa;
		this.hora = hora;
		this.fecha = fecha;

	}

	public String getId_defensa() {
		return id_defensa;
	}

	public void setId_defensa(String id_defensa) {
		this.id_defensa = id_defensa;
	}

	public String getId_tg() {
		return id_tg;
	}

	public void setId_tg(String id_tg) {
		this.id_tg = id_tg;
	}

	public String getId_ubicacion() {
		return id_ubicacion;
	}

	public void setId_ubicacion(String id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}

	/*public String getId_etapa() {
		return id_etapa;
	}

	public void setId_etapa(String id_etapa) {
		this.id_etapa = id_etapa;
	}*/
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
