package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TipoProyectoEliminarActivity extends Activity {

	EditText editIdTipoProyecto;
	ControlBD controlhelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo_proyecto_eliminar);
		controlhelper= new ControlBD (this);
		editIdTipoProyecto=(EditText) findViewById(R.id.editIdTipoProyecto);
		
	}
	
	public void eliminarTipoProyecto(View v){
		String regEliminadas;
		Ttipoproyecto tipoproy=new Ttipoproyecto();
		tipoproy.setIdTipoProy(editIdTipoProyecto.getText().toString());
		controlhelper.abrir();
		regEliminadas=controlhelper.eliminarTipoProyecto(tipoproy);
		controlhelper.cerrar();
		Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
		
	}

	
}
