package sv.edu.fia.ues.siatg;

public class Ttipoproyecto {
	private String id_tipo_proy;
	private String nombre_pry;
	
	
	public Ttipoproyecto(){		
	}
	
	public Ttipoproyecto(String id_tipo_proy,String nombre_pry){
		this.id_tipo_proy=id_tipo_proy;
		this.nombre_pry = nombre_pry;
		
	}
	
	public String getIdTipoProy(){
		return id_tipo_proy;
	}
	
	public void setIdTipoProy(String id_tipo_proy){
		this.id_tipo_proy=id_tipo_proy;
	}
	
	public String getNombre_pry(){
		return nombre_pry;
	}
	
	public void setNombre_pry(String nombre_pry){
		this.nombre_pry=nombre_pry;
	}

}
