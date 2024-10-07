package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public EditText Name,email,project;
    Button button_go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        IntentActivity2();
    }
    public void Init()
    {
        Name=findViewById(R.id.Name);
        email=findViewById(R.id.email);
        project=findViewById(R.id.project);
        button_go=findViewById(R.id.button_go);
    }
    public void IntentActivity2()
    {
        button_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* String name=Name.getText()+"";
                String Email=email.getText()+"";
                String Project=project.getText()+"";
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name);
                intent.putExtra("email",Email);
                intent.putExtra("project",Project);
                startActivity(intent);*/
                BundleData();
            }
        });
    }
    public void BundleData()
    {
        String name=Name.getText()+"";
        String Email=email.getText()+"";
        String Project=project.getText()+"";
        Intent intent= new Intent(MainActivity.this, MainActivity2.class);
        Bundle bundle=new Bundle();
        bundle.putString("name",name);
        bundle.putString("email",Email);
        bundle.putString("project",Project);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}