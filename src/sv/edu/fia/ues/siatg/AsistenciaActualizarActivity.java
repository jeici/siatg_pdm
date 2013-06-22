package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AsistenciaActualizarActivity extends Activity {

	ControlBD helper;
	EditText editId_asistencia;
	EditText editId_asesoria;
	EditText editEstado_as;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_asistencia_actualizar);
		helper = new ControlBD(this);
		editId_asistencia= (EditText) findViewById(R.id.editId_asistencia);
		editId_asesoria = (EditText) findViewById(R.id.editId_asesoria);
		editEstado_as = (EditText) findViewById(R.id.editEstado_as);
		
	}

	public void actualizarAsistencia(View v) {
		Tasistencia asistencia = new Tasistencia();
		asistencia.setId_asistencia(editId_asistencia.getText().toString());
		asistencia.setId_asesoria(editId_asesoria.getText().toString());
		asistencia.setEstado_as(editEstado_as.getText().toString());
		
		helper.abrir();
		String estado = helper.actualizar(asistencia);
		helper.cerrar();
		Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();
	}
	public void limpiarTexto(View v) {
		editId_asistencia.setText("");
		editId_asesoria.setText("");
		editEstado_as.setText("");
		
	}
	}
