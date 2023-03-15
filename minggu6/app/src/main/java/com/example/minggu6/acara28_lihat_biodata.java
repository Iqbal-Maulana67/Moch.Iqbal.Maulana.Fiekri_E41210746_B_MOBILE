package com.example.minggu6;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Debug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class acara28_lihat_biodata extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    Button ton2;
    TextView text1, text2, text3, text4, text5;
    String string1, string2, string3, string4, string5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acara28_lihat_biodata);

        dbHelper = new DataHelper(this);
        text1 = findViewById(R.id.textView1);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);
        text4 = findViewById(R.id.textView4);
        text5 = findViewById(R.id.textView5);

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM biodata WHERE nama = '" + getIntent().getStringExtra("nama") + "'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0 ){
            cursor.moveToPosition(0);
                string1 = cursor.getString(0).toString();
                string2 = cursor.getString(1).toString();
                string3 = cursor.getString(2).toString();
                string4 = cursor.getString(3).toString();
                string5 = cursor.getString(4).toString();
                if (!string1.isEmpty()){
                    text1.setText(string1);
                    text2.setText(string2);
                    text3.setText(string3);
                    text4.setText(string4);
                    text5.setText(string5);
                }
        }
        ton2 = findViewById(R.id.button1);
        ton2.setOnClickListener((arg0) -> {
            finish();
        });
    }
}