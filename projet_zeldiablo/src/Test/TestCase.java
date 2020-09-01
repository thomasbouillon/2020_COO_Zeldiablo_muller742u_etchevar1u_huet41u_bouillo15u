package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Elements.Case;

/** 
 * teste la classe Case
 */
public class TestCase {
	/**
	 * teste le constructeur avec les valeurs par defauts
	 */
	@Test
	public void test_ConstructeurDefaut() {
		Case c = new Case(0, 0, 0);
		Boolean trouve = false;
		
		assertEquals("la valeur par defaut n est pas bonne",0, c.getX());
		assertEquals("la valeur par defaut n est pas bonne",0,c.getY());
		
	}
}
