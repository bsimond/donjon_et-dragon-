package warriors.engine;

import warriors.contracts.Hero;

public class Wizard implements Hero{
	
		String name="merlin";
		String image="image";
		int vie=3;
		int force=8;
					
		public Wizard() {
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


