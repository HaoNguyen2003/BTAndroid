package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button Call,Phonebook,SMS,LibraryImage,PlayMusic,Map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        fbutton();
    }
    public void Init()
    {
        Call=findViewById(R.id.Call);
        Phonebook=findViewById(R.id.Phonebook);
        SMS=findViewById(R.id.SMS);
        LibraryImage=findViewById(R.id.LibraryImage);
        PlayMusic=findViewById(R.id.PlayMusic);
        Map=findViewById(R.id.Map);
    }
    public void fbutton()
    {
        Call.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+84)123456789"));
            startActivity(intent);
        }
    });
        Phonebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
                startActivity(intent);
            }
        });

        SMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Intent.ACTION_SENDTO, Uri.parse("sms:5551234"));
                intent.putExtra("sms_body", "Thu bay nay di choi khong?");
                startActivity(intent);
            }
        });
        LibraryImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent();
                myIntent.setType("image/pictures/*");
                myIntent.setAction(Intent.ACTION_GET_CONTENT);
                startActivity(myIntent);
            }
        });
        PlayMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myActivity2 = new Intent("android.intent.action.MUSIC_PLAYER");
                startActivity(myActivity2);
            }
        });
        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://maps.google.com/maps?"+
                        "saddr=9.938083,-84.054430&daddr=9.926392,- 84.055964";
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}