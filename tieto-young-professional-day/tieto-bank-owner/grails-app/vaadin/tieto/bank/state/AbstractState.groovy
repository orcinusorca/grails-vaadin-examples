package tieto.bank.state

import tieto.bank.AccountDataForm;

abstract class AbstractState implements State {

	@Override
	public void initTxtAccountBalance(AccountDataForm form)
	 {
		form.txtAccountBalance.setEnabled(false)
		form.txtAccountBalance.setValue(form.account.getBalance())
		
	}

	@Override
	public void initBtnRemove(AccountDataForm form) {
		form.nitBtnRemove.setEnabled(false)
		
		
	}

	@Override
	public void initBtnSave(AccountDataForm form) {
		form.initBtnSave.setEnabled(false)
		
		
	}
	
}
