package com.example.tewodros_2.game;

import android.content.res.Resources;
import android.view.SurfaceHolder;

/**
 * Created by Tewodros_2 on 12/2/2015.
 */
public class Game {

    private final Thread thread;
    private final GameLoop gameloop;

    public Game (SurfaceHolder surfaceHolder, Resources resources){
        gameloop = new GameLoop(surfaceHolder, resources);
        thread = new Thread(gameloop);

    }

    public void start() {
        thread.start();

    }

    public void stop() {
        gameloop.pleaseStop();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
