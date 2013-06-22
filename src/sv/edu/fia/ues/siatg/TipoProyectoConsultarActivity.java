package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class TipoProyectoConsultarActivity extends Activity {

	ControlBD helper;
	EditText editIdTipoProy;
	EditText editNomProy;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo_proyecto_consultar);
		helper= new ControlBD(this);
		
		editIdTipoProy= (EditText) findViewById(R.id.editIdTipoProyecto);
		editNomProy=(EditText) findViewById(R.id.editNombrePry);
	
	}

	public void consultarTipoProyecto(View v){
		helper.abrir();
		
		Ttipoproyecto tipoProy =helper.consultarTipoProyecto(editIdTipoProy.getText().toString());
		
		helper.cerrar();
		
		if(tipoProy == null){
			Toast.makeText(this,"Tipo Proyecto con id: "+ editIdTipoProy.getText().toString() +"no encontrado", Toast.LENGTH_SHORT).show();
		}else{
			editIdTipoProy.setText(tipoProy.getIdTipoProy());
			editNomProy.setText(tipoProy.getNombre_pry());
		}
	}
	
	public void limpiarTexto(View v){
		editIdTipoProy.setText("");
		editNomProy.setText("");
	}

}