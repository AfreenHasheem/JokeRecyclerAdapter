package com.example.afreen.jokerecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    JokeListAdapter mAdapter;
    JokeList mJokeList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the Recycler View from the Layout
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewOfJokes);

        //Initialize our Data Source
        mJokeList = new JokeList();

        //Initialize our Adapter with said Data Source
        //JokeListAdapter is a class that extends Adapter
        mAdapter = new JokeListAdapter(mJokeList);

        //Set the Adapter
        mRecyclerView.setAdapter(mAdapter);

        //Choose a Layout Manager (You can also make one if you like)
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
