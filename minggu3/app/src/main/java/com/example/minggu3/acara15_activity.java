package com.example.minggu3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class acara15_activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acara15);

        addData();

        recyclerView = findViewById(R.id.recyler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(acara15_activity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098", "098758124"));
    }
}
