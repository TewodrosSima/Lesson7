package com.example.tewodros_2.game;


import android.content.Context;
import android.content.res.Resources;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Tewodros_2 on 12/2/2015.
 */
public class MysurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    private final Resources resources;
    //private final SurfaceHolder SurfaceHolder;
    private Game game;

    public MysurfaceView(Context context, Resources resources) {

        super(context);
        this.resources = resources;
        game = null;


        getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

        game = new Game(surfaceHolder, resources );
        game.start();

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

        if(game != null){
            game.stop();
        }
        game = null;

    }
}
