package com.clean.juanjo.chuckjokes.ui;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;


import com.clean.juanjo.chuckjokes.ChuckApp;
import com.clean.juanjo.chuckjokes.R;
import com.clean.juanjo.chuckjokes.di.component.DaggerMainActivityComponent;
import com.clean.juanjo.chuckjokes.di.module.MainActivityModule;
import com.clean.juanjo.chuckjokes.ui.adapter.JokesAdapter;
import com.clean.juanjo.chuckjokes.ui.util.Utils;
import com.clean.juanjo.presentation.base.model.Joke;
import com.clean.juanjo.presentation.mainactivity.MainActivityContract;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import es.dmoral.toasty.Toasty;


public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    @BindView(R.id.rv_list_jokes)
    RecyclerView listOfJokes;
    @BindView(R.id.fab_punch)
    FloatingActionButton fabPunch;

    @Inject
    MainActivityContract.Presenter presenter;

    JokesAdapter jokesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        injectDependencies();
        initRecyclerView();
    }

    @Override
    public void showError(String error) {
        Toasty.error(getApplicationContext(),error,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loadRandomJoke(Joke joke) {
        jokesAdapter.setNewJoke(joke);
    }

    @OnClick(R.id.fab_punch)
    public void onPunchClick(View v){
        presenter.loadOneRandomJoke();
    }

    @Override
    public void changePunchColor() {
        String color = getResources().getStringArray(R.array.random_colors)[Utils.getRandomNumber()];

        fabPunch.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color)));
    }

    private void initRecyclerView() {
        listOfJokes.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        listOfJokes.setHasFixedSize(true);
        jokesAdapter = new JokesAdapter();
        listOfJokes.setAdapter(jokesAdapter);
    }

    private void injectDependencies() {
        ChuckApp chuckApp = (ChuckApp) getApplication();

        DaggerMainActivityComponent.builder()
                .chuckAppComponent(chuckApp.getAppComponent())
                .mainActivityModule(new MainActivityModule(this))
                .build()
                .inject(this);
    }
}
