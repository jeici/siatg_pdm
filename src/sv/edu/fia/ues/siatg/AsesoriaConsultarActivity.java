package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AsesoriaConsultarActivity extends Activity {

	ControlBD helper;
	EditText editId_asesoria;
	EditText editId_tg;
	EditText editHora_asesoria;
	EditText editNum_asesoria;
	EditText editFecha_asesoria;
	EditText editObservacion_a;
	

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_asesoria_consultar);
		helper = new ControlBD(this);
		
		editId_asesoria = (EditText) findViewById(R.id.editId_asesoria);
		editId_tg = (EditText) findViewById(R.id.editId_tg);
		editHora_asesoria = (EditText) findViewById(R.id.editHora_asesoria);
		editNum_asesoria= (EditText) findViewById(R.id.editNum_asesoria);
		editFecha_asesoria= (EditText) findViewById(R.id.editFecha_asesoria);
		editObservacion_a = (EditText) findViewById(R.id.editObservacion_a);
	}

	 public void consultarTasesoria(View v) {

		 helper.abrir();	 
		 Tasesoria tasesoria = helper.consultarAsesoria(editId_asesoria.getText().toString());
		 
		 helper.cerrar();
		 if(tasesoria== null)
			 Toast.makeText(this, "Asesoria con ID " + editId_asesoria.getText().toString() + 
					 " no encontrado", Toast.LENGTH_LONG).show();
		 else{
			 
			 editId_asesoria.setText(tasesoria.getid_asesoria());		 
			 editId_tg.setText(tasesoria.getid_tg());
			 editHora_asesoria.setText(tasesoria.gethora_asesoria());
			 editNum_asesoria.setText(tasesoria.getnum_asesoria());
			 editFecha_asesoria.setText(tasesoria.getfecha_asesoria());
			 editObservacion_a.setText(tasesoria.getobservacion_a());
			 
		 }
	}
	
	public void limpiarTexto(View v){
		editId_asesoria.setText("");
		editId_tg.setText("");
		editHora_asesoria.setText("");
		editNum_asesoria.setText("");
		editFecha_asesoria.setText("");
		editObservacion_a.setText("");
	}
}

