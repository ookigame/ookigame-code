package com.ookigame.hello;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class HellolibGDX extends ApplicationAdapter {

	SpriteBatch batch;
	Texture img;
	private TextureRegion ball;
	private float x, y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		ball = new TextureRegion(new Texture("ball.png"));
		ball.getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		float delta = Gdx.graphics.getDeltaTime();
		x += delta * 20;
		y += delta * 20;
		batch.begin();
		batch.draw(ball, x, y, 100, 100);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		ball.getTexture().dispose();
	}
}
