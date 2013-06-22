package sv.edu.fia.ues.siatg;

public class Tubicacion {

	private String id_ubicacion;
	private String local;
	private String descripcion_ub;

	public Tubicacion() {
	}

	public Tubicacion(String id_ubicacion, String local, String descripcion_ub) {
		this.id_ubicacion = id_ubicacion;
		this.local = local;
		this.descripcion_ub = descripcion_ub;

	}

	public String getId_ubicacion() {
		return id_ubicacion;
	}

	public void setId_ubicacion(String id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDescripcion_ub() {
		return descripcion_ub;
	}

	public void setDescripcion_ub(String descripcion_ub) {
		this.descripcion_ub = descripcion_ub;
	}

}
