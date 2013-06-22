package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DefensaInsertarActivity extends Activity {
	ControlBD helper;
	EditText editId_defensa;
	EditText editId_tg;
	EditText editId_ubicacion;
	//EditText editId_etapa;
	EditText editHora;
	EditText editFecha;
	

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_defensa_insertar);
		helper = new ControlBD(this);
		editId_defensa = (EditText) findViewById(R.id.editId_defensa);
		editId_tg = (EditText) findViewById(R.id.editId_tg);
		editId_ubicacion = (EditText) findViewById(R.id.editId_ubicacion);
		//editId_etapa = (EditText) findViewById(R.id.editId_etapa);
		editHora = (EditText) findViewById(R.id.editHora);
		editFecha = (EditText) findViewById(R.id.editFecha);
		
	}

	public void insertarDefensa(View v) {
		String id_defensa = editId_defensa.getText().toString();
		String id_tg = editId_tg.getText().toString();
		String id_ubicacion = editId_ubicacion.getText().toString();
		//String id_etapa = editId_etapa.getText().toString();
		String hora = editHora.getText().toString();
		String fecha = editFecha.getText().toString();
		
		String regInsertados;
		Tdefensa defensa = new Tdefensa();
		defensa.setId_defensa(id_defensa);
		defensa.setId_tg(id_tg);
		defensa.setId_ubicacion(id_ubicacion);
		//defensa.setId_etapa(id_etapa);
		defensa.setHora(hora);
		defensa.setFecha(fecha);
		
		helper.abrir();
		regInsertados = helper.insertar(defensa);
		helper.cerrar();
		Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
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