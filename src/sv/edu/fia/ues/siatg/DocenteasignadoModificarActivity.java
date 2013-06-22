package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DocenteasignadoModificarActivity extends Activity {

	ControlBD helper;
	EditText editId_docenteJC;
	EditText editPorcentaje;
	EditText editModalidad;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_docenteasignado_modificar);
		helper = new ControlBD(this);
		editId_docenteJC = (EditText) findViewById(R.id.editIdJC);
		editPorcentaje = (EditText) findViewById(R.id.editFloatJC);
		editModalidad = (EditText) findViewById(R.id.editModalidadJC);
	}
	public void actualizarDocenteasignado(View v) {
		Tdocenteasignado docentea = new Tdocenteasignado();
		docentea.setId_docente(editId_docenteJC.getText().toString());
		docentea.setPorcentaje_doc(Float.valueOf(editPorcentaje.getText().toString()));
		docentea.setModalidad(editModalidad.getText().toString());
		
		helper.abrir();
		String estado = helper.actualizar(docentea);
		helper.cerrar();
		Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();
	}
	public void limpiarTexto(View v) {
		editId_docenteJC.setText("");
		editPorcentaje.setText("");
		editModalidad.setText("");
	}

}
