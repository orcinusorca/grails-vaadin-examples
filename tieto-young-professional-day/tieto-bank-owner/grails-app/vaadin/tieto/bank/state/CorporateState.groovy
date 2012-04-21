package tieto.bank.state

import tieto.bank.AccountDataForm

class CorporateState extends Loaded {
	@Override
	public void initBtnRemove(AccountDataForm form)
	{
		super.initBtnRemove(form)
		form.btnRemove.setEnabled(true)
	}
	@Override
	public void initBtnSave(AccountDataForm form)
	{
		super.initBtnSave(form)
		form.btnSave.setEnabled(true)
	}

}
