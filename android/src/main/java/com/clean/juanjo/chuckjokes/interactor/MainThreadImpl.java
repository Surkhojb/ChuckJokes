package com.clean.juanjo.chuckjokes.interactor;

import com.clean.juanjo.domain.executor.MainThread;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Created by juanj on 22/01/2018.
 */

public class MainThreadImpl implements MainThread {

    @Inject
    public MainThreadImpl(){}

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
