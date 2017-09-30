package com.example.norma.idiomasstilosvrciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText num1, num2;
    Button sum, res, mul, div;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        sum= (Button) findViewById(R.id.sumando);
        res=(Button) findViewById(R.id.restando);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        resultado= (TextView) findViewById(R.id.resultado);

        sum.setOnClickListener(this);
        res.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

        if (savedInstanceState != null){
            resultado.setText(savedInstanceState.getString("valor"));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("valor", (String)resultado.getText());

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View view) {
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);

        int respuesta=0;

        switch (view.getId()){
            case R.id.sumando:
                respuesta=entero1+entero2;
                break;
            case R.id.restando:
                respuesta=entero1-entero2;
                break;
            case R.id.mul:
                respuesta=entero1*entero2;
                break;
            case R.id.div:
                respuesta=entero1/entero2;
                break;
        }
          resultado.setText("" + respuesta);

    }
}
