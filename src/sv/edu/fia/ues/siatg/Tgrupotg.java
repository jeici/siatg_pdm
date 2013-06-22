package sv.edu.fia.ues.siatg;

public class Tgrupotg {
	private String id_grupo_tg;
	private String anio;
	
public Tgrupotg(){}
public Tgrupotg(String id_grupo_tg, String anio){
	this.id_grupo_tg = id_grupo_tg;
	this.anio= anio;
	
}
public String getId_grupo_tg() {
	return id_grupo_tg;
}
public void setId_grupo_tg(String id_grupo_tg) {
	this.id_grupo_tg = id_grupo_tg;
}
public String getAnio() {
	return anio;
}
public void setAnio(String anio) {
	this.anio = anio;
}

}
