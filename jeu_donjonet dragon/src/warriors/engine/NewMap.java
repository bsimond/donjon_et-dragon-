package warriors.engine;


import warriors.contracts.*;


public class NewMap implements Map{

	String name="donjon";
	int NumberOfCase=64;
	
	
	public NewMap() {
		this.getName();
		this.getNumberOfCase();
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getNumberOfCase() {
		// TODO Auto-generated method stub
		return NumberOfCase;
	}
	
}	
	
	
	
	
	
	