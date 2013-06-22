package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DocenteInsertarActivity extends Activity {
	
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
		setContentView(R.layout.activity_docente_insertar);
		helper = new ControlBD(this);
		editId_docente = (EditText) findViewById(R.id.editId_docente);
		editCan_perfiles_apr = (EditText) findViewById(R.id.editCan_perfiles_apr);
		editCan_perfiles_rep = (EditText) findViewById(R.id.editCan_perfiles_rep);
		editCorreo_d = (EditText) findViewById(R.id.editCorreo_d);
		editNombres_d = (EditText) findViewById(R.id.editNombres_d);
		editApellidos_d = (EditText) findViewById(R.id.editApellidos_d);
		
	}
	
	public void insertardocente(View v) {
		String id_docente = editId_docente.getText().toString();
		int can_perfiles_apr =Integer.valueOf(editCan_perfiles_apr.getText().toString());
		int can_perfiles_rep =Integer.valueOf(editCan_perfiles_rep.getText().toString());
		String correo_d=editCorreo_d.getText().toString();
		String nombres_d = editNombres_d.getText().toString();
		String apellidos_d =editApellidos_d.getText().toString();
		
		String regInsertados;
			
			Tdocente tdocente = new Tdocente();
			tdocente.setId_docente(id_docente);
			tdocente.setCan_perfiles_apr(can_perfiles_apr);
			tdocente.setCan_perfiles_rep(can_perfiles_rep);
			tdocente.setCorreo_d(correo_d);
			tdocente.setNombres_d(nombres_d);
			tdocente.setApellidos_d(apellidos_d);
			
						
			helper.abrir();
			regInsertados=helper.insertardocente(tdocente);
			helper.cerrar();
			Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
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
