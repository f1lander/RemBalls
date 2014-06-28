package kodomosoft.net.mygdxgame;

<<<<<<< HEAD
<<<<<<< HEAD
import sun.rmi.runtime.Log;
=======
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
import sun.rmi.runtime.Log;
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
import kodomosoft.net.mygdxgame.screen.AbstractScreen;
import kodomosoft.net.mygdxgame.screen.Instructions;
import kodomosoft.net.mygdxgame.screen.LevelScreen;
import kodomosoft.net.mygdxgame.screen.MainScreen;

import com.badlogic.gdx.Game;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Sound;
<<<<<<< HEAD
=======
import com.badlogic.gdx.assets.AssetManager;
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Esta es la clase Principal o el Game;
 * de aqui e de donde tomamos todo lo necesario para nustro juego
 * */

public class CrazyBallsMain extends Game {
	
	/****************VARIABLES DE INSTANCIA****************/
	public static AssetManager MANAGER = new AssetManager();
	private SpriteBatch batch;
	public final AbstractScreen LEVELS, MENU, INSTRUCTIONS;
	private int Level=0;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
	public static Preferences prefs;
	public static int countBallslevel;
	public static int levelx;
	public static Sound wavSound;
	
<<<<<<< HEAD
=======
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
	/******************************************************/
	
	/*CONSTRUCTOR DE LA CLASE PRINCIPAL (EL GAME)*/
	public CrazyBallsMain() {
		LEVELS = new LevelScreen(this);
		MENU = new MainScreen(this);
		INSTRUCTIONS = new Instructions(this);
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
	void initPrefs()
	{
		prefs = Gdx.app.getPreferences("scores.txt");		
	}
	
	@Override
	public void create() {
		
		initPrefs();
		
<<<<<<< HEAD
=======
	@Override
	public void create() {
		
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
		//Iniciamos nuestro Spritebatch, el que 
		//vamos a usar en todo nuestro juego
		batch = new SpriteBatch();
		
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
		prefs.putBoolean("Level1",true);
		prefs.flush();		
		//Gdx.app.error("sds", "prefserror");
		//Cargamos todos los recursos que nesesitaremos en el juego a nuestro AssetManager
		
		wavSound = Gdx.audio.newSound(Gdx.files.internal("Pickup_remBall.wav"));
		Sound menuSong = Gdx.audio.newSound(Gdx.files.internal("background.ogg"));

		
		MANAGER.load("btnPlay.png", Texture.class); //playScreen
		MANAGER.load("playScreen.png", Texture.class);
		MANAGER.load("face1.png", Texture.class);
		MANAGER.load("face2.png", Texture.class);
		MANAGER.load("face3.png", Texture.class);
<<<<<<< HEAD
=======
		//Cargamos todos los recursos que nesesitaremos en el juego a nuestro AssetManager
		MANAGER.load("btnPlay.png", Texture.class);
		MANAGER.load("face1.png", Texture.class);
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
		MANAGER.load("backButton.png", Texture.class);
		MANAGER.load("background.png", Texture.class);
		MANAGER.load("btnExit.png", Texture.class);
		MANAGER.load("btnOptions.png", Texture.class);
		MANAGER.load("levels.png", Texture.class);
		MANAGER.load("instructions.png", Texture.class);
		MANAGER.load("l1.png", Texture.class);
		MANAGER.load("l2.png", Texture.class);
		MANAGER.load("l3.png", Texture.class);
		MANAGER.load("l4.png", Texture.class);
		MANAGER.load("l5.png", Texture.class);
		MANAGER.load("l6.png", Texture.class);
		MANAGER.load("l7.png", Texture.class);
		MANAGER.load("l8.png", Texture.class);
		MANAGER.load("l9.png", Texture.class);
		MANAGER.load("l10.png", Texture.class);
		MANAGER.load("l11.png", Texture.class);
		MANAGER.load("l12.png", Texture.class);
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
		MANAGER.load("level1.png", Texture.class);
		MANAGER.load("level2.png", Texture.class);
		MANAGER.load("level3.png", Texture.class);
		MANAGER.load("level4.png", Texture.class);
		MANAGER.load("level5.png", Texture.class);
		MANAGER.load("level6.png", Texture.class);
		MANAGER.load("level7.png", Texture.class);
		MANAGER.load("level8.png", Texture.class);
		MANAGER.load("level9.png", Texture.class);
		MANAGER.load("level10.png", Texture.class);
		MANAGER.load("level11.png", Texture.class);
		MANAGER.load("level12.png", Texture.class);
		MANAGER.load("levelsBack.png", Texture.class);
		MANAGER.load("retry.png", Texture.class);
<<<<<<< HEAD
=======
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
		
		
		
		while(!MANAGER.update()){
			//Todo lo que sea
		}
		
		setScreen(MENU);
<<<<<<< HEAD
<<<<<<< HEAD
		
		menuSong.play();
		menuSong.loop();
=======
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
		
		menuSong.play();
		menuSong.loop();
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
				
	}

	@Override
	public void dispose() {
		super.dispose();
		batch.dispose();
		MANAGER.dispose();
	}
	
	/**
	 * Instancia el ivel Seleccionado por el Usuario segun el Boton Tocado
	 * @this.Level=Level;
	 * */
	public void setLevel(int Level){
		this.Level=Level;
	}
	
	/**
	 * Recupera el Nivel en el Que se encuentra el Juego, 
	 * para poder setear las reglas necesarias de cada nivel
	 * y asi saber en que nivel estamos
	 * @return Level;
	 * */
	public int getLevel(){
		return Level;
	}
	
	public int getBallLevel(){
		int balls;
			balls = this.Level*5;
		return balls;
	}
	
	/**
	 * Recupera la instancia compartida de SpriteBatch
	 * @return SpriteBatch en uso por el juego
	 */
	public SpriteBatch getSpriteBatch(){
		return this.batch;
	}
	
//	public void onBackPressed(){
//	     // do something here and don't write super.onBackPressed()
//	}
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
	
	@Override
	public void pause() {
		super.pause();
		// TODO Auto-generated method stub
	}
	
	@Override
	public void resume() {
		super.resume();
		// TODO Auto-generated method stub

	}
<<<<<<< HEAD
=======
>>>>>>> 033bf79e1c5746ec0ba0a533c76a6f1d8c905421
=======
>>>>>>> 1b477b130d4bf2878ca2027c9d21504af74393c5
}
