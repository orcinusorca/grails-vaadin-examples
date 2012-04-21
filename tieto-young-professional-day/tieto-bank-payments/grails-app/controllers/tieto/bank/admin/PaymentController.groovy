package tieto.bank.admin

class PaymentController {

	def index() {
		List<Payment> payments = Payment.list()
		return [payments:payments]
	}
	def remove()
	{
		Payment p =Payment.get(params.id)
		p?.delete()
		List payments = Payment.list()
		redirect(view:'index')
	}
}
