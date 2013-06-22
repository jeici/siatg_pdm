package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UbicacionEliminarActivity extends Activity {
	EditText editId_ubicacion;
	ControlBD controlhelper;
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_ubicacion_eliminar);
	controlhelper=new ControlBD (this);
	editId_ubicacion=(EditText)findViewById(R.id.editId_ubicacion);
}
public void eliminarUbicacion(View v){
	String regEliminadas;
	Tubicacion ubicacion=new Tubicacion();
	ubicacion.setId_ubicacion(editId_ubicacion.getText().toString());
	controlhelper.abrir();
	regEliminadas=controlhelper.eliminar(ubicacion);
	controlhelper.cerrar();
	Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
}
}