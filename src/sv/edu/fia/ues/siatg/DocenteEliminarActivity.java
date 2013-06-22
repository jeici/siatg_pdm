package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DocenteEliminarActivity extends Activity {
EditText editId_docente;
ControlBD helper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_docente_eliminar);
		helper=new ControlBD (this);
		editId_docente=(EditText)findViewById(R.id.editId_docente);
	}

	public void eliminardocente(View v){
		String regEliminadas;
		Tdocente docente=new Tdocente();
		docente.setId_docente(editId_docente.getText().toString());
		helper.abrir();
		regEliminadas=helper.eliminardocente(docente);
		helper.cerrar();
		Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
	}

}
