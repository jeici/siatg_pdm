package sv.edu.fia.ues.siatg;

public class Trevisionperfil {
	//variables que son campos de la tabla
	private String id_rev_perfil;
	private String id_perfil;
	private String id_docente;
	private String fecha_rev;
	private String observacion_rev;
	
	public Trevisionperfil(){
		
	}
	
	public Trevisionperfil(String id_rev_perfil, String id_perfil, String id_docente, String fecha_rev, String observacion_rev){
		this.id_rev_perfil = id_rev_perfil;
		this.id_perfil = id_perfil;
		this.id_docente = id_docente;
		this.fecha_rev = fecha_rev;
		this.observacion_rev = observacion_rev;
	}
	
	/**
	 * @return the id_rev_perfil
	 */
	public String getId_rev_perfil() {
		return id_rev_perfil;
	}
	/**
	 * @param id_rev_perfil the id_rev_perfil to set
	 */
	public void setId_rev_perfil(String id_rev_perfil) {
		this.id_rev_perfil = id_rev_perfil;
	}
	/**
	 * @return the id_perfil
	 */
	public String getId_perfil() {
		return id_perfil;
	}
	/**
	 * @param id_perfil the id_perfil to set
	 */
	public void setId_perfil(String id_perfil) {
		this.id_perfil = id_perfil;
	}
	/**
	 * @return the id_docente
	 */
	public String getId_docente() {
		return id_docente;
	}
	/**
	 * @param id_docente the id_docente to set
	 */
	public void setId_docente(String id_docente) {
		this.id_docente = id_docente;
	}
	/**
	 * @return the fecha_rev
	 */
	public String getFecha_rev() {
		return fecha_rev;
	}
	/**
	 * @param fecha_rev the fecha_rev to set
	 */
	public void setFecha_rev(String fecha_rev) {
		this.fecha_rev = fecha_rev;
	}
	/**
	 * @return the observacion_rev
	 */
	public String getObservacion_rev() {
		return observacion_rev;
	}
	/**
	 * @param observacion_rev the observacion_rev to set
	 */
	public void setObservacion_rev(String observacion_rev) {
		this.observacion_rev = observacion_rev;
	}
}
