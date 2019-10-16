package com.febrianwulandari.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    Button tambah, kurang, kali, bagi ;
    TextView tampilan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.angka1);
        input2 = (EditText) findViewById(R.id.angka2);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        tampilan = (TextView) findViewById(R.id.tampilan);


    }

    public void tambah(View view) {
        double angka1 = Double.parseDouble(input1.getText().toString());
        double angka2 = Double.parseDouble(input2.getText().toString());
        double result = angka1 + angka2;
        tampilan.setText(Double.toString(result));


    }

    public void kurang(View view) {
        double angka1 = Double.parseDouble(input1.getText().toString());
        double angka2 = Double.parseDouble(input2.getText().toString());
        double result = angka1 - angka2;
        tampilan.setText(Double.toString(result));

    }

    public void kali(View view) {
        double angka1 = Double.parseDouble(input1.getText().toString());
        double angka2 = Double.parseDouble(input2.getText().toString());
        double result = angka1 * angka2;
        tampilan.setText(Double.toString(result));
    }

    public void bagi(View view) {
        double angka1 = Double.parseDouble(input1.getText().toString());
        double angka2 = Double.parseDouble(input2.getText().toString());
        double result = angka1 / angka2;
        tampilan.setText(Double.toString(result));
    }

    public void reset(View view) {
        double angka1 = 0;
        double angka2 = 0;
        double result = angka1 * angka2;
        tampilan.setText(Double.toString(result));
    }
}
