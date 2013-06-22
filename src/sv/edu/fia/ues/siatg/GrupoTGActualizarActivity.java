package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class GrupoTGActualizarActivity extends Activity {
	ControlBD helper;
	EditText editId_grupo_tg;
	EditText editAnio;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grupo_tgactualizar);
		helper = new ControlBD(this);
		editId_grupo_tg = (EditText) findViewById(R.id.editId_grupo_tg);
		editAnio = (EditText) findViewById(R.id.editAnio);
		
	}


public void actualizargrupotg(View v) {
	Tgrupotg tgrupotg= new Tgrupotg();
	
	tgrupotg.setId_grupo_tg(editId_grupo_tg.getText().toString());
	tgrupotg.setAnio(editAnio.getText().toString());
	
	
	

	helper.abrir();
	String estado = helper.actualizargrupotg(tgrupotg);
	helper.cerrar();

	Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();

}


}
