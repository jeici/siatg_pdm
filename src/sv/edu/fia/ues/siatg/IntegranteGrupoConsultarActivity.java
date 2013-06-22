package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class IntegranteGrupoConsultarActivity extends Activity {

	ControlBD helper;
	EditText editRepresentante;
	EditText editNota_final;
	EditText editId_integrante;
	EditText editId_grupo_tg;
	

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_integrante_grupo_consultar);
		helper = new ControlBD(this);
		
		editRepresentante = (EditText) findViewById(R.id.editRepresentante);
		editNota_final = (EditText) findViewById(R.id.editNota_final);
		editId_integrante = (EditText) findViewById(R.id.editId_integrante);
		editId_grupo_tg = (EditText) findViewById(R.id.editId_grupo_tg);
		
	}

	 public void consultarIntegrantegrupo(View v) {

		 helper.abrir();	 
		 Tintegrantegrupo tintegrante = helper.consultarintegrante(editId_integrante.getText().toString());
		 
		 helper.cerrar();
		 if(tintegrante == null)
			 Toast.makeText(this, "Perfil con ID " + editId_integrante.getText().toString() + 
					 " no encontrado", Toast.LENGTH_LONG).show();
		 else{
			 
			 editRepresentante.setText(tintegrante.getrepresentante());
			 editNota_final.setText(String.valueOf(tintegrante.getnota_final()));
			 editId_integrante.setText(tintegrante.getid_integrante());
			 editId_grupo_tg.setText(tintegrante.getid_grupo_tg());
			
		 }
	}
	
	public void limpiarTexto(View v){
		editRepresentante.setText("");
		editNota_final.setText("");
		editId_integrante.setText("");
		editId_grupo_tg.setText("");
		
	}
}

