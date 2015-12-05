package com.example.tewodros_2.game;

import java.util.Random;

/**
 * Created by Tewodros_2 on 12/2/2015.
 */
public class ball {

    public float x;
    public float y;
    private float vx;
    private float vy;

    public ball(Random rand)
    {
        x = 10f + rand.nextFloat()  * 80f;
        y = 10f + rand.nextFloat()  * 80f;
        vx = -0.5f + rand.nextFloat();
        vy = -0.5f + rand.nextFloat();
    }

    public void step() {

        x += vx;
        y += vy;

        if (x < 10f || x > 90f)
        {
            vx = -vx;
        }
        if (y < 10f || y > 90f)
        {
            vy = -vy;
        }
    }
}
