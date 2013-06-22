package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TipoProyectoActualizarActivity extends Activity {

	ControlBD helper;
	EditText editIdTipoProyecto;
	EditText editNombreProyecto;
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo_proyecto_actualizar);
		helper= new ControlBD(this);
		editIdTipoProyecto= (EditText) findViewById(R.id.editIdTipoProyecto);
		editNombreProyecto=(EditText) findViewById(R.id.editNombrePry);
	}

	public void actualizarTipoProyecto(View v){
		Ttipoproyecto tipoproy =new Ttipoproyecto();
		tipoproy.setIdTipoProy(editIdTipoProyecto.getText().toString());
		tipoproy.setNombre_pry(editNombreProyecto.getText().toString());
		helper.abrir();
		String estado= helper.actualizar(tipoproy);
		helper.cerrar();
		
		Toast.makeText(this,estado,Toast.LENGTH_SHORT).show();
		
	}
	
	public void limpiarTexto(View v){
		editIdTipoProyecto.setText("");
		editNombreProyecto.setText("");
	}
}
