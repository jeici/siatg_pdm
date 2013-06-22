package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DetalleNotaEliminarActivity extends Activity {

	ControlBD controlhelper;
	EditText editId_defensa;
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_detalle_nota_eliminar);
	controlhelper=new ControlBD(this);
	editId_defensa=(EditText)findViewById(R.id.editId_defensa);
}
public void eliminarDetalleNota(View v){
	String regEliminadas;
	DetalleNota detallenota=new DetalleNota();
	detallenota.setId_defensa(editId_defensa.getText().toString());
	controlhelper.abrir();
	regEliminadas=controlhelper.eliminar(detallenota);
	controlhelper.cerrar();
	Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
}

}
