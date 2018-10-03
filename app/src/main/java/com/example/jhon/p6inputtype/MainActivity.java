package com.example.jhon.p6inputtype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtBiasa,txtNumber,txtPhone,txtPassword,txtEmail,txtUrl;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtBiasa = (EditText) findViewById(R.id.text_biasa);
        txtNumber = (EditText) findViewById(R.id.text_angka);
        txtPhone = (EditText) findViewById(R.id.text_nomor);
        txtPassword = (EditText) findViewById(R.id.text_pass);
        txtEmail = (EditText) findViewById(R.id.text_email);
        txtUrl = (EditText) findViewById(R.id.text_url);

        btnSubmit = (Button) findViewById(R.id.submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Text Biasa ..."+txtBiasa.getText().toString()+
                        "\nText Number ..."+txtNumber.getText().toString()+
                        "\nText Phone ..."+txtPhone.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
