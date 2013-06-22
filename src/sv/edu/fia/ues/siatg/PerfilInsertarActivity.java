package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PerfilInsertarActivity extends Activity {

	ControlBD helper;
	EditText editId_perfil;
	EditText editId_grupo_tg;
	EditText editId_tg;
	EditText editId_tipo_proy;
	EditText editTema;
	EditText editEstado;
	EditText editCarrera;
	
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_perfil_insertar);
	helper = new ControlBD(this);
	editId_perfil = (EditText) findViewById(R.id.editId_perfil);
	editId_grupo_tg = (EditText) findViewById(R.id.editId_grupo_tg);
	editId_tg = (EditText) findViewById(R.id.editId_tg);
	editId_tipo_proy = (EditText) findViewById(R.id.editId_tipo_proy);
	editTema = (EditText) findViewById(R.id.editTema);
	editEstado = (EditText) findViewById(R.id.editEstado);
	editCarrera = (EditText) findViewById(R.id.editCarrera);
}
public void insertarPerfil(View v) {
	String id_perfil = editId_perfil.getText().toString();
	String id_grupo_tg = editId_grupo_tg.getText().toString();
	String id_tg =editId_tg.getText().toString();
	String id_tipo_proy=editId_tipo_proy.getText().toString();
	String tema = editTema.getText().toString();
	String estado =editEstado.getText().toString();
	String carrera =editCarrera.getText().toString();
	String regInsertados;
		
		Tperfil tperfil = new Tperfil();
		tperfil.setid_perfil(id_perfil);
		tperfil.setid_grupo_tg(id_grupo_tg);
		tperfil.setid_tg(id_tg);
		tperfil.setid_tipo_proy(id_tipo_proy);
		tperfil.settema(tema);
		tperfil.setestado(estado);
		tperfil.setcarrera(carrera);
	
				
		helper.abrir();
		regInsertados=helper.insertar(tperfil);
		helper.cerrar();
		Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
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
