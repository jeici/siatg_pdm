package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UbicacionActualizarActivity extends Activity {

ControlBD helper;
EditText editId_ubicacion;
EditText editLocal;
EditText editDescripcion_ub;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_ubicacion_actualizar);
	helper = new ControlBD(this);
	editId_ubicacion= (EditText) findViewById(R.id.editId_ubicacion);
	editLocal = (EditText) findViewById(R.id.editLocal);
	editDescripcion_ub = (EditText) findViewById(R.id.editDescripcion_ub);
	
}

public void actualizarUbicacion(View v) {
	Tubicacion ubicacion = new Tubicacion();
	ubicacion.setId_ubicacion(editId_ubicacion.getText().toString());
	ubicacion.setLocal(editLocal.getText().toString());
	ubicacion.setDescripcion_ub(editDescripcion_ub.getText().toString());
	
	helper.abrir();
	String estado = helper.actualizar(ubicacion);
	helper.cerrar();
	Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();
}
public void limpiarTexto(View v) {
	editId_ubicacion.setText("");
	editLocal.setText("");
	editDescripcion_ub.setText("");
	
}
}
