package com.a312018004.net;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nhadir, ntugas, nuts, nuas;
    TextView nhasil, nketerangan;

    Integer nh, nt, nts, nas;
    Double nhas;
    String ket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nhadir = (EditText) findViewById(R.id.hadir);
        ntugas = (EditText) findViewById(R.id.tugas);
        nuts = (EditText) findViewById(R.id.uts);
        nuas = (EditText) findViewById(R.id.uas);
        nhasil = (TextView) findViewById(R.id.hasil);
        nketerangan = (TextView) findViewById(R.id.keterangan);
    }

    public void aksi (View klik){

        switch (klik.getId()){
            case R.id.button:
                nh = Integer.parseInt(nhadir.getText().toString());
                nt = Integer.parseInt(ntugas.getText().toString());
                nts = Integer.parseInt(nuts.getText().toString());
                nas = Integer.parseInt(nuas.getText().toString());
                nhas = (0.1 * nh) + (0.35 * nt) + (0.2 * nts) + (0.35 * nas);
                if (nhas >= 70) {
                    ket = "Lulus" ;
                }
                else {
                    ket ="Tidak Lulus" ;
                }
                nhasil.setText("Nilai Anda = " + String.valueOf(nhas).toString());
                nketerangan.setText(String.valueOf(ket).toString());
                break;

            case R.id.button2:
                nhadir.setText("");
                ntugas.setText("");
                nuts.setText("");
                nuas.setText("");
                nhasil.setText("");
                nketerangan.setText("");

        }


    }
}