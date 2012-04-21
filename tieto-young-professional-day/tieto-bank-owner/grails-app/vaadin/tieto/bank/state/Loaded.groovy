package tieto.bank.state

import tieto.bank.*
class Loaded extends AbstractState
{
	@Override
 public void initTxtAccountBalance(AccountDataForm)
 {
	 super.initTxtAccountBalance(form)
	 form.txtAccountBalance.setEnabled(true)
	 form.txtAccountBalance.setValue(form.account.getBalance())
 }
}
