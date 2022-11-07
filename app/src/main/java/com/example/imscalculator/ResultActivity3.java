package com.example.imscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result3);
        TextView resultImc = (TextView) findViewById(R.id.textViewImc);
        TextView resultMeta = (TextView) findViewById(R.id.textViewMeta);
        TextView Diagnostico = (TextView) findViewById(R.id.textViewDiag);
        TextView Sedentario = (TextView) findViewById(R.id.textViewSedentario);
        TextView Ativo = (TextView) findViewById(R.id.textViewAtivo);
        TextView MuiAtivo = (TextView) findViewById(R.id.textViewMuiAtivo);
        Float   fltIdade;
        Double dblAltura, dblPeso,dblresult,dblmeta,dblSedentario,dblAtivo,dblMuiAtivo;
        Intent intent2 = getIntent();

        dblAltura = Double.parseDouble(intent2.getStringExtra("altura"));
        dblPeso = Double.parseDouble(intent2.getStringExtra("peso"));
        fltIdade = Float.parseFloat(intent2.getStringExtra("idade"));

        dblresult = Math.ceil(dblPeso /(dblAltura*dblAltura));
        dblmeta =Math.ceil((13.8*dblPeso)+(5 * dblAltura)-(6.8*fltIdade)+66);
        dblSedentario = Math.ceil(dblmeta*1.2);
        dblAtivo = Math.ceil(dblmeta*1.5);
        dblMuiAtivo = Math.ceil(dblmeta*1.9);

        resultImc.setText(dblresult.toString());
        resultMeta.setText(dblmeta.toString());

        try{

            if(dblresult < 18){

                Diagnostico.setText("magreza ");

            }else if(dblresult >= 18 && dblresult <= 25  ){

                Diagnostico.setText("normal");

            }else if(dblresult > 25 && dblresult<= 30 ){

                Diagnostico.setText("sobrepeso");

            }else if(dblresult > 30 && dblresult<= 40){

                Diagnostico.setText("obesidade");

            }else if(dblresult > 40){

                Diagnostico.setText("obesidade mórbida");

            }

        } catch (Exception e) {
            Diagnostico.setText("erro");
        }
        Sedentario.setText(dblSedentario.toString());
        Ativo.setText(dblAtivo.toString());
        MuiAtivo.setText(dblMuiAtivo.toString());
    }
    public void voltar2(View view){
        Intent intent4 = new Intent(this,MainActivity2.class);
        startActivity(intent4);
    }


}