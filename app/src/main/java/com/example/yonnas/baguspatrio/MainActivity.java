package com.example.yonnas.baguspatrio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle_login = getIntent().getExtras();
        TextView nama = (TextView) findViewById(R.id.user);
        nama.setText(bundle_login.getCharSequence("nama"));
    }

    public void btn1(View view) {
        Intent intent= new Intent(MainActivity.this,Main2Activity.class) ;
        startActivity(intent);
    }

    public void btn2(View view) {
        Intent intent= new Intent(MainActivity.this,Main3Activity.class) ;
        startActivity(intent);
    }

    public void adduser(View view) {
    }

    public void listuser(View view) {
    }
}
