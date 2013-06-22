package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PerfilEliminarActivity extends Activity {
	EditText editId_perfil;
	ControlBD controlhelper;
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_perfil_eliminar);
	controlhelper=new ControlBD (this);
	editId_perfil=(EditText)findViewById(R.id.editId_perfil);
}
public void eliminarPerfil(View v){
	String regEliminadas;
	Tperfil tperfil=new Tperfil();
	tperfil.setid_perfil(editId_perfil.getText().toString());
	controlhelper.abrir();
	regEliminadas=controlhelper.eliminar(tperfil);
	controlhelper.cerrar();
	Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
}
}