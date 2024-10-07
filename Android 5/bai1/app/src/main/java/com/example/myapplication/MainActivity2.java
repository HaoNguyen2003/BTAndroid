package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView textView_name;
    TextView textView_email;
    TextView textView_project;
    Button  button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Init();
        //getData();
        getDataBundle();
        returnActivity();
    }
    public void Init()
    {
        textView_name=findViewById(R.id.textView_name);
        textView_email=findViewById(R.id.textView_email);
        textView_project=findViewById(R.id.textView_project);
        button=findViewById(R.id.button);
    }
    public void getData()
    {
        Intent intent=getIntent();
        if(intent!=null)
        {
            String name=intent.getStringExtra("name");
            String email=intent.getStringExtra("email");
            String project=intent.getStringExtra("project");
            textView_name.setText(name);
            textView_email.setText(email);
            textView_project.setText(project);
        }
    }
    public void returnActivity()
    {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void getDataBundle()
    {
        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("name");
        String email=bundle.getString("email");
        String project=bundle.getString("project");
        textView_name.setText(name);
        textView_email.setText(email);
        textView_project.setText(project);
    }
}