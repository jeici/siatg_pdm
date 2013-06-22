package sv.edu.fia.ues.siatg;

public class Tperfil {
	
	private String id_perfil;
	private String id_grupo_tg;
	private String id_tg;
	private String id_tipo_proy;
	private String tema;
	private String estado;
	private String carrera;
	
	public Tperfil(){
		
	}
	
	public Tperfil(String id_perfil, String id_grupo_tg,String id_tg, String id_tipo_proy,String tema, String estado, String carrera ){
	
		this.id_perfil = id_perfil;
		this.id_grupo_tg = id_grupo_tg;
		this.id_tg = id_tg;
		this.id_tipo_proy = id_tipo_proy;
		this.tema = tema;
		this.estado = estado;
		this.carrera = carrera;
		
	}
	
	public String getid_perfil() {
		return  id_perfil;
	}
	
	public void setid_perfil(String id_perfil) {
		this.id_perfil = id_perfil;
	}
	
	
	public String getid_grupo_tg() {
		return  id_grupo_tg;
	}
	
	public void setid_grupo_tg(String id_grupo_tg) {
		this.id_grupo_tg = id_grupo_tg;
	}
	
	public String getid_tg() {
		return  id_tg;
	}
	
	public void setid_tg(String id_tg) {
		this.id_tg = id_tg;
	}
	
	public String getid_tipo_ptoy() {
		return  id_tipo_proy;
	}
	
	public void setid_tipo_proy(String id_tipo_proy) {
		this.id_tipo_proy = id_tipo_proy;
	}
	
	public String gettema() {
		return  tema;
	}
	
	public void settema(String tema) {
		this.tema = tema;
	}
	
	public String getestado() {
		return  estado;
	}
	
	public void setestado(String estado) {
		this.estado = estado;
	}
	
	public String getcarrera() {
		return  carrera;
	}
	
	public void setcarrera(String carrera) {
		this.carrera = carrera;
	}
}
