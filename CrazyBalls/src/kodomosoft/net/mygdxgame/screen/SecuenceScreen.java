package kodomosoft.net.mygdxgame.screen;

import kodomosoft.net.mygdxgame.CrazyBallsMain;
import kodomosoft.net.mygdxgame.actor.RemsBallActor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

public class SecuenceScreen extends AbstractScreen {

	private Stage stage;
	private int cont;
	
	public SecuenceScreen(CrazyBallsMain game) {
		super(game);
		
	}
	
	@Override
	public void show() {
		//Inicializa el Stage y lo asigna a la Entrada
		stage = new Stage(400, 800, true, game.getSpriteBatch());
		Gdx.input.setInputProcessor(stage);
		
		//Tomamos el orden del level de game.levelRules, lo partimos
		//y los asignamos al arreglo temporal de String "temp[]"
		String temp[] = game.levelRules[game.getLevel()-1].split(","); // le indicamos que haga el corte en cada ','
		
		//Creamos las variables x & y para controlar la posicion de las bolas en la pantalla
		int x = 0, // x controla la posicion en el eje 'x'
			y = (int) (stage.getHeight()/2*1.4); // y controla la posicion en el eje 'y'
		
		//ciclo for para organizar las pelotas, segun el orden del level
		for(int i =0; i<temp.length; i++){
			x+=100;
			
			if(i==0)
				x=50;
			
			int j = Integer.parseInt(temp[i]);
			if(x>stage.getWidth()-80){
				y-=100;
				x=50;
			}
			createBall(j, x, y);
		}
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act();
		stage.draw();
		delay(1, game.getLevel());
		if(cont>0){
			game.setScreen(new PlayScreen(game));
		}
		
	}
	
	@Override
	public void resize(int width, int height) {
		stage.setViewport(400, 800, true);
	}
	
	@Override
	public void hide() {
		super.hide();
		Gdx.input.setInputProcessor(null);
	}
	
	@Override
	public void dispose() {
		super.dispose();
		stage.dispose();
	}
	
	private void createBall(int id, int x, int y){
		RemsBallActor ball = new RemsBallActor(x, y, id);
		ball.setVelocidad(0, 0);
		stage.addActor(ball);
	}
	
	private void delay(final int indice, double seg) {
		float delay = (float) seg; // seconds

		Timer.schedule(new Task() {
			@Override
			public void run() {
				// Do your work
				cont = indice;
			}
		}, delay);
	}

}
