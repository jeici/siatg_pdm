package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class IntegranteGrupoInsertarActivity extends Activity {

	ControlBD helper;
	EditText editRepresentante;
	EditText editNota_final;
	EditText editId_integrante;
	EditText editId_grupo_tg;

public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_integrante_grupo_insertar);
	
	helper = new ControlBD(this);
	editRepresentante = (EditText) findViewById(R.id.editRepresentante);
	editNota_final = (EditText) findViewById(R.id.editNota_final);
	editId_integrante = (EditText) findViewById(R.id.editId_integrante);
	editId_grupo_tg = (EditText) findViewById(R.id.editId_grupo_tg);
}
public void insertarIntegrantegrupo(View v) {
	
	
	String representante=editRepresentante.getText().toString();
	Float nota_final=Float.valueOf(editNota_final.getText().toString());
	String id_integrante=editId_integrante.getText().toString();
	String id_grupo_tg=editId_grupo_tg.getText().toString();
	String regInsertados;
	
	Tintegrantegrupo tintegrantegrupo= new Tintegrantegrupo();
	tintegrantegrupo.setrepresentante(representante);
	tintegrantegrupo.setnota_final(nota_final);
	tintegrantegrupo.setid_integrante(id_integrante);
	tintegrantegrupo.setid_grupo_tg(id_grupo_tg);
	
	
	
	helper.abrir();
	regInsertados=helper.insertar(tintegrantegrupo);
	helper.cerrar();
	Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
}

public void limpiarTexto(View v) {

	editRepresentante.setText("");
	editNota_final.setText("");
	editId_integrante.setText("");
	editId_grupo_tg.setText("");
	}
}
