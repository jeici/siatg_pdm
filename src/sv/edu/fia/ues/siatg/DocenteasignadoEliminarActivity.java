package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DocenteasignadoEliminarActivity extends Activity {

	EditText editIddocente;
	ControlBD controlhelper;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_docenteasignado_eliminar);
		controlhelper=new ControlBD (this);
		editIddocente = (EditText)findViewById(R.id.editIdJC);
	}
	public void eliminarDocenteasignado(View v){
		String regEliminadas;
		Tdocenteasignado docenteasignado=new Tdocenteasignado();
		docenteasignado.setId_docente(editIddocente.getText().toString());
		controlhelper.abrir();
		regEliminadas=controlhelper.eliminar(docenteasignado);
		controlhelper.cerrar();
		Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
	}

}
