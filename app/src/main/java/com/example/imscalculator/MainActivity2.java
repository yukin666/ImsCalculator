package com.example.imscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void calcular(View view){
        EditText et1 = (EditText) findViewById(R.id.editAltura);
        EditText et2 = (EditText) findViewById(R.id.editIdade);
        EditText et3 = (EditText) findViewById(R.id.editPeso);
        Intent intent1 = new Intent(this, ResultActivity3.class);
        intent1.putExtra("altura", et1.getText().toString());
        intent1.putExtra("peso", et3.getText().toString());
        intent1.putExtra("idade", et2.getText().toString());
        startActivity(intent1);
    }
    public void voltar1(View view){
        Intent intent3 = new Intent(this,MainActivity.class);
        startActivity(intent3);

    }


}