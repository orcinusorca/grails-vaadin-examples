package tieto.bank.admin

class Payment {
	Date date
	Integer amount
	Account from
	Account to
	static constraints = {

		// TODO: amount must be higher than 0
		amount min: 1
		from nullable:true
		to nullable:true
		date nullable:true

	}
	def beforeInsert() {
		date = new Date()
	}
}

