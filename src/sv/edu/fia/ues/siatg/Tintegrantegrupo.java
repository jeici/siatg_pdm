package sv.edu.fia.ues.siatg;

public class Tintegrantegrupo {

	private String representante;
	private Float nota_final;
	private String id_integrante;
	private String id_grupo_tg;
	
	public Tintegrantegrupo(){
		
	}
	
	public Tintegrantegrupo(String representante, Float nota_final, String id_integrante, String id_grupo_tg){
		
		this.representante = representante;
		this.nota_final = nota_final;
		this.id_integrante = id_integrante;
		this.id_grupo_tg = id_grupo_tg;
	}	
	
	public String getrepresentante(){
		return representante;
	}
		
	
	public void setrepresentante(String representante){
		this.representante = representante;
	}
	
	public Float getnota_final(){
		return nota_final;
	}
		
	
	public void setnota_final(Float nota_final){
		this.nota_final = nota_final;
	}
	
	public String getid_integrante(){
		return id_integrante;
	}
	
	public void setid_integrante(String id_integrante){
		this.id_integrante = id_integrante;
	}
	
	public String getid_grupo_tg(){
		return id_grupo_tg;
	}
	
	public void setid_grupo_tg(String id_grupo_tg){
		this.id_grupo_tg = id_grupo_tg;
	}

}
