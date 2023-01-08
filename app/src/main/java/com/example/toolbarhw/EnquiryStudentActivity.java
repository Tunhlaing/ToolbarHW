package com.example.toolbarhw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class EnquiryStudentActivity extends AppCompatActivity {
    Toolbar tbEnq;
    TextView tvEnq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enquiry_student);
        tvEnq = findViewById(R.id.tvEnq);
        tbEnq = findViewById(R.id.tbEnq);

        setSupportActionBar(tbEnq);

        getSupportActionBar().setTitle("Enquiry Student");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
}