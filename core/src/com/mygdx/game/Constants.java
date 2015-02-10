package com.mygdx.game;

import com.badlogic.gdx.Gdx;

/**
 * Created by wojang on 1/30/15.
 */
public class Constants {
    //Constants
    static float GAMESCREEN_WIDTH = Gdx.graphics.getWidth();//800
    static float GAMESCREEN_HEIGHT = Gdx.graphics.getHeight();//480
    static float BULLET_WIDTH = GAMESCREEN_WIDTH / 25;//32
    static float BULLET_HEIGHT = GAMESCREEN_HEIGHT / 15;//32
    static float USER_WIDTH = GAMESCREEN_WIDTH / 10;//64
    static float USER_HEIGHT = GAMESCREEN_HEIGHT / 6;//64
    static float SLIME_ENEMY_WIDTH = GAMESCREEN_WIDTH / 12.5f;
    static float SLIME_ENEMY_HEIGHT = GAMESCREEN_HEIGHT / 7.5f;
    static float RIGHTABS_WIDTH = GAMESCREEN_WIDTH / 10;

    //static float JOYSTICK_RADIUS = GAMESCREEN_WIDTH / ?;
    //lets not use stretch viewport because we don't really want aspect ratio being changed, maybe?
}