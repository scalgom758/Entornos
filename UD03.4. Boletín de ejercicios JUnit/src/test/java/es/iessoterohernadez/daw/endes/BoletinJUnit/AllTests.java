package es.iessoterohernadez.daw.endes.BoletinJUnit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestAccount.class, TestBoa.class, TestFridge.class, TestOperadorAritmetico.class, TestPila.class,
		TestSubscripcion.class })
public class AllTests {

}
