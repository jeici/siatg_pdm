package sv.edu.fia.ues.siatg;

public class Tdocente {
	private String id_docente;
	private int can_perfiles_apr;
	private int can_perfiles_rep;
	private String correo_d;
	private String nombres_d;
	private String apellidos_d;
	
public Tdocente (){}

public Tdocente (String id_docente, int can_perfiles_apr, int can_pefiles_rep, String correo_d, String nombres_d, String apellidos_d){
	
	this.id_docente = id_docente;
	this.can_perfiles_apr = can_perfiles_apr;
	this.can_perfiles_rep = can_pefiles_rep;
	this.correo_d = correo_d;
	this.nombres_d = nombres_d;
	this.apellidos_d = apellidos_d;
}

public String getId_docente() {
	return id_docente;
}

public void setId_docente(String id_docente) {
	this.id_docente = id_docente;
}

public int getCan_perfiles_apr() {
	return can_perfiles_apr;
}

public void setCan_perfiles_apr(int can_perfiles_apr) {
	this.can_perfiles_apr = can_perfiles_apr;
}

public int getCan_perfiles_rep() {
	return can_perfiles_rep;
}

public void setCan_perfiles_rep(int can_perfiles_rep) {
	this.can_perfiles_rep = can_perfiles_rep;
}

public String getCorreo_d() {
	return correo_d;
}

public void setCorreo_d(String correo_d) {
	this.correo_d = correo_d;
}

public String getNombres_d() {
	return nombres_d;
}

public void setNombres_d(String nombres_d) {
	this.nombres_d = nombres_d;
}

public String getApellidos_d() {
	return apellidos_d;
}

public void setApellidos_d(String apellidos_d) {
	this.apellidos_d = apellidos_d;
}

}
