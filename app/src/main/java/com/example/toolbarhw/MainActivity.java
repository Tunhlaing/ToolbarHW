package com.example.toolbarhw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Toolbar tbMain;
    Button btAddStudent, btEnqStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbMain = findViewById(R.id.tbMain);
        btAddStudent = findViewById(R.id.btAddStudent);
        btEnqStudent = findViewById(R.id.btEnqStudent);
        setSupportActionBar(tbMain);
        getSupportActionBar().setTitle("Welcome !!!");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        btAddStudent.setOnClickListener(view -> {
            Intent i = new Intent(this,AddStudentActivity.class);
            startActivity(i);

        });
        btEnqStudent.setOnClickListener(view -> {
            Intent ii = new Intent(this,EnquiryStudentActivity.class);
            startActivity(ii);

        });




    }
}