package com.farhad.howoldami;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myAge(View view) {
        edt = findViewById(R.id.edt);
        tv = findViewById(R.id.tv);
        int age = Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(edt.getText().toString());
        tv.setText("Your age is: "+age);
    }
}
