package sv.edu.fia.ues.siatg;

public class Tetapa {
	private String id_etapa;
	private String id_defensa;
	private String nombre_etapa;
	private String descripcion_etapa;
	private String porcentaje;

	public Tetapa() {
	}

	public Tetapa(String id_etapa, String nombre_etapa, String descripcion_etapa, String porcentaje) {
		this.id_etapa = id_etapa;
		this.nombre_etapa =nombre_etapa;
		this.descripcion_etapa = descripcion_etapa;
		this.porcentaje = porcentaje;
		

	}

	public String getId_etapa() {
		return id_etapa;
	}

	public void setId_etapa(String id_etapa) {
		this.id_etapa = id_etapa;
	}

	public String getNombre_etapa() {
		return nombre_etapa;
	}

	public void setNombre_etapa(String  nombre_etapa) {
		this. nombre_etapa =  nombre_etapa;
	}

	public String getId_defensa() {
		return id_defensa;
	}

	public void setId_defensa(String id_defensa) {
		this.id_defensa = id_defensa;
	}

	public String getDescripcion_etapa() {
		return descripcion_etapa;
	}

	public void setDescripcion_etapa(String descripcion_etapa) {
		this.descripcion_etapa = descripcion_etapa;
	}
	
	public String getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
}
