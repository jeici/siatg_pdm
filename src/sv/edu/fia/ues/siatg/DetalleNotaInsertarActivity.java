package sv.edu.fia.ues.siatg;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DetalleNotaInsertarActivity extends Activity {
	ControlBD helper;
	EditText editId_defensa;
	EditText editCarnet;
	EditText editNota_ase;
	EditText editNota_obs;
	

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalle_nota_insertar);
		helper = new ControlBD(this);
		editId_defensa = (EditText) findViewById(R.id.editId_defensa);
		editCarnet = (EditText) findViewById(R.id.editCarnet);
		editNota_ase = (EditText) findViewById(R.id.editNota_ase);
		editNota_obs = (EditText) findViewById(R.id.editNota_obs);
		
	}

	public void insertarDetalleNota(View v) {
		String id_defensa = editId_defensa.getText().toString();
		String carnet = editCarnet.getText().toString();
		String nota_ase = editNota_ase.getText().toString();
		String nota_obs = editNota_obs.getText().toString();
		
		String regInsertados;
		DetalleNota detallenota = new DetalleNota();
		detallenota.setId_defensa(id_defensa);
		detallenota.setCarnet(carnet);
		detallenota.setNota_ase(nota_ase);
		detallenota.setNota_obs(nota_obs);
		
		helper.abrir();
		regInsertados = helper.insertar(detallenota);
		helper.cerrar();
		Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
	}

	public void limpiarTexto(View v) {
		editId_defensa.setText("");
		editCarnet.setText("");
		editNota_ase.setText("");
		editNota_obs.setText("");
	
	}
}
