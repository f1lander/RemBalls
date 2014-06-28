package kodomosoft.net.mygdxgame.screen.levels;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
import java.util.Random;

import kodomosoft.net.mygdxgame.CrazyBallsMain;
import kodomosoft.net.mygdxgame.actor.ButtonImage;
import kodomosoft.net.mygdxgame.actor.RemsBallActor;
import kodomosoft.net.mygdxgame.listener.InputDYAListener;
import kodomosoft.net.mygdxgame.screen.AbstractScreen;
<<<<<<< HEAD
import kodomosoft.net.mygdxgame.screen.LevelScreen;
=======
import kodomosoft.net.mygdxgame.CrazyBallsMain;
import kodomosoft.net.mygdxgame.actor.RemsBallActor;
import kodomosoft.net.mygdxgame.listener.InputDYAListener;
import kodomosoft.net.mygdxgame.screen.AbstractScreen;
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PlayScreen extends AbstractScreen {
	
	private Stage stage;
	private float 	x = 0,
					y = 0;
	private int cantidad = 0,
				contador = 0;
<<<<<<< HEAD
<<<<<<< HEAD
	private Image backButton, retryBtn, level1Title;
	
	private int cont = 0;
	private String LevelActual;
	private String BallsToLevels[];

	public PlayScreen(CrazyBallsMain game) {
		super(game);
		
=======
	

	public PlayScreen(CrazyBallsMain game) {
		super(game);
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
	private Image backButton, retryBtn, level1Title;

	public PlayScreen(CrazyBallsMain game) {
		super(game);
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
	}

	@Override
	public void show() {
		stage =  new Stage(400, 800, true, game.getSpriteBatch());
		Gdx.input.setInputProcessor(stage);
		
<<<<<<< HEAD
<<<<<<< HEAD
		this.LevelActual = LevelScreen.levelRules[game.getLevel()-1];
		String BallsToLevels[] = this.LevelActual.split(",");
		this.BallsToLevels=BallsToLevels;
		this.cont=0;
		
		//Crear Fondo
		Texture txt = CrazyBallsMain.MANAGER.get("playScreen.png", Texture.class);
=======
		//Crear Fondo
		Texture txt = CrazyBallsMain.MANAGER.get("background.png", Texture.class);
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
		//Crear Fondo
		Texture txt = CrazyBallsMain.MANAGER.get("playScreen.png", Texture.class);
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
		txt.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		TextureRegion txtr = new TextureRegion(txt, 480, 800);
		Image img = new Image(txtr);
		stage.addActor(img);
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5

		Texture bck = CrazyBallsMain.MANAGER.get("levelsBack.png", Texture.class);
		bck.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		TextureRegion bck1 = new TextureRegion(bck, 67, 51);
		backButton = new Image(bck1);
		backButton.addListener(new InputDYAListener(backButton, game, 0));
		backButton.setPosition(380, 20);
		stage.addActor(backButton);
		
		Texture ret = CrazyBallsMain.MANAGER.get("retry.png", Texture.class);
		ret.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		TextureRegion ret1 = new TextureRegion(ret, 61, 61);
		
		retryBtn = new Image(ret1);
		retryBtn.addListener(new InputDYAListener(retryBtn, game, 4));
		retryBtn.setPosition(20, 20);
		stage.addActor(retryBtn);
		
		cantidad = game.getLevel()*5;
		
		String varLevel = "level"+game.getLevel()+".png";
		Texture level = CrazyBallsMain.MANAGER.get(varLevel, Texture.class);
		level.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		TextureRegion level1 = new TextureRegion(level, 60, 52);
		level1Title = new Image(level1);
		level1Title.setPosition(145, 720);
		stage.addActor(level1Title);
		
		
		CrazyBallsMain.countBallslevel = cantidad;
		CrazyBallsMain.levelx = game.getLevel();
		
<<<<<<< HEAD
=======
		
		cantidad = game.getLevel()*5;
		
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act();
		
		if(contador<cantidad){
			createBall();
<<<<<<< HEAD
<<<<<<< HEAD
//			contador++;
=======
			contador++;
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
			contador++;
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
		}
		
		stage.draw();
	}

<<<<<<< HEAD
<<<<<<< HEAD

=======
//	private void createBall2() {
//		try{
//			x = ((0.03f * stage.getWidth() + 
//					0.07f * stage.getWidth() * (float) Math.random()));
//				
//			y = ((0.016f * stage.getHeight() + 
//					0.8f * stage.getHeight() * (float) Math.random()));
//			}catch(Exception e){
//				
//			}
//			RemsBallActor ball = new RemsBallActor(x, y);
//			ball.setVelocidad(-200, 200);
//			stage.addActor(ball);
//	}
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======

>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5

	//Metodo para crea nuevas pelotas
	private void createBall(){
		
		try{
		x = ((0.01f * stage.getWidth() + 
				0.8f * stage.getWidth() * (float) Math.random()));
			
		y = ((0.01f * stage.getHeight() + 
				0.8f * stage.getHeight() * (float) Math.random()));
		}catch(Exception e){
			
		}
		if(y>stage.getHeight()-100){
			y -= 110;
		}else if(y<100){
			y += 110;
		}
<<<<<<< HEAD
<<<<<<< HEAD
		
//		Random randomGenerator = new Random();
//		int face = randomGenerator.nextInt(3 - 1 + 1) + 1;
		int face = generateFaceBall();
		if(face>0){
			RemsBallActor ball = new RemsBallActor(x, y, face);
			ball.setVelocidad(-300, 300);
			stage.addActor(ball);
			ball.addListener(new InputDYAListener(ball, -1, face, game));
//			if(cont>=BallsToLevels.length){
			contador++;
//			}
		}
	}
	
	private int generateFaceBall(){
//		Random randomGenerator = new Random();
//		int face = randomGenerator.nextInt(3 - 1 + 1) + 1;
		int face = (int) (4 * Math.random());
		if(cont<BallsToLevels.length){
			face = Integer.parseInt(BallsToLevels[cont]);
			cont++;
			return face;
		}else{
			return face;
		}
=======
		RemsBallActor ball = new RemsBallActor(x, y);
		ball.setVelocidad(-300, 300);
		stage.addActor(ball);
		ball.addListener(new InputDYAListener(ball, -1));
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
		
		Random randomGenerator = new Random();
		int face = randomGenerator.nextInt(3 - 1 + 1) + 1;
		
		RemsBallActor ball = new RemsBallActor(x, y, face);
		ball.setVelocidad(-300, 300);
		stage.addActor(ball);
		ball.addListener(new InputDYAListener(ball, -1, face, game));
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
		
	}

	@Override
	public void resize(int width, int height) {
		stage.setViewport(400, 800, true);
	}

	@Override
	public void hide() {
		Gdx.input.setInputProcessor(null);
<<<<<<< HEAD
<<<<<<< HEAD
		this.cont=0;
		this.contador=0;
=======
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
	}

	@Override
	public void dispose() {
		super.dispose();
		stage.dispose();
	}

}
