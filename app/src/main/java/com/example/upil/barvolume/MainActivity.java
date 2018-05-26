package com.example.upil.barvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtWidht, edtHeight, edtLength;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtWidht = (EditText)findViewById(R.id.edt_width);
        edtHeight = (EditText)findViewById(R.id.edt_height);
        edtLength = (EditText)findViewById(R.id.edt_lenght);
        btnCalculate = (Button) findViewById(R.id.btn_calculate);
        tvResult = (TextView)findViewById(R.id.tv_result);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
