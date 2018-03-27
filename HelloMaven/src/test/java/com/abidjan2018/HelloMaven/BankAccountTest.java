package com.abidjan2018.HelloMaven;
import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		BankAccount ac = new BankAccount();
		ac.deposit (50);
	
		assertEquals (ac.balance, 50);
		
		ac.retrait(20);
		
		assertEquals (ac.balance,30);
	
		
	}

}
