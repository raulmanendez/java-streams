package preparation.runtime;

public class FunctionalCheck {

}

interface FunctionalSuper{
	void save();
}

@FunctionalInterface
interface FunctionalI extends FunctionalSuper{
	 
	default void save1() {
		
	}
}
