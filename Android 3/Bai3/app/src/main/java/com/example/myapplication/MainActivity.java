package com.example.myapplication;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public int x=0;
    public int y=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        View touchMe=(View) findViewById(R.id.touchMe);
        touchMe.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    x=(int)event.getX();
                    y=(int)event.getY();
                    Toast.makeText(MainActivity.this, "Bạn vừa chạm vào điểm có tọa độ: ("+x+","+y+")", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
    }
}