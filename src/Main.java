import joo.strategy.impl.AInterfaceImpl;
import joo.strategy.impl.Aobj;
import joo.strategy.inf.AInterface;

public class Main {

	public static void main(String[] args) {
		
		AInterface ainterFace = new AInterfaceImpl();
		//
		ainterFace.funcA();
		
		Aobj aobj = new Aobj();
		aobj.funcAA();

	}	

}
