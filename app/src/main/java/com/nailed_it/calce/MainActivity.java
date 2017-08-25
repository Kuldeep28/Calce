package com.nailed_it.calce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        t1 = (TextView) findViewById(R.id.textView);
    }

    public void add(View view) {
        String qw = e1.getText().toString();
        double txt1 = Double.parseDouble(qw);
        String w = e2.getText().toString();
        double txt2 = Double.parseDouble(w);
        txt2 = txt2 + txt1;
        qw = Double.toString(txt2);
        t1.setText(qw);

    }

    public void mult(View view) {
        String qw = e1.getText().toString();
        double txt1 = Double.parseDouble(qw);
        String w = e2.getText().toString();
        double txt2 = Double.parseDouble(w);
        txt2 = txt2 * txt1;
        qw = Double.toString(txt2);
        t1.setText(qw);


    }


    public void min(View view) {

        String qw = e1.getText().toString();
        double txt1 = Double.parseDouble(qw);
        String w = e2.getText().toString();
        double txt2 = Double.parseDouble(w);
        txt2 = txt1 - txt2;
        qw = Double.toString(txt2);
        t1.setText(qw);

    }

    public void div(View view) {
        String qw = e1.getText().toString();
        double txt1 = Double.parseDouble(qw);
        String w = e2.getText().toString();
        double txt2 = Double.parseDouble(w);
        txt2 = txt1 % txt2;
        qw = Double.toString(txt2);
        t1.setText(qw);

    }
}
