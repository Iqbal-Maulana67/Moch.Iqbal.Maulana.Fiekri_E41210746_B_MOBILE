package com.example.minggu6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class acara26_first_activity extends AppCompatActivity {
    EditText editText;
    private int STORAGE_PERMISSION_CODE = 23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acara26_first);
        editText = findViewById(R.id.editText2);
    }
    public void next(View view){
        Intent intent = new Intent(acara26_first_activity.this, acara26_second_activity.class);
        startActivity(intent);
    }

    public void savePublic(View view){
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
        String info = editText.getText().toString();
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File myFile = new File(folder, "myData1.txt");
        writeData(myFile, info);
        editText.setText("");
    }

    public void savePrivate(View view){
        String info = editText.getText().toString();
        File folder = getExternalFilesDir("Maulana");
        File myFile = new File(folder, "myData2.txt");
        writeData(myFile, info);
        editText.setText("");
    }

    private void writeData(File myFile, String data){
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(myFile);
            fileOutputStream.write(data.getBytes());
            Toast.makeText(this, "Done" + myFile.getAbsolutePath(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}