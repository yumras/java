package javastudy1;

public class InstantCook implements BurgerCook {
	// 인터페이스에 있는 메소드를 구현하는 부분
	public void makeBurger() {
		System.out.println("냉동햄버거");
	}

	public void makeSalad() {
		System.out.println("냉동샐러드");
	}
}
