package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class GrupoTGInsertarActivity extends Activity {
	ControlBD helper;
	EditText editId_grupo_tg;
	EditText editAnio;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grupo_tginsertar);
		helper = new ControlBD(this);
		editId_grupo_tg = (EditText) findViewById(R.id.editId_grupo_tg);
		editAnio = (EditText) findViewById(R.id.editAnio);
			}

	public void insertargrupotg(View v) {
		String id_grupo_tg = editId_grupo_tg.getText().toString();
		String anio =editAnio.getText().toString();
		
		String regInsertados;
			
			Tgrupotg tgrupotg = new Tgrupotg();
			tgrupotg.setId_grupo_tg(id_grupo_tg);
			tgrupotg.setAnio(anio);
			
						
			helper.abrir();
			regInsertados=helper.insertargrupotg(tgrupotg);
			helper.cerrar();
			Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
	}



	public void limpiarTexto(View v) {

		editId_grupo_tg.setText("");
		editAnio.setText("");
		
	}
}
