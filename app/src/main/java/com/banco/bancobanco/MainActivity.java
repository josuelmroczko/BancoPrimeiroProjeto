package com.banco.bancobanco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edit_dinheiro;
    private Button bt_sacar;
    private TextView saldo;

    double saldoEmConta = 3000.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        IniciarComponentes(); //iniciando metodo tratado

        getSupportActionBar().hide();
       saldo.setText("Saldo em conta;" + "$" + saldoEmConta );

    //Evendo de click no botao
    bt_sacar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Double dinheiro;
            dinheiro = Double.parseDouble(edit_dinheiro.getText().toString());

            if (dinheiro <20 ) {
                Toast.makeText(MainActivity.this, "digite um valor maior",Toast.LENGTH_SHORT).show();
            }else if (dinheiro == 20 ){
                saldoEmConta -= dinheiro;
                saldo.setText("Saldo em conta:" + "R$" + saldoEmConta);
                Toast.makeText(MainActivity.this, "20,00 Reais sacados",Toast.LENGTH_SHORT).show();
            }else if (dinheiro ==50){
                saldoEmConta -= dinheiro;
                saldo.setText("Saldo em conta:" + "R$" + saldoEmConta);
                Toast.makeText(MainActivity.this, "50,00 Reais sacados",Toast.LENGTH_SHORT).show();
            }else if ( dinheiro == 100 ){
                saldoEmConta -= dinheiro;
                saldo.setText("Saldo em conta:" + "R$" + saldoEmConta);
                Toast.makeText(MainActivity.this, "100,00 Reais sacados",Toast.LENGTH_SHORT).show();
            }else{
                saldoEmConta -= dinheiro;
                saldo.setText("Saldo em conta:" + "R$" + saldoEmConta);
                    Toast.makeText(MainActivity.this,+ dinheiro + "0" + " Reais sacados ",Toast.LENGTH_SHORT).show();


            }
        }
    });
    }

    private void IniciarComponentes (){
        edit_dinheiro = findViewById(R.id.edit_dinheiro);
        bt_sacar = findViewById(R.id.bt_sacar);
        saldo = findViewById(R.id.saldo);

    }
}