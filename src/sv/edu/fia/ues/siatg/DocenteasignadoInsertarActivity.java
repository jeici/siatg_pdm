package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DocenteasignadoInsertarActivity extends Activity {

	ControlBD helper;
	EditText editIddocente;
	EditText editPorcentaje;
	EditText editModalidad;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_docenteasignado_insertar);
		helper = new ControlBD(this);
		editIddocente = (EditText) findViewById(R.id.editIdJC);
		editPorcentaje = (EditText) findViewById(R.id.editFloatJC);
		editModalidad = (EditText) findViewById(R.id.editModalidadJC);
	}
	
	public void insertarDocenteasignado(View v) {
		String id_docente=editIddocente.getText().toString();
		Float porcentaje_doc=Float.valueOf(editPorcentaje.getText().toString());
		String modalidad=editModalidad.getText().toString();
		
		String regInsertados;
		Tdocenteasignado docenteasignado = new Tdocenteasignado();
		docenteasignado.setId_docente(id_docente);
		docenteasignado.setPorcentaje_doc(porcentaje_doc);
		docenteasignado.setModalidad(modalidad);
		
		helper.abrir();
		regInsertados=helper.insertar(docenteasignado);
		helper.cerrar();
		Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
	}
	
	public void limpiarTexto(View v) {
		editIddocente.setText("");
		editPorcentaje.setText("");
		editPorcentaje.setText("");
	}

}
