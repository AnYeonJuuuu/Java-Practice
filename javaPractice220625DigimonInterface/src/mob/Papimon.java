package mob;

public class Papimon extends Digimon{

	@Override
	public void action() {

		System.out.println(super.getName() + "파피몬 공격");
	}

	@Override
	public void attack() {

		System.out.println(super.getName() + "파피파피!~!~");
	}

}
