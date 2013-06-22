package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DetalleNotaActualizarActivity extends Activity {

	ControlBD helper;
	EditText editId_defensa;
	EditText editCarnet;
	EditText editNota_ase;
	EditText editNota_obs;


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalle_nota_actualizar);
		helper = new ControlBD(this);
		editId_defensa= (EditText) findViewById(R.id.editId_defensa);
		editCarnet = (EditText) findViewById(R.id.editCarnet);
		editNota_ase = (EditText) findViewById(R.id.editNota_ase);
		editNota_obs = (EditText) findViewById(R.id.editNota_obs);
	}

	public void actualizarDefensa(View v) {
		DetalleNota detallenota = new DetalleNota();
		detallenota.setId_defensa(editId_defensa.getText().toString());
		detallenota.setCarnet(editCarnet.getText().toString());
		detallenota.setNota_ase(editNota_ase.getText().toString());
		detallenota.setNota_obs(editNota_obs.getText().toString());
		
		helper.abrir();
		String estado = helper.actualizar(detallenota);
		helper.cerrar();
		Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();
	}
	public void limpiarTexto(View v) {
		editId_defensa.setText("");
		editCarnet.setText("");
		editNota_ase.setText("");
		editNota_obs.setText("");
		
	}
}

