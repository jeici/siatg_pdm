package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AsistenciaInsertarActivity extends Activity {
	ControlBD helper;
	EditText editId_asistencia;
	EditText editId_asesoria;
	EditText editEstado_as;
	

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_asistencia_insertar);
		helper = new ControlBD(this);
		editId_asistencia = (EditText) findViewById(R.id.editId_asistencia);
		editId_asesoria = (EditText) findViewById(R.id.editId_asesoria);
		editEstado_as = (EditText) findViewById(R.id.editEstado_as);
		
	}

	public void insertarAsistencia(View v) {
		String id_asistencia = editId_asistencia.getText().toString();
		String id_asesoria = editId_asesoria.getText().toString();
		String estado_as = editEstado_as.getText().toString();
		
		String regInsertados;
		Tasistencia asistencia = new Tasistencia();
		asistencia.setId_asistencia(id_asistencia);
		asistencia.setId_asesoria(id_asesoria);
		asistencia.setEstado_as(estado_as);
		
		helper.abrir();
		regInsertados = helper.insertar(asistencia);
		helper.cerrar();
		Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
	}

	public void limpiarTexto(View v) {
		editId_asistencia.setText("");
		editId_asesoria.setText("");
		editEstado_as.setText("");
	
	}
}