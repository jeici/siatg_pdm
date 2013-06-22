package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DefensaEliminarActivity extends Activity {

	EditText editId_defensa;
	ControlBD controlhelper;
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_defensa_eliminar);
	controlhelper=new ControlBD (this);
	editId_defensa=(EditText)findViewById(R.id.editId_defensa);
}
public void eliminarDefensa(View v){
	String regEliminadas;
	Tdefensa defensa=new Tdefensa();
	defensa.setId_defensa(editId_defensa.getText().toString());
	controlhelper.abrir();
	regEliminadas=controlhelper.eliminar(defensa);
	controlhelper.cerrar();
	Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
}

}
