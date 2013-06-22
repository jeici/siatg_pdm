package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DetalleNotaConsultarActivity extends Activity {
	ControlBD helper;
	EditText editId_defensa;
	EditText editCarnet;
	EditText editNota_ase;
	EditText editNota_obs;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_detalle_nota_consultar);
		helper = new ControlBD(this);
		editId_defensa = (EditText) findViewById(R.id.editId_defensa);
		editCarnet = (EditText) findViewById(R.id.editCarnet);
		editNota_ase = (EditText) findViewById(R.id.editNota_ase);
		editNota_obs = (EditText) findViewById(R.id.editNota_obs);
		
	}
	public void consultarDetalleNota(View v) {
		helper.abrir();
		DetalleNota detallenota = helper.consultarDetalleNota(editId_defensa.getText().toString());
		helper.cerrar();
		
	if(detallenota == null)
		Toast.makeText(this, "detalle nota con id " + editId_defensa.getText().toString() + " no encontrado", Toast.LENGTH_LONG).show();
	else{
		editCarnet.setText(detallenota.getCarnet());
		editNota_ase.setText(detallenota.getNota_ase());
		editNota_obs.setText(detallenota.getNota_obs());
		}
	}
	public void limpiarTexto(View v){
		editId_defensa.setText("");
		editCarnet.setText("");
		editNota_ase.setText("");
		editNota_obs.setText("");
		}
	}
