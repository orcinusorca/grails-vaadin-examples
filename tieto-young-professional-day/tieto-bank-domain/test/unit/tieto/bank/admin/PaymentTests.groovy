package tieto.bank.admin



import grails.test.mixin.*
import grails.validation.ValidationException

import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Payment)
class PaymentTests {


	void testAmountConstraintFail() {
		Payment p = new Payment()
		p.amount = 10
		p.save(failOnError:true)
	}

	void testAmountConstraintFailzero() {
		Payment p = new Payment()
		p.amount = 0
		p.save(failOnError:true)
	}
}
