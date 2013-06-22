package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RevisionperfilEliminarActivity extends Activity {

	EditText editIdrevperfil;
	ControlBD controlhelper;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_revisionperfil_eliminar);
		controlhelper=new ControlBD (this);
		editIdrevperfil = (EditText)findViewById(R.id.editIdJC);
	}
	public void eliminarRevisionperfil(View v){
		String regEliminadas;
		Trevisionperfil revisionperfil = new Trevisionperfil();
		revisionperfil.setId_rev_perfil(editIdrevperfil.getText().toString());
		controlhelper.abrir();
		regEliminadas=controlhelper.eliminar(revisionperfil);
		controlhelper.cerrar();
		Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
	}

}
