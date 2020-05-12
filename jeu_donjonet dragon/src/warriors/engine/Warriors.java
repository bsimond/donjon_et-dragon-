package warriors.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import warriors.contracts.GameState;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.contracts.WarriorsAPI;

public class Warriors implements WarriorsAPI {
	
	ArrayList <Hero>listhero = new ArrayList<Hero>();
	ArrayList <NewMap>newmap = new ArrayList<NewMap>();
	
	HashMap<String, Game> listgame = new HashMap<String, Game>();
	public Warriors() {
	
	listhero.add(new Warrior());
	listhero.add(new Wizard());
	
	newmap.add(new NewMap());
	
	
	}

	
	

	@Override
	public List<? extends Hero> getHeroes() {
		// TODO Auto-generated method stub
		return listhero;
	}

	@Override
	public List<? extends Map> getMaps() {
		// TODO Auto-generated method stub
		return newmap;
	}

	@Override
	public GameState createGame(String playerName, Hero hero, Map map) {		
		Game game=new Game(playerName,hero,map);		
		listgame.put(game.getGameId(),game);			
		return game;
	}

	@Override
	public GameState nextTurn(String gameID) {		
		
		int dices= (int)(Math.random() *6)+1;		
		Game currentgame =listgame.get(gameID);
		Game.setCurrentCase(dices);
		
			

		
			
		
		
		return currentgame;
		
				
		}
		
		

}
