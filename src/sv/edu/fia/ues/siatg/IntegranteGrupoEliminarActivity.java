package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class IntegranteGrupoEliminarActivity extends Activity {
	EditText editId_integrante;
	ControlBD controlhelper;
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_integrante_grupo_eliminar);
	controlhelper=new ControlBD (this);
	editId_integrante=(EditText)findViewById(R.id.editId_integrante);
}
public void eliminarIntegrante(View v){
	String regEliminadas;
	Tintegrantegrupo tintegrante=new Tintegrantegrupo();
	tintegrante.setid_integrante(editId_integrante.getText().toString());
	controlhelper.abrir();
	regEliminadas=controlhelper.eliminar(tintegrante);
	controlhelper.cerrar();
	Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
}
}