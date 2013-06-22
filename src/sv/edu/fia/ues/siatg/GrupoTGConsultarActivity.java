package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class GrupoTGConsultarActivity extends Activity {
	ControlBD helper;
	EditText editId_grupo_tg;
	EditText editAnio;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grupo_tgconsultar);
		helper = new ControlBD(this);
		editId_grupo_tg = (EditText) findViewById(R.id.editId_grupo_gt);
		editAnio = (EditText) findViewById(R.id.editAnio);
	}

	 public void consultargrupotg(View v) {

		 helper.abrir();	 
		 Tgrupotg tgrupotg = helper.consultargrupotg(editId_grupo_tg.getText().toString());
		 
		 helper.cerrar();
		 if(tgrupotg == null)
			 Toast.makeText(this, "Docente con ID " + editId_grupo_tg.getText().toString() + 
					 " no encontrado", Toast.LENGTH_LONG).show();
		 else{
			
			 editId_grupo_tg.setText(tgrupotg.getId_grupo_tg());
			 editAnio.setText(tgrupotg.getAnio());
			 					
			 
		 }
	}
	 public void limpiarTexto(View v) {

			editId_grupo_tg.setText("");
			editAnio.setText("");
			
		}

	

}
