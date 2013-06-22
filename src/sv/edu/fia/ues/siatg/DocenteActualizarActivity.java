package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DocenteActualizarActivity extends Activity {
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
		setContentView(R.layout.activity_docente_actualizar);
		helper = new ControlBD(this);
		editId_docente = (EditText) findViewById(R.id.editId_docente);
		editCan_perfiles_apr = (EditText) findViewById(R.id.editCan_perfiles_apr);
		editCan_perfiles_rep = (EditText) findViewById(R.id.editCan_perfiles_rep);
		editCorreo_d = (EditText) findViewById(R.id.editCorreo_d);
		editNombres_d = (EditText) findViewById(R.id.editNombres_d);
		editApellidos_d = (EditText) findViewById(R.id.editApellidos_d);
	
	}

	public void actualizardocente(View v) {
		Tdocente tdocente = new Tdocente();
		
		tdocente.setId_docente(editId_docente.getText().toString());
		tdocente.setCan_perfiles_apr(Integer.valueOf(editCan_perfiles_apr.getText().toString()));
		tdocente.setCan_perfiles_rep(Integer.valueOf(editCan_perfiles_rep.getText().toString()));
		tdocente.setCorreo_d(editCorreo_d.getText().toString());
		tdocente.setNombres_d(editNombres_d.getText().toString());
		tdocente.setApellidos_d(editApellidos_d.getText().toString());
	
		
		

		helper.abrir();
		String estado = helper.actualizardocente(tdocente);
		helper.cerrar();

		Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();

	}


}
