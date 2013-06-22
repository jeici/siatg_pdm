package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UbicacionInsertarActivity extends Activity {
	ControlBD helper;
	EditText editId_ubicacion;
	EditText editLocal;
	EditText editDescripcion_ub;
	

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ubicacion_insertar);
		helper = new ControlBD(this);
		editId_ubicacion = (EditText) findViewById(R.id.editId_ubicacion);
		editLocal = (EditText) findViewById(R.id.editLocal);
		editDescripcion_ub = (EditText) findViewById(R.id.editDescripcion_ub);
		
	}

	public void insertarUbicacion(View v) {
		String id_ubicacion = editId_ubicacion.getText().toString();
		String local = editLocal.getText().toString();
		String descripcion_ub = editDescripcion_ub.getText().toString();
		
		String regInsertados;
		Tubicacion ubicacion = new Tubicacion();
		ubicacion.setId_ubicacion(id_ubicacion);
		ubicacion.setLocal(local);
		ubicacion.setDescripcion_ub(descripcion_ub);
		
		helper.abrir();
		regInsertados = helper.insertar(ubicacion);
		helper.cerrar();
		Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
	}

	public void limpiarTexto(View v) {
		editId_ubicacion.setText("");
		editLocal.setText("");
		editDescripcion_ub.setText("");
	
	}
}