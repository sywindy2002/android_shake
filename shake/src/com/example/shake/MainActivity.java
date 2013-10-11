package com.example.shake;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.app.Activity;   
import android.os.Bundle;   
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import android.hardware.SensorEventListener;
import android.hardware.SensorListener;
import android.hardware.SensorManager;   
import android.hardware.Sensor;   
public class MainActivity extends Activity  {   
    private TextView TV;
    protected void onCreate(Bundle savedInstanceState) {   
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main);
       TV = (TextView)findViewById(R.id.textview);
        
        ShakeListener mShaker = new ShakeListener(this);  
        mShaker.setOnShakeListener(new ShakeListener.OnShakeListener() {  
            public void onShake() {  
                // action while shaking  
            	System.out.println("shaked***************");
            	TV.setText("~On Shake!~");
            }  
        });  
	}
 
}