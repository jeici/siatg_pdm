package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PerfilConsultarActivity extends Activity {

	ControlBD helper;
	EditText editId_perfil;
	EditText editId_grupo_tg;
	EditText editId_tg;
	EditText editId_tipo_proy;
	EditText editTema;
	EditText editEstado;
	EditText editCarrera;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_perfil_consultar);
		helper = new ControlBD(this);
		
		editId_perfil = (EditText) findViewById(R.id.editId_perfil);
		editId_grupo_tg = (EditText) findViewById(R.id.editId_grupo_tg);
		editId_tg = (EditText) findViewById(R.id.editId_tg);
		editId_tipo_proy = (EditText) findViewById(R.id.editId_tipo_proy);
		editTema = (EditText) findViewById(R.id.editTema);
		editEstado= (EditText) findViewById(R.id.editEstado);
		editCarrera = (EditText) findViewById(R.id.editCarrera);
	}

	 public void consultarTperfil(View v) {

		 helper.abrir();	 
		 Tperfil tperfil = helper.consultarperfil(editId_perfil.getText().toString());
		 
		 helper.cerrar();
		 if(tperfil == null)
			 Toast.makeText(this, "Perfil con ID " + editId_perfil.getText().toString() + 
					 " no encontrado", Toast.LENGTH_LONG).show();
		 else{
			 
			 editId_perfil.setText(tperfil.getid_perfil());
			 editId_grupo_tg.setText(tperfil.getid_grupo_tg());
			 editId_tg.setText(tperfil.getid_tg());
			 editId_tipo_proy.setText(tperfil.getid_tipo_ptoy());
			 editTema.setText(tperfil.gettema());
			 editEstado.setText(tperfil.getestado());
			 editCarrera.setText(tperfil.getcarrera());
			 
		 }
	}
	
	public void limpiarTexto(View v){
		editId_perfil.setText("");
		editId_grupo_tg.setText("");
		editId_tg.setText("");
		editId_tipo_proy.setText("");
		editTema.setText("");
		editEstado.setText("");
		editCarrera.setText("");
	}
}

