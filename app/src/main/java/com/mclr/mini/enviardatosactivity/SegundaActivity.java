package com.mclr.mini.enviardatosactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        TextView textView = (TextView)findViewById(
                R.id.textViewTexto);
        if (getIntent()!=null && getIntent().hasExtra(
                Intent.EXTRA_TEXT)) {
            textView.setText(getIntent().getStringExtra(
                Intent.EXTRA_TEXT));
        }
    }

    public void onClickCerrar(View view) {
        finish();
    }
}
