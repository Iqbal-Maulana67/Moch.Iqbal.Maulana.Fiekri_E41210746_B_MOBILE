package com.example.minggu6;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class acara28_buat_biodata extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    Button ton1, ton2;
    EditText text1, text2, text3, text4, text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acara28_buat_biodata);

        dbHelper = new DataHelper(this);
        text1 = findViewById(R.id.editText1);
        text2 = findViewById(R.id.editText2);
        text3 = findViewById(R.id.editText3);
        text4 = findViewById(R.id.editText4);
        text5 = findViewById(R.id.editText5);
        ton1 = findViewById(R.id.button1);
        ton2 = findViewById(R.id.button2);

        ton1.setOnClickListener((arg0) -> {
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            db.execSQL("INSERT INTO biodata (no, nama, tgl, jk, alamat) VALUES('"+
                    text1.getText().toString()+"','"+
                    text2.getText().toString()+"','" +
                    text3.getText().toString()+"','"+
                    text4.getText().toString()+"','"+
                    text5.getText().toString()+"')");
            Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
            acara28_first_activity.ma.RefreshList();
            finish();
        });
        ton2.setOnClickListener((arg0) -> {
            finish();
        });
    }
}