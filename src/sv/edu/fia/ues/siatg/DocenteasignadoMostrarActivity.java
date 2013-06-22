package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DocenteasignadoMostrarActivity extends Activity {

	ControlBD helper;
	EditText editIddocente;
	EditText editPorcentaje;
	EditText editModalidad;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_docenteasignado_mostrar);
		helper = new ControlBD(this);
		editIddocente = (EditText) findViewById(R.id.editIdJC);
		editPorcentaje = (EditText) findViewById(R.id.editFloatJC);
		editModalidad = (EditText) findViewById(R.id.editModalidadJC);
	}
	
	public void consultarDocenteasignado(View v) {
		helper.abrir();
		Tdocenteasignado tdocenteasginado = helper.consultardocenteasginado(editIddocente.getText().toString());
		helper.cerrar();
		if(tdocenteasginado == null)
			Toast.makeText(this, "Docente con codigo " + 
			editIddocente.getText().toString() + 
			" no encontrado", Toast.LENGTH_LONG).show();
		else{
			editPorcentaje.setText(""+tdocenteasginado.getPorcentaje_doc());
			editModalidad.setText(tdocenteasginado.getModalidad());
		}
	}
	public void limpiarTexto(View v){
		editIddocente.setText("");
		editPorcentaje.setText("");
		editModalidad.setText("");
	}

}
