package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PerfilActualizarActivity extends Activity {

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
		setContentView(R.layout.activity_perfil_actualizar);
		helper = new ControlBD(this);
		editId_perfil = (EditText) findViewById(R.id.editId_perfil);
		editId_grupo_tg = (EditText) findViewById(R.id.editId_grupo_tg);
		editId_tg = (EditText) findViewById(R.id.editId_tg);
		editId_tipo_proy = (EditText) findViewById(R.id.editId_tipo_proy);
		editTema = (EditText) findViewById(R.id.editTema);
		editEstado = (EditText) findViewById(R.id.editEstado);
		editCarrera = (EditText) findViewById(R.id.editCarrera);
	}

	public void actualizarPerfil(View v) {
		Tperfil tperfil = new Tperfil();
		
		tperfil.setid_perfil(editId_perfil.getText().toString());
		tperfil.setid_grupo_tg(editId_grupo_tg.getText().toString());
		tperfil.setid_tg(editId_tg.getText().toString());
		tperfil.setid_tipo_proy(editId_tipo_proy.getText().toString());
		tperfil.settema(editTema.getText().toString());
		tperfil.setestado(editEstado.getText().toString());
		tperfil.setestado(editCarrera.getText().toString());
		
		

		helper.abrir();
		String estado = helper.actualizar(tperfil);
		helper.cerrar();

		Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();

	}

	public void limpiarTexto(View v) {

		editId_perfil.setText("");
		editId_grupo_tg.setText("");
		editId_tg.setText("");
		editId_tipo_proy.setText("");
		editTema.setText("");
		editEstado.setText("");
		editCarrera.setText("");
	}
}
