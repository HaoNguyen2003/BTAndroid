package com.example.myapplication;
import android.graphics.Color;
import static com.example.myapplication.R.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  /*implements View.OnClickListener*/{
    public boolean isRed = false;
    private View.OnClickListener corkyListener= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView textView=findViewById(id.textHello);
            Toast.makeText(MainActivity.this,"bạn đã click vào button",Toast.LENGTH_SHORT).show();
            if(!isRed){
                textView.setTextColor(Color.RED);
                isRed=true;
            }
            else{
                textView.setTextColor(Color.BLACK);
                isRed=false;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(corkyListener);
    }
    /*@Override
    public void onClick(View v) {
        TextView textView=findViewById(id.textHello);
        Toast.makeText(MainActivity.this,"bạn đã click vào button",Toast.LENGTH_SHORT).show();
        if(!isRed){
            textView.setTextColor(Color.RED);
            isRed=true;
        }
        else{
            textView.setTextColor(Color.BLACK);
            isRed=false;
        }
    }*/
}