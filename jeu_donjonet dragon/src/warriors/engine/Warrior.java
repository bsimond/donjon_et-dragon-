package warriors.engine;

import warriors.contracts.Hero;

public class Warrior implements Hero{
	String name="hulk";
	String image="image";
	int vie=5;
	int force=5;
	
		
	public Warrior() {
		this.getName();
		this.getImage();
		this.getLife();
		this.getAttackLevel();
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getImage() {
		
		return image;
	}

	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return vie;
	}

	@Override
	public int getAttackLevel() {
		// TODO Auto-generated method stub
		return force;
	}

}
