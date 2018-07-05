package com.example.mutahi.youtubeprototype;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {

   private List<Movies>moviesList;

    public MoviesAdapter(List<Movies> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_of_movies,parent,false);
        return new MoviesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
       Movies movie = moviesList.get(position);
       holder.title.setText(movie.getTitle());
       holder.year.setText(movie.getYear());
       holder.genre.setText(movie.getGenre());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MoviesViewHolder extends RecyclerView.ViewHolder{
      public TextView title,genre,year;
       public MoviesViewHolder(View view) {
           super(view);
           title=(TextView)view.findViewById(R.id.title);
           year=(TextView)view.findViewById(R.id.year);
           genre=(TextView)view.findViewById(R.id.genre);
       }
   }
}
