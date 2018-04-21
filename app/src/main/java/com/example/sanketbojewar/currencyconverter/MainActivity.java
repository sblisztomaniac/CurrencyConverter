package com.example.sanketbojewar.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        EditText DollarAmountEditText
                = (EditText) findViewById(R.id.DollarAmountEditText);

        Double  DollarAmountDouble = Double.parseDouble(DollarAmountEditText.getText().toString());


        Double poundAmount = DollarAmountDouble*0.75;
        Double rupeeAmount = DollarAmountDouble*45;
        Double yenAmount  = DollarAmountDouble*89;



        Toast.makeText(MainActivity.this, "IN pounds"+poundAmount.toString() + "  , " + "In rs" + rupeeAmount.toString() + " ," + "In yen" + yenAmount.toString()
                , Toast.LENGTH_SHORT).show();


        Log.i("info","Setup all good");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
