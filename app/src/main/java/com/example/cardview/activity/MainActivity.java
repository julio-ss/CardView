package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        //define layout
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager(layoutManager);

        //define adapter
        prepararPostagem();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagem(){
        Postagem p = new Postagem("Jurandir Marques", "Tira foto mae... que lindo", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Thais Marques", "Mar calmo nunca fez bom marinheiro", R.drawable.imagem4);
        this.postagens.add(p);

        p = new Postagem("Edna Maria", "Quero ver quando for dona de casa", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Julio Santos", "#viagem #partiuBahia", R.drawable.imagem1);
        this.postagens.add(p);
    }
}