package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ConversionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String conversionType = "";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        final RadioButton radioButton1 = (RadioButton) findViewById(R.id.RadionButton1);
        final RadioButton radioButton2 = (RadioButton) findViewById(R.id.RadioButton2);
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RadioGroup1);
        final TextView textViewResultUnit = (TextView) findViewById(R.id.textViewResultUnit);
        final TextView TextViewResult = (TextView) findViewById(R.id.TextViewResult);
        final EditText editNumber = (EditText) findViewById(R.id.editNumber);

        if(getIntent().hasExtra("conversion")){
            conversionType = getIntent().getExtras().getString("conversion");
            switch (conversionType){
                case "CelciusToFahrenheit":
                    radioButton1.setText("°C");
                    radioButton2.setText("°F");
                    editNumber.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                            }
                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                            }
                            @Override
                            public void afterTextChanged(Editable editable) {
                                if(radioGroup.getCheckedRadioButtonId() == radioButton1.getId() && !editable.toString().matches("") && !editable.toString().matches("-")){
                                    CelsiusToFahrenheit(editable, TextViewResult, textViewResultUnit);
                                }
                                else if(radioGroup.getCheckedRadioButtonId() == radioButton2.getId() && !editable.toString().matches("") && !editable.toString().matches("-")){
                                    FahrenheitToCelsius(editable, TextViewResult, textViewResultUnit);
                                }
                                else
                                    TextViewResult.setText("");
                            }
                    });
                    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            if(radioGroup.getCheckedRadioButtonId() == radioButton1.getId() && !editNumber.getText().toString().matches("") && !editNumber.getText().toString().matches("-")){
                                CelsiusToFahrenheit(editNumber.getText(), TextViewResult, textViewResultUnit);
                            }
                            else if(radioGroup.getCheckedRadioButtonId() == radioButton2.getId() && !editNumber.getText().toString().matches("") && !editNumber.getText().toString().matches("-")){
                                FahrenheitToCelsius(editNumber.getText(), TextViewResult, textViewResultUnit);
                            }
                        }
                    });
                    break;
                case "KilometersToMiles":
                    radioButton1.setText("km");
                    radioButton2.setText("mi");
                    editNumber.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        }
                        @Override
                        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        }
                        @Override
                        public void afterTextChanged(Editable editable) {
                            if(radioGroup.getCheckedRadioButtonId() == radioButton1.getId() && !editable.toString().matches("") && !editable.toString().matches("-")){
                                KilometersToMiles(editable, TextViewResult, textViewResultUnit);
                            }
                            else if(radioGroup.getCheckedRadioButtonId() == radioButton2.getId() && !editable.toString().matches("") && !editable.toString().matches("-")){
                                MilesToKilometers(editable, TextViewResult, textViewResultUnit);
                            }
                            else
                                TextViewResult.setText("");
                        }
                    });
                    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            if(radioGroup.getCheckedRadioButtonId() == radioButton1.getId() && !editNumber.getText().toString().matches("") && !editNumber.getText().toString().matches("-")){
                                KilometersToMiles(editNumber.getText(), TextViewResult, textViewResultUnit);
                            }
                            else if(radioGroup.getCheckedRadioButtonId() == radioButton2.getId() && !editNumber.getText().toString().matches("") && !editNumber.getText().toString().matches("-")){
                                MilesToKilometers(editNumber.getText(), TextViewResult, textViewResultUnit);
                            }
                        }
                    });
                    break;
                case "SquareMetersToSquareFeet":
                    radioButton1.setText("ft²");
                    radioButton2.setText("m²");
                    editNumber.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        }
                        @Override
                        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        }
                        @Override
                        public void afterTextChanged(Editable editable) {
                            if(radioGroup.getCheckedRadioButtonId() == radioButton1.getId() && !editable.toString().matches("") && !editable.toString().matches("-")){
                                SquareFeetToSquareMeters(editable, TextViewResult, textViewResultUnit);
                            }
                            else if(radioGroup.getCheckedRadioButtonId() == radioButton2.getId() && !editable.toString().matches("") && !editable.toString().matches("-")){
                                SquareMetersToSquareFeet(editable, TextViewResult, textViewResultUnit);
                            }
                            else
                                TextViewResult.setText("");
                        }
                    });
                    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            if(radioGroup.getCheckedRadioButtonId() == radioButton1.getId() && !editNumber.getText().toString().matches("") && !editNumber.getText().toString().matches("-")){
                                SquareFeetToSquareMeters(editNumber.getText(), TextViewResult, textViewResultUnit);
                            }
                            else if(radioGroup.getCheckedRadioButtonId() == radioButton2.getId() && !editNumber.getText().toString().matches("") && !editNumber.getText().toString().matches("-")){
                                SquareMetersToSquareFeet(editNumber.getText(), TextViewResult, textViewResultUnit);
                            }
                        }
                    });
                    break;
                case "CmToInches":
                    radioButton1.setText("cm");
                    radioButton2.setText("inch");
                    editNumber.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        }
                        @Override
                        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        }
                        @Override
                        public void afterTextChanged(Editable editable) {
                            if(radioGroup.getCheckedRadioButtonId() == radioButton1.getId() && !editable.toString().matches("") && !editable.toString().matches("-")){
                                CentimetersToInches(editable, TextViewResult, textViewResultUnit);
                            }
                            else if(radioGroup.getCheckedRadioButtonId() == radioButton2.getId() && !editable.toString().matches("") && !editable.toString().matches("-")){
                                InchesToCentimeters(editable, TextViewResult, textViewResultUnit);
                            }
                            else
                                TextViewResult.setText("");
                        }
                    });
                    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            if(radioGroup.getCheckedRadioButtonId() == radioButton1.getId() && !editNumber.getText().toString().matches("") && !editNumber.getText().toString().matches("-")){
                                CentimetersToInches(editNumber.getText(), TextViewResult, textViewResultUnit);
                            }
                            else if(radioGroup.getCheckedRadioButtonId() == radioButton2.getId() && !editNumber.getText().toString().matches("") && !editNumber.getText().toString().matches("-")){
                                InchesToCentimeters(editNumber.getText(), TextViewResult, textViewResultUnit);
                            }
                        }
                    });
                    //textViewFirstUnit.setText("cm");
                    //textViewSecondUnit.setText("inch");
                    break;
            }
        }
    }
    public void FahrenheitToCelsius(Editable edit, TextView result, TextView unit){
        double calculation = Integer.parseInt(edit.toString());
        calculation = (double)Math.round(((calculation -32) *5 / 9)*100)/100;
        result.setText(calculation + "");
        unit.setText("°C");
    }
    public void CelsiusToFahrenheit(Editable edit, TextView result, TextView unit) {
        double calculation = Integer.parseInt(edit.toString());
        calculation = (double) Math.round((calculation / 5 * 9 + 32) * 100) / 100;
        result.setText(calculation + "");
        unit.setText("°F");
    }
    public void KilometersToMiles(Editable edit, TextView result, TextView unit){
        double calculation = Integer.parseInt(edit.toString());
        calculation = (double)Math.round((calculation/1.609)*100)/100;
        result.setText(calculation + "");
        unit.setText("mi");
    }
    public void MilesToKilometers(Editable edit, TextView result, TextView unit) {
        double calculation = Integer.parseInt(edit.toString());
        calculation = (double) Math.round((calculation*1.609) * 100) / 100;
        result.setText(calculation + "");
        unit.setText("km");
    }
    public void SquareFeetToSquareMeters(Editable edit, TextView result, TextView unit){
        double calculation = Integer.parseInt(edit.toString());
        calculation = (double)Math.round((calculation/10.764)*100)/100;
        result.setText(calculation + "");
        unit.setText("m²");
    }
    public void SquareMetersToSquareFeet(Editable edit, TextView result, TextView unit) {
        double calculation = Integer.parseInt(edit.toString());
        calculation = (double) Math.round((calculation*10.764) * 100) / 100;
        result.setText(calculation + "");
        unit.setText("ft²");
    }
    public void CentimetersToInches(Editable edit, TextView result, TextView unit){
        double calculation = Integer.parseInt(edit.toString());
        calculation = (double)Math.round((calculation/2.54)*100)/100;
        result.setText(calculation + "");
        unit.setText("inch");
    }
    public void InchesToCentimeters(Editable edit, TextView result, TextView unit) {
        double calculation = Integer.parseInt(edit.toString());
        calculation = (double) Math.round((calculation*2.54) * 100) / 100;
        result.setText(calculation + "");
        unit.setText("cm");
    }
}

