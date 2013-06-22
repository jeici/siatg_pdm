package sv.edu.fia.ues.siatg;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class GrupoTGEliminarActivity extends Activity {
	EditText editId_grupo_tg;
	ControlBD helper;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grupo_tgeliminar);
		helper=new ControlBD (this);
		editId_grupo_tg=(EditText)findViewById(R.id.editId_grupo_gt);

	}

	public void eliminargrupotg(View v){
		String regEliminadas;
		Tgrupotg grupotg = new Tgrupotg();
		grupotg.setId_grupo_tg(editId_grupo_tg.getText().toString());
		helper.abrir();
		regEliminadas=helper.eliminargrupotg(grupotg);
		helper.cerrar();
		Toast.makeText(this, regEliminadas, Toast.LENGTH_SHORT).show();
	}

}
