package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DefensaActualizarActivity extends Activity {
	ControlBD helper;
	EditText editId_defensa;
	EditText editId_tg;
	EditText editId_ubicacion;
	//EditText editId_etapa;
	EditText editHora;
	EditText editFecha;


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_defensa_actualizar);
		helper = new ControlBD(this);
		editId_defensa= (EditText) findViewById(R.id.editId_defensa);
		editId_tg = (EditText) findViewById(R.id.editId_tg);
		editId_ubicacion = (EditText) findViewById(R.id.editId_ubicacion);
		//editId_etapa = (EditText) findViewById(R.id.editId_etapa);
		editHora = (EditText) findViewById(R.id.editHora);
		editFecha = (EditText) findViewById(R.id.editFecha);
	}

	public void actualizarDefensa(View v) {
		Tdefensa defensa = new Tdefensa();
		defensa.setId_defensa(editId_defensa.getText().toString());
		defensa.setId_tg(editId_tg.getText().toString());
		defensa.setId_ubicacion(editId_ubicacion.getText().toString());
		//defensa.setId_etapa(editId_etapa.getText().toString());
		defensa.setHora(editHora.getText().toString());
		defensa.setFecha(editFecha.getText().toString());
		
		helper.abrir();
		String estado = helper.actualizar(defensa);
		helper.cerrar();
		Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();
	}
	public void limpiarTexto(View v) {
		editId_defensa.setText("");
		editId_tg.setText("");
		editId_ubicacion.setText("");
		//editId_etapa.setText("");
		editHora.setText("");
		editFecha.setText("");
		
	}
}
