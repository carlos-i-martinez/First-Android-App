package demo.androidprek.MyGreatApp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MyGreatApp extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awesome);
        
        Toast.makeText(getApplicationContext(), "this WILL be my CAR", Toast.LENGTH_LONG).show();
        
    }
}