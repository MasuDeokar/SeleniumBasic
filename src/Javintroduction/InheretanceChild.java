package Javintroduction;

import org.testng.annotations.Test;

public class InheretanceChild extends InheretanceParent{
	@Test
	public void testRun() {
		int a=3;		
		InheretanceChild2 ch2 = new InheretanceChild2(a);
		doThis();
		System.out.println(ch2.increment());
		System.out.println(ch2.decrement());
		
		System.out.println(ch2.multiplication());
		
		
	}
}
