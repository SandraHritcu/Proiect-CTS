package Teste;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteMelodie {

	public static Test suite() {
		TestSuite suite = new TestSuite(TestSuiteMelodie.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestCaseConstructorMelodie.class);
		suite.addTestSuite(TestCaseSizeMelodie.class);
		//$JUnit-END$
		return suite;
	}

}
