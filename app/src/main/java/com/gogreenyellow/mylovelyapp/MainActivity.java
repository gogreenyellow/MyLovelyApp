package com.gogreenyellow.mylovelyapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEditText = findViewById(R.id.input_edit_text);
        resultTextView = findViewById(R.id.result_text_view);

        Button naturalButton = findViewById(R.id.check_natural_button);
        naturalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleNaturalClick();
            }
        });
    }

    public void handleParityClick(View v) {
        int result = getInputNumber();

        if (result % 2 == 0) {
            resultTextView.setText(getString(R.string.input_is_even, result));
        } else {
            resultTextView.setText(getString(R.string.input_is_odd, result));
        }
    }

    public void handleNaturalClick() {
        int result = getInputNumber();
        if (result >= 0) {
            resultTextView.setText(getString(R.string.input_is_natural));
        } else {
            resultTextView.setText(getString(R.string.input_is_not_natural));
        }
    }

    private int getInputNumber() {
        String inputString = inputEditText.getText().toString();
        return Integer.parseInt(inputString);
    }

}
