// T - is a type (for example: T can be Integer,String, etc...)
public class Tester<T> {
	
	public T prop;
	
	public Tester() {}

	public Tester(T prop) {
		this.prop = prop;
	}
	
	public T getProrDescription() {
		return prop; 
	}
}
