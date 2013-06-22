package sv.edu.fia.ues.siatg;

public class Tasesoria {

	private String id_asesoria;
	private String id_tg;
	private String hora_asesoria;
	private Integer num_asesoria;
	private String fecha_asesoria;
	private String observacion_a;
	
	
	
public Tasesoria(){
		
	}
	
	public Tasesoria(String id_asesoria,String id_tg,String hora_asesoria, Integer num_asesoria,String fecha_asesoria,String observacion_a ){
	
		this.id_asesoria = id_asesoria;
		this.id_tg = id_tg;
		this.hora_asesoria = hora_asesoria;
		this.num_asesoria = num_asesoria;
		this.fecha_asesoria = fecha_asesoria;
		this.observacion_a = observacion_a;
		
		
	}
	
	
	
	
	public void setid_asesoria(String id_asesoria) {
		this.id_asesoria = id_asesoria;
	}
	public String getid_asesoria() {
		return id_asesoria;
	}
	public String getid_tg() {
		return id_tg;
	}
	public void setid_tg(String id_tg) {
		this.id_tg = id_tg;
	}
	public String gethora_asesoria() {
		return hora_asesoria;
	}
	public void sethora_asesoria(String hora_asesoria) {
		this.hora_asesoria = hora_asesoria;
	}
	public Integer getnum_asesoria() {
		return num_asesoria;
	}
	public void setnum_asesoria(Integer num_asesoria) {
		this.num_asesoria = num_asesoria;
	}
	public String getfecha_asesoria() {
		return fecha_asesoria;
	}
	public void setfecha_asesoria(String fecha_asesoria) {
		this.fecha_asesoria = fecha_asesoria;
	}
	public String getobservacion_a() {
		return observacion_a;
	}
	public void setobservacion_a(String observacion_a) {
		this.observacion_a = observacion_a;
	}
	
	

	
	
	
	
	
	
}
