package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RevisionperfilModificarActivity extends Activity {

	ControlBD helper;
	EditText editId_rev_perfil;
	EditText editIdperfil;
	EditText editIddocente;
	EditText editFecharev;
	EditText editObservacionrev;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_revisionperfil_modificar);
		helper = new ControlBD(this);
		editId_rev_perfil = (EditText) findViewById(R.id.editIdevisionperfilJC);
		editIdperfil = (EditText) findViewById(R.id.editIdperfilJC);
		editIddocente = (EditText) findViewById(R.id.editIdJC);
		editFecharev = (EditText) findViewById(R.id.editFecharevJC);
		editObservacionrev = (EditText) findViewById(R.id.editObservacionrevJC);
	}
	public void modificarRevisionperfil(View v) {
		Trevisionperfil revperfil = new Trevisionperfil();
		revperfil.setId_rev_perfil(editId_rev_perfil.getText().toString());
		revperfil.setId_perfil(editIdperfil.getText().toString());
		revperfil.setId_docente(editIddocente.getText().toString());
		revperfil.setFecha_rev(editFecharev.getText().toString());
		revperfil.setObservacion_rev(editObservacionrev.getText().toString());
		helper.abrir();
		String estado = helper.actualizar(revperfil);
		helper.cerrar();
		Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();
	}
	public void limpiarTexto(View v) {
		editId_rev_perfil.setText("");
		editIdperfil.setText("");
		editIddocente.setText("");
		editFecharev.setText("");
		editObservacionrev.setText("");
	}
}
