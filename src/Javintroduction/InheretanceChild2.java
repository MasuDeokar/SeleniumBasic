package Javintroduction;

public class InheretanceChild2 extends InheretanceChild3 {

	int a;
	public InheretanceChild2(int a) {
		super(a); // Parent class constructor invoke. 
		this.a=a;
	}
	public int increment()
	{
		a=a+1;
		return a;
	}
	public int decrement()
	{
		a=a-2;
		return a;
	}

}
