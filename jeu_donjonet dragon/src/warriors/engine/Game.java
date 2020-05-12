package warriors.engine;

import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;

public class Game implements GameState {
	
	
	
	String playerName;
	Hero hero;
	Map map;
	String gameID;
	static int currentCase;
	GameStatus gameStatus;
	
	public Game(String PlayerName,Hero hero,Map map) {
		this.playerName=PlayerName;
		this.hero=hero;
		this.map=map;
		this.gameID="1";
		this.currentCase=0;
		this.gameStatus= GameStatus.IN_PROGRESS;
		
	}

	@Override
	public String getPlayerName() {
		// TODO Auto-generated method stub
		return this.playerName;
	}

	@Override
	public String getGameId() {
		// TODO Auto-generated method stub
		return this.gameID;
	}

	@Override
	public GameStatus getGameStatus() {
		// TODO Auto-generated method stub
		return gameStatus;
	}

	@Override
	public Hero getHero() {
		// TODO Auto-generated method stub
		return this.hero;
	}

	@Override
	public Map getMap() {
		// TODO Auto-generated method stub
		return this.map;
	}

	@Override
	public String getLastLog(int dices) {
		// TODO Auto-generated method stub
		
		return "vous avez fais un " + dices+"\n"+
				"vous etes sur la case "+ currentCase;
	}

	
	public int getCurrentCase() {
		// TODO Auto-generated method stub
		return currentCase;
	}
	
	public static  void setCurrentCase(int dices){
		currentCase= currentCase + dices;
		
		
	}
	
	

}
