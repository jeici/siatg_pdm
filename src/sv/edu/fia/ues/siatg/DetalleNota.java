package sv.edu.fia.ues.siatg;

public class DetalleNota {
	private String id_defensa;
	private String carnet;
	private String nota_ase;
	private String nota_obs;

	public DetalleNota() {
	}

	public DetalleNota(String id_defensa, String carnet, String nota_ase, String nota_obs) {
		this.id_defensa = id_defensa;
		this.carnet = carnet;
		this.nota_ase = nota_ase;
		this.nota_obs = nota_obs;
		
	}

	public String getId_defensa() {
		return id_defensa;
	}

	public void setId_defensa(String id_defensa) {
		this.id_defensa = id_defensa;
	}

	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public void setNota_ase(String nota_ase) {
		this.nota_ase = nota_ase;
	}

	public String getNota_ase() {
		return nota_ase;
	}

	public String getNota_obs() {
		return nota_obs;
	}

	public void setNota_obs(String nota_obs) {
		this.nota_obs = nota_obs;
	}
	
}

