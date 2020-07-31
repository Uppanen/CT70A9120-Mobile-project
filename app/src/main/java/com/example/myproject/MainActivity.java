package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCmToInches = (Button) findViewById(R.id.buttonCmToInches);
        Button buttonCelciusToFahrenheit = (Button) findViewById(R.id.buttonCelciusToFahrenheit);
        Button buttonKilometersToMiles = (Button) findViewById(R.id.buttonKilometersToMiles);
        Button buttonSquareMetersToSquareFeet = (Button) findViewById(R.id.buttonSquareMetersToSquareFeet);

        buttonCelciusToFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conversionIntent = new Intent(getApplicationContext(), ConversionActivity.class);
                conversionIntent.putExtra("conversion", "CelciusToFahrenheit");
                startActivity(conversionIntent);
            }
        });
        buttonCmToInches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conversionIntent = new Intent(getApplicationContext(), ConversionActivity.class);
                conversionIntent.putExtra("conversion", "CmToInches");
                startActivity(conversionIntent);
            }
        });
        buttonKilometersToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conversionIntent = new Intent(getApplicationContext(), ConversionActivity.class);
                conversionIntent.putExtra("conversion", "KilometersToMiles");
                startActivity(conversionIntent);
            }
        });
        buttonSquareMetersToSquareFeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conversionIntent = new Intent(getApplicationContext(), ConversionActivity.class);
                conversionIntent.putExtra("conversion", "SquareMetersToSquareFeet");
                startActivity(conversionIntent);
            }
        });
    }
}