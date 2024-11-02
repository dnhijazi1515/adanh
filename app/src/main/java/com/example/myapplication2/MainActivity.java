package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etName,etYear;
    private TextView tvShowDetails;
    private String name,details;
    private int year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.etName);
        etYear=findViewById(R.id.etYear);
        tvShowDetails=findViewById(R.id.tvShowDetails);

    }
    public void shoDetails(View view){
        if(etName.getText().toString().isEmpty() || etYear.getText().toString().isEmpty()){
            Toast.makeText(this,"Please fill in fields..",Toast.LENGTH_LONG).show();
        }
        else {
            name=etName.getText().toString();
            year=Integer.parseInt(etYear.getText().toString());
            int age=2024-year;
            details="Welcome "+name+"\nYour age is "+age+" years";
            tvShowDetails.setText(details);
        }
    }
}