package kodomosoft.net.mygdxgame;

import kodomosoft.net.mygdxgame.InputDYAListener;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class CrazyBallsMain implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	public static Image btn1, btn2, btn3, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	private Texture button1, button2, button3, _l1, _l2, _l3, _l4, _l5, _l6, _l7, _l8, _l9, _l10, _l11, _l12;
	private TextureRegion button1Txt, button2Txt, button3Txt, _L1, _L2, _L3, _L4, _L5, _L6, _L7, _L8, _L9, _L10, _L11, _L12;;
	private Stage stg;
	
	@Override
	public void create() {	
		
		//setScreen(new MenuScreen(this));
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
		Texture txt = new Texture("background.png");
		txt.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		TextureRegion txtr = new TextureRegion(txt, 480, 800);
		stg = new Stage();
		Image img = new Image(txtr);
		stg.addActor(img);
		img.setFillParent(true);

		button1 = new Texture("btnPlay.png");
		button2 = new Texture("btnOptions.png");
		button3 = new Texture("btnExit.png");
		
		

		
		button1.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		button2.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		button3.setFilter(TextureFilter.Linear, TextureFilter.Linear);

		
		button1Txt = new TextureRegion(button1, 221, 89);
		button2Txt = new TextureRegion(button2, 221, 89);
		button3Txt = new TextureRegion(button3, 221, 89);

		
		btn1 = new Image(button1);
		btn2 = new Image(button2);
		btn3 = new Image(button3);


		btn1.setPosition(129.5f, 410);
		stg.addActor(btn1);
		btn1.addListener(new InputDYAListener(btn1, 1));
		
		btn2.setPosition(129.5f,290);
		stg.addActor(btn2);
		btn2.addListener(new InputDYAListener(btn2, 2));
		
		btn3.setPosition(129.5f, 170);
		stg.addActor(btn3);
		btn3.addListener(new InputDYAListener(btn3, 3));
		Gdx.input.setInputProcessor(stg);
				
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			
		stg.draw();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
