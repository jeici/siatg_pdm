package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AsesoriaInsertarActivity extends Activity {
	ControlBD helper;
	EditText editId_asesoria;
	EditText editId_tg;
	EditText editHora_asesoria;
	EditText editNum_asesoria;
	EditText editFecha_asesoria;
	EditText editObservacion_a;
	
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_asesoria_insertar);
	helper = new ControlBD(this);
	editId_asesoria = (EditText) findViewById(R.id.editId_asesoria);
	editId_tg = (EditText) findViewById(R.id.editId_tg);
	editHora_asesoria = (EditText) findViewById(R.id.editHora_asesoria);
	editNum_asesoria = (EditText) findViewById(R.id.editNum_asesoria);
	editFecha_asesoria = (EditText) findViewById(R.id.editFecha_asesoria);
	editObservacion_a =  (EditText) findViewById(R.id.editObservacion_a);
	}
	public void insertarAsesoria(View v) {
	String regInsertados;
	String id_asesoria=editId_asesoria.getText().toString();
	String id_tg=editId_tg.getText().toString();
	String hora_asesoria=editHora_asesoria.getText().toString();
	Integer num_asesoria=Integer.valueOf(editNum_asesoria.getText().toString());
	String fecha_asesoria=editFecha_asesoria.getText().toString();
	String observacion_a=editHora_asesoria.getText().toString();
	
	Tasesoria tasesoria= new Tasesoria();
	tasesoria.setid_asesoria(id_asesoria);
	tasesoria.setid_tg(id_tg);
	tasesoria.sethora_asesoria(hora_asesoria);
	tasesoria.setnum_asesoria(num_asesoria);
	tasesoria.setfecha_asesoria(fecha_asesoria);
    tasesoria.setobservacion_a(observacion_a);
	
	
	helper.abrir();
	regInsertados=helper.insertar(tasesoria);
	helper.cerrar();
	Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
}
	public void limpiarTexto(View v) {
		editId_asesoria.setText("");
		editId_tg.setText("");
		editHora_asesoria.setText("");
		editNum_asesoria.setText("");
		editFecha_asesoria.setText("");
		editObservacion_a.setText("");
	}
}



