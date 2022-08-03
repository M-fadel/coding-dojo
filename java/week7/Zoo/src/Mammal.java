	class Mammal{
	protected void name() {
		
	} int energyLevel ;
	
	public void DisplayEnergy() {
		System.out.print(this.energyLevel);
	}
	
	public Mammal(int num) {
		
		this.energyLevel = num;
	}

	public void setEnergy(int number) {
		this.energyLevel +=number;
	}



	public static void main(String[] args) {
		Gorilla GorillaTest = new Gorilla(100);
		GorillaTest.throwSomething();
		GorillaTest.throwSomething();
		GorillaTest.throwSomething();
		GorillaTest.eatBananas();
		GorillaTest.eatBananas();
		GorillaTest.clim();
		GorillaTest.DisplayEnergy();
		
		Bat bat = new Bat(300);
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.eathuman();
		bat.eathuman();
		bat.fly();
		bat.fly();
		bat.DisplayEnergy();
		
	}
}
class Gorilla extends Mammal{
	
	
	public Gorilla(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	public void throwSomething(){
		System.out.print("the gorilla throwed something");
		setEnergy(-5);
		
	}
	public void eatBananas() {
		System.out.println("The gorilla is satisfied");
		setEnergy(+10);
	}
	public void clim() {
		System.out.println("the gorilla has climed a tree");
		setEnergy(-10);
		
	}
	
}
	class Bat extends Mammal{

	public Bat(int num) {
		super(300);
		// TODO Auto-generated constructor stub
	}
		public void fly() {
			System.out.println("a bat is taking off");
			setEnergy(-50);
		}
		public void eathuman() {
			setEnergy(25);
		}
		public void attackTown() {
			System.out.println("the town is on fire");
			setEnergy(-100);
		}
}
