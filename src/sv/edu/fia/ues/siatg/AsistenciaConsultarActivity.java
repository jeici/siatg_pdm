package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AsistenciaConsultarActivity extends Activity {

	ControlBD helper;
	EditText editId_asistencia;
	EditText editId_asesoria;
	EditText editEstado_as;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_asistencia_consultar);
	helper = new ControlBD(this);
	editId_asistencia = (EditText) findViewById(R.id.editId_asistencia);
	editId_asesoria = (EditText) findViewById(R.id.editId_asesoria);
	editEstado_as = (EditText) findViewById(R.id.editEstado_as);
	
	}
	public void consultarAsistencia(View v) {
	helper.abrir();
	Tasistencia asistencia =helper.consultarAsistencia(editId_asistencia.getText().toString());
	helper.cerrar();
	if(asistencia == null)
	Toast.makeText(this, "Asistencia con codigo " +editId_asistencia.getText().toString() +" no fue encontrado", Toast.LENGTH_LONG).show();
	else{
	editId_asesoria.setText(asistencia.getId_asesoria());
	editEstado_as.setText(asistencia.getEstado_as());
	
	}
	}
	public void limpiarTexto(View v){
		editId_asistencia.setText("");
		editId_asesoria.setText("");
		editEstado_as.setText("");
	
	}

}
