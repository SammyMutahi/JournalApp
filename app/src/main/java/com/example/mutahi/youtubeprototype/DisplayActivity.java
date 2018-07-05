package com.example.mutahi.youtubeprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class DisplayActivity extends AppCompatActivity {
    List<Movies> moviesList = new ArrayList<>();
    MoviesAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mAdapter = new MoviesAdapter(moviesList);
        LinearLayoutManager layout = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(layout);
        mRecyclerView.setAdapter(mAdapter);
        DisplayMovies();
    }
    private void DisplayMovies(){
        moviesList.add(new Movies("Power Rangers","Classic","2016"));
        moviesList.add(new Movies("Thor Ragnarock","Avengers","2018"));
        mAdapter.notifyDataSetChanged();
    }

}
