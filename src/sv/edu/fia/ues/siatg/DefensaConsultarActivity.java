package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DefensaConsultarActivity extends Activity  {
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
		
		setContentView(R.layout.activity_defensa_consultar);
		helper = new ControlBD(this);
		editId_defensa = (EditText) findViewById(R.id.editId_defensa);
		editId_tg = (EditText) findViewById(R.id.editId_tg);
		editId_ubicacion = (EditText) findViewById(R.id.editId_ubicacion);
		//editId_etapa = (EditText) findViewById(R.id.editId_etapa);
		editHora = (EditText) findViewById(R.id.editHora);
		editFecha = (EditText) findViewById(R.id.editFecha);
		
	}
	public void consultarDefensa(View v) {
		helper.abrir();
		Tdefensa defensa = helper.consultarDefensa(editId_defensa.getText().toString());
		helper.cerrar();
		
	if(defensa == null)
		Toast.makeText(this, "defensa con id " + editId_defensa.getText().toString() + " no encontrado", Toast.LENGTH_LONG).show();
	else{
		editId_tg.setText(defensa.getId_tg());
		editId_ubicacion.setText(defensa.getId_ubicacion());
		//editId_etapa.setText(defensa.getId_etapa());
		editHora.setText(defensa.getHora());
		editFecha.setText(defensa.getFecha());
		}
	}
	public void limpiarTexto(View v){
		editId_defensa.setText("");
		editId_tg.setText("");
		editId_ubicacion.setText("");
		//editId_etapa.setText("");
		editHora.setText("");
		editFecha.setText("");
		}
	}
