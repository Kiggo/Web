package interface_ex.weapon;

public class Sword implements Weapon{

	@Override
	public void attack() {
		System.out.println("검으로 공격한다");
	}

}
