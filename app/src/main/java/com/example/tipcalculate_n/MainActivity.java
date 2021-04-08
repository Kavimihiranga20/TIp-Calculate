package com.example.tipcalculate_n;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TipCalculator tipCalc;

    public NumberFormat money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        tipCalc = new TipCalculator(0.2f,100.0f);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v)
    {
        EditText billEditText=(EditText) findViewById(R.id.amount_bill_hint);
        EditText tipEditText=(EditText) findViewById(R.id.amount_tip_percent_hint);

        String billString= billEditText.getText().toString();
        String tipString=tipEditText.getText().toString();

        TextView tipTextView=(TextView) findViewById(R.id.amount_tip);
        TextView totalTextView=(TextView) findViewById(R.id.amount_total);

        try {
            float billAmount = Float.parseFloat(billString);
            float tipPrecentabe = Float.parseFloat(tipString);

            tipCalc.setBill(billAmount);
            tipCalc.setTip(0.01f * tipPrecentabe);

            float tip = tipCalc.tipAmount();
            float amount = tipCalc.totalAmount();

            tipEditText.setText(money.format(tip));
            totalTextView.setText(money.format(amount));

        }catch (NumberFormatException nfe){

        }





        }








    }


