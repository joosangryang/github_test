import joo.strategy.impl.AxImpl;
import joo.strategy.impl.GameCharacter;
import joo.strategy.impl.KnifeImpl;
import joo.strategy.impl.SwordImpl;

public class GameCharacterMain {

	public static void main(String[] args) {
		
		GameCharacter gc = new GameCharacter();
		gc.attack();

		gc.setWeapon(new SwordImpl());		
		gc.attack();
		
		gc.setWeapon(new KnifeImpl());		
		gc.attack();
		
		gc.setWeapon(new AxImpl());		
		gc.attack();
	}

}
