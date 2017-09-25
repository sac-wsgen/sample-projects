package sample.library.client.ejb;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	BookBeanTestSuite.class,
	LoanBeanTestSuite.class,
	UserBeanTestSuite.class
})
public class LibraryTestSuite {

}
