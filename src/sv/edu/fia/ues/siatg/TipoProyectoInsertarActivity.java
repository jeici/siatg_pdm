package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class TipoProyectoInsertarActivity extends Activity {

	ControlBD helper;
	EditText editIdTipoProyecto;
	EditText editNombreProyecto;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo_proyecto_insertar);
		helper= new ControlBD(this);
		
		editIdTipoProyecto=(EditText) findViewById(R.id.editId_tipo_proy);
		editNombreProyecto=(EditText) findViewById(R.id.editNombre_pry);
		
		
	}
	public void insertarTipoProyecto(View v){
		String id_tipo_proy=editIdTipoProyecto.getText().toString();
		String nombre_pry= editNombreProyecto.getText().toString();
		String regInsertados;
	
		Ttipoproyecto tipoproy=new Ttipoproyecto();
		tipoproy.setIdTipoProy(id_tipo_proy);
		tipoproy.setNombre_pry(nombre_pry);
		
		helper.abrir();
		regInsertados=helper.insertar(tipoproy);
		helper.cerrar();
		Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
	}

	public void limpiarTexto(View v){
		editIdTipoProyecto.setText("");
		editNombreProyecto.setText("");
	}

}
