package com.example.upil.barvolume;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtWidht, edtHeight, edtLength;
    private Button btnCalculate;
    private TextView tvResult;
    boolean isEmptyFields = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtWidht = findViewById(R.id.edt_width);
        edtHeight = findViewById(R.id.edt_height);
        edtLength = findViewById(R.id.edt_lenght);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_calculate) {
            String widht = edtWidht.getText().toString().trim();
            String height = edtHeight.getText().toString().trim();
            String length = edtLength.getText().toString().trim();

            if (TextUtils.isEmpty(widht)) {
                edtWidht.setError("Harap diisi dulu");
                isEmptyFields = true;
            }
            if (TextUtils.isEmpty(height)) {
                isEmptyFields = true;
                edtHeight.setError("Harap diisi dulu");
            }
            if (TextUtils.isEmpty(length)) {
                isEmptyFields = true;
                edtLength.setError("Harap diisi dulu");
            }
            if (!isEmptyFields){
                double l = Double.parseDouble(length);
                double w = Double.parseDouble(widht);
                double h = Double.parseDouble(length);
                double volume = l * w *h;
                tvResult.setText(String.valueOf(volume));
            }
        }
        hideKeyboard();
    }

    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
