package br.com.etecia.myfilms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> lstFilmes;
    RecyclerView idRecyclerview ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstFilmes = new ArrayList<>();

        idRecyclerview = findViewById(R.id.idRecyclerview);

        Adapter adapter = new Adapter(getApplicationContext(),lstFilmes);

        //idRecyclerview.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.HORIZONTAL,true));

        idRecyclerview.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        idRecyclerview.setHasFixedSize(true);

        idRecyclerview.setAdapter(adapter);
    }
}