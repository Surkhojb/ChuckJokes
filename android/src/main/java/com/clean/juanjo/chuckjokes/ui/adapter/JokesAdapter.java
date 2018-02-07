package com.clean.juanjo.chuckjokes.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.clean.juanjo.chuckjokes.R;
import com.clean.juanjo.presentation.base.model.Joke;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 07/02/2018.
 */

public class JokesAdapter extends RecyclerView.Adapter<JokesAdapter.JokesHolder> {

    private List<Joke> list;

    public JokesAdapter() {
        list = new ArrayList<>();
    }

    @Override
    public JokesAdapter.JokesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_jokes,
                parent, false);

        return new JokesHolder(view);

    }

    @Override
    public void onBindViewHolder(JokesAdapter.JokesHolder holder, int position) {
        holder.tvJoke.setText(list.get(position).getTextJoke());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setNewJoke(Joke joke){
        if(joke != null)
            list.add(joke);

        notifyDataSetChanged();
    }

    public class JokesHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_text_joke)
        TextView tvJoke;

        public JokesHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
