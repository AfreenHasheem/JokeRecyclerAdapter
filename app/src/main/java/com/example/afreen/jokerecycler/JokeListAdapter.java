package com.example.afreen.jokerecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Afreen on 8/22/2017.
 */

public class JokeListAdapter extends RecyclerView.Adapter<JokeListAdapter.JokeViewHolder> {
    JokeList jokeList;//declaring
    public JokeListAdapter(JokeList jokeList)
    {
        this.jokeList=jokeList;//instance of jokelist
    }//jokelist initialized with help of constructor

    @Override
    public JokeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {//creating new viewholder
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);//inflating the row
        return new JokeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(JokeViewHolder holder, int position) {//binding views with data
        holder.joke.setText(jokeList.getJokes().get(position));

    }

    @Override
    public int getItemCount() {

        return jokeList.getJokes().size();//determines size of list, and assigns position
    }

    public class JokeViewHolder extends RecyclerView.ViewHolder
    {
        TextView joke;

        public JokeViewHolder(View view)
        {
            super(view);//calls parent constructors
            joke=view.findViewById(R.id.jokeHaha);

        }

    }
}
