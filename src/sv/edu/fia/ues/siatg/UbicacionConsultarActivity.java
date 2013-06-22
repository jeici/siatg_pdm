package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UbicacionConsultarActivity extends Activity {
	ControlBD helper;
	EditText editId_ubicacion;
	EditText editLocal;
	EditText editDescripcion_ub;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_ubicacion_consultar);
		helper = new ControlBD(this);
		editId_ubicacion = (EditText) findViewById(R.id.editId_ubicacion);
		editLocal = (EditText) findViewById(R.id.editLocal);
		editDescripcion_ub = (EditText) findViewById(R.id.editDescripcion_ub);
		
	}
	public void consultarUbicacion(View v) {
		helper.abrir();
		Tubicacion ubicacion = helper.consultarUbicacion(editId_ubicacion.getText().toString());
		helper.cerrar();
		
	if(ubicacion == null)
		Toast.makeText(this, "Ubicacion con id " + editId_ubicacion.getText().toString() + " no encontrado", Toast.LENGTH_LONG).show();
	else{
		editLocal.setText(ubicacion.getLocal());
		editDescripcion_ub.setText(ubicacion.getDescripcion_ub());
		}
	}
	public void limpiarTexto(View v){
		editId_ubicacion.setText("");
		editLocal.setText("");
		editDescripcion_ub.setText("");
		}
	}
