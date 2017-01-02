package com.example.jhpiego.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edPanjang, edLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edPanjang = (EditText) findViewById(R.id.ed_panjang);
        edLebar = (EditText) findViewById(R.id.ed_lebar);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtLuas = (TextView) findViewById(R.id.txtluas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang=edPanjang.getText().toString().trim();
                String lebar=edLebar.getText().toString().trim();

                double p=Double.parseDouble(panjang);
                double l=Double.parseDouble(lebar);

                double luas=p*l;

                txtLuas.setText("Luas Persegi Panjang adalah "+luas);

            }
        });
    }
}
