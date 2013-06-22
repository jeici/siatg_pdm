package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AsistenciaEliminarActivity extends Activity {
	EditText editId_asistencia;
	ControlBD controlhelper;
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_asistencia_eliminar);
	controlhelper=new ControlBD (this);
	editId_asistencia=(EditText)findViewById(R.id.editId_asistencia);
}
public void eliminarAsistencia(View v){
	String regEliminadas;
	Tasistencia asistencia=new Tasistencia();
	asistencia.setId_asistencia(editId_asistencia.getText().toString());
	controlhelper.abrir();
	regEliminadas=controlhelper.eliminar(asistencia);
	controlhelper.cerrar();
	Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
}
		}
