package com.example.myapplication;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText InputName=(EditText) findViewById(R.id.inputname);
        InputName.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(event.getAction()==KeyEvent.ACTION_DOWN&&keyCode==KeyEvent.KEYCODE_ENTER){
                    String text=InputName.getText().toString();
                    Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
    }
}