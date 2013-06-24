package sv.edu.fia.ues.siatg;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ZXingDemoActivity extends Activity {
	
	private Button btnQR;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zxing_demo);
        
        btnQR = (Button)findViewById(R.id.btn_qr);
        btnQR.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("com.google.zxing.client.android.SCAN");
		        intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
		        startActivityForResult(intent, 0); 				
			}
        	
        });
    }
    
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
 	   if (requestCode == 0) {
 	      if (resultCode == RESULT_OK) {
 	         String contents = intent.getStringExtra("SCAN_RESULT");
 	         //String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
 	         // Handle successful scan
 	        if(contents.equals("http://ls04016pdm115.site40.net/ws_recuperar_docentes.php")){
 	        	Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://ls04016pdm115.site40.net/ws_recuperar_docentes.php"));
 	        	startActivity(viewIntent);
 	        	
 	        		
 	        	/*Intent i = new Intent(Intent.ACTION_VIEW);
 	        	intent.setData(Uri.parse("http://www.google.es"));
 	        	//Intent i = new Intent(ZXingDemoActivity.this, Logo.class);*/
 	        	//startActivity(i);  
 	         }else{ 
 	        	 ////segunda opcion
 	        	 
 	        	Intent i = new Intent(ZXingDemoActivity.this, Logo.class);
 	        	startActivity(i);   	 
 	         }
 	       
 	        
 	      } else if (resultCode == RESULT_CANCELED) {
 	         // Handle cancel
 	      }
 	   }
 	}
}