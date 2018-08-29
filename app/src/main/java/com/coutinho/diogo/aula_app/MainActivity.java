package com.coutinho.diogo.aula_app;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnClique;
    private EditText editName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClique = (Button)findViewById(R.id.btnClique);
        editName = (EditText)findViewById(R.id.editName);
        btnClique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dig = new AlertDialog.Builder();
            }
        });
    }
}
