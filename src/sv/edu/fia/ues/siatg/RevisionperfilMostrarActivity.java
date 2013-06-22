package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RevisionperfilMostrarActivity extends Activity {

	ControlBD helper;
	EditText editIdrevperfil;
	EditText editIdperfil;
	EditText editIddocente;
	EditText editFecharev;
	EditText editObservacionrev;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_revisionperfil_mostrar);
		helper = new ControlBD(this);
		editIdrevperfil = (EditText) findViewById(R.id.editIdJC);
		editIdperfil = (EditText) findViewById(R.id.editIdperfilJC);
		editIddocente = (EditText) findViewById(R.id.editIddocenteJC);
		editFecharev = (EditText) findViewById(R.id.editFecharevJC);
		editObservacionrev = (EditText) findViewById(R.id.editObservacionrevJC);
	}
	
	public void consultarRevisionperfil(View v) {
		helper.abrir();
		Trevisionperfil trevisionperfil = helper.consultarrevisionperfil(editIdrevperfil.getText().toString());
		helper.cerrar();
		if(trevisionperfil == null)
			Toast.makeText(this, "Codigo revision perfil " + 
			editIdrevperfil.getText().toString() + 
			" no encontrado", Toast.LENGTH_LONG).show();
		else{
			editIdperfil.setText(""+trevisionperfil.getId_perfil());
			editIddocente.setText(trevisionperfil.getId_docente());
			editFecharev.setText(trevisionperfil.getFecha_rev());
			editObservacionrev.setText(trevisionperfil.getObservacion_rev());
		}
	}
	public void limpiarTexto(View v){
		editIdrevperfil.setText("");
		editIdperfil.setText("");
		editIddocente.setText("");
		editFecharev.setText("");
		editObservacionrev.setText("");
	}
}
