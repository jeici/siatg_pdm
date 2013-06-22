package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RevisionperfilInsertarActivity extends Activity {

	ControlBD helper;
	EditText editId_rev_perfil;
	EditText editIdperfil;
	EditText editIddocente;
	EditText editFecharev;
	EditText editObservacionrev;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_revisionperfil_insertar);
		helper = new ControlBD(this);
		editId_rev_perfil = (EditText) findViewById(R.id.editIdevisionperfilJC);
		editIdperfil = (EditText) findViewById(R.id.editIdperfilJC);
		editIddocente = (EditText) findViewById(R.id.editIdJC);
		editFecharev = (EditText) findViewById(R.id.editFecharevJC);
		editObservacionrev = (EditText) findViewById(R.id.editObservacionrevJC);
	}
	
	public void insertarRevisionperfil(View v) {
		String id_rev_perfil=editId_rev_perfil.getText().toString();
		String id_perfil=editIdperfil.getText().toString();
		String id_docente=editIddocente.getText().toString();
		String fecha_rev=editFecharev.getText().toString();
		String observacion_rev=editObservacionrev.getText().toString();
		
		String regInsertados;
		Trevisionperfil revperfil = new Trevisionperfil();
		revperfil.setId_rev_perfil(id_rev_perfil);
		revperfil.setId_perfil(id_perfil);
		revperfil.setId_docente(id_docente);
		revperfil.setFecha_rev(fecha_rev);
		revperfil.setObservacion_rev(observacion_rev);
			
		helper.abrir();
		regInsertados=helper.insertar(revperfil);
		helper.cerrar();
		Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
	}
	
	public void limpiarTexto(View v) {
		editId_rev_perfil.setText("");
		editIdperfil.setText("");
		editIddocente.setText("");
		editFecharev.setText("");
		editObservacionrev.setText("");
	}

}
