package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DocenteConsultarActivity extends Activity {
	ControlBD helper;
	EditText editId_docente;
	EditText editCan_perfiles_apr;
	EditText editCan_perfiles_rep;
	EditText editCorreo_d;
	EditText editNombres_d;
	EditText editApellidos_d;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_docente_consultar);
		helper = new ControlBD(this);
		editId_docente = (EditText) findViewById(R.id.editId_Docente);
		editCan_perfiles_apr = (EditText) findViewById(R.id.editCan_perfiles_apr);
		editCan_perfiles_rep = (EditText) findViewById(R.id.editCan_perfiles_rep);
		editCorreo_d = (EditText) findViewById(R.id.editCorreo_d);
		editNombres_d = (EditText) findViewById(R.id.editNombres_d);
		editApellidos_d = (EditText) findViewById(R.id.editApellidos_d);
	}
	
	 public void consultardocente(View v) {

		 helper.abrir();	 
		 Tdocente tdocente = helper.consultardocente(editId_docente.getText().toString());
		 
		 helper.cerrar();
		 if(tdocente == null)
			 Toast.makeText(this, "Docente con ID " + editId_docente.getText().toString() + 
					 " no encontrado", Toast.LENGTH_LONG).show();
		 else{
			
			 editId_docente.setText(tdocente.getId_docente());
			 editCan_perfiles_apr.setText(""+tdocente.getCan_perfiles_apr());
			 editCan_perfiles_rep.setText(""+tdocente.getCan_perfiles_rep());
			 editCorreo_d.setText(tdocente.getCorreo_d());
			 editNombres_d.setText(tdocente.getNombres_d());
			 editApellidos_d.setText(tdocente.getApellidos_d());
		
					
			 
		 }
	}
	 public void limpiarTexto(View v) {

			editId_docente.setText("");
			editCan_perfiles_apr.setText("");
			editCan_perfiles_rep.setText("");
			editCorreo_d.setText("");
			editNombres_d.setText("");
			editApellidos_d.setText("");
			
		}

	

}


