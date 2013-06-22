package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class IntegranteGrupoActualizarActivity extends Activity {

	ControlBD helper;
	
	EditText editRepresentante;
	EditText editNota_final;
	EditText editId_integrante;
	EditText editId_grupo_tg;
	
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_integrante_grupo_actualizar);
		helper = new ControlBD(this);
		editRepresentante = (EditText) findViewById(R.id.editRepresentante);
		editNota_final = (EditText) findViewById(R.id.editNota_final);
		editId_integrante = (EditText) findViewById(R.id.editId_integrante);
		editId_grupo_tg = (EditText) findViewById(R.id.editId_grupo_tg);
		
	}

	public void actualizarIntegrante(View v) {
		Tintegrantegrupo tintegrante = new Tintegrantegrupo();
		
		tintegrante.setid_integrante(editRepresentante.getText().toString());
		tintegrante.setnota_final(Float.valueOf(editNota_final.getText().toString()));
		tintegrante.setid_integrante(editId_integrante.getText().toString());
		tintegrante.setid_grupo_tg(editId_grupo_tg.getText().toString());
		
		
		

		helper.abrir();
		String estado = helper.actualizar(tintegrante);
		helper.cerrar();

		Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();

	}

	public void limpiarTexto(View v) {

		editRepresentante.setText("");
		editNota_final.setText("");
		editId_integrante.setText("");
		editId_grupo_tg.setText("");
		
	}
}
