package mob;

public class Agumon extends Digimon /* implements DigimonAction */{

	/*
	 * */
	
	@Override
	public void attack() {
		System.out.println( this.name + " 공격!!");
	}

	@Override
	public void skill() {
		System.out.println(getName() + " 꼬마불꽃 ~ ");
	}

	@Override
	public void sayHello() {
		super.sayHello();
//		System.out.println("나는 아구몬이야!~");
	}
	
	
	
}
