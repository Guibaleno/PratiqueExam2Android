package com.example.a533.pratiqueexam2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewJobs;
    List<jobOfferModel> jobs;
    RecyclerView.Adapter adapter;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activite2.class);
                startActivity(intent);
            }
        });

        recyclerViewJobs = findViewById(R.id.recyclerJobsToOffer);
        recyclerViewJobs.setHasFixedSize(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewJobs.setLayoutManager(linearLayoutManager);
        jobs = new ArrayList<>();
        addJobs();
        adapter = new RecyclerViewItem(jobs, new deleteItemInterface(){
            @Override
            public void deleteItem(int position) {
                jobs.remove(position);
                recyclerViewJobs.getAdapter().notifyItemRemoved(position);
            }
        });
        recyclerViewJobs.setAdapter(adapter);
        recyclerViewJobs.getAdapter().notifyDataSetChanged();
    }

    private void addJobs()
    {
        jobs.add(new jobOfferModel("Professeur", "Enseigner aux enfants", 24.0f));
        jobs.add(new jobOfferModel("Plombier", "Réparer les tuyaux", 22.0f));
        jobs.add(new jobOfferModel("Programmeur", "Programmation", 28.0f));

    }

    public interface deleteItemInterface
    {
        void deleteItem(int position);
    }
}
