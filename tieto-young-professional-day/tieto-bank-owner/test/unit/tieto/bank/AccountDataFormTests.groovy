package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

import tieto.bank.admin.Account

/**n
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class EmptyTests 
{

    void setUp() {
        form = new AccountDataForm()
		Account account = new Account()
	
    }

//    void tearDown() {
//        // Tear down logic here
//    }

    void test_TxtAccountBalance_IsEnabled() 
	{
        boolean enabled = form.txtAccountBalance.isEnabled()
		asserEquals(false, enabled)
    }
	void test_TxtAccountBalance_GetValue()
	{
		boolean enabled = form.txtAccountBalance.getValue()
		asserEquals(0, enabled)
	}
}
