package ru.realsanya.snake;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Snake {
    int x = 45;
    int y = 45;
    int speed = 2;

    Texture imgSnake;

    public Snake() {
        imgSnake = new Texture(Gdx.files.internal("body.png"));
    }

    public void render(SpriteBatch batch) {
        batch.draw(imgSnake, x, y, 32, 32);
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            x += speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            x -= speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            y += speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            y -= speed;
        }
    }

    public void dispose() {
        imgSnake.dispose();
    }
}
