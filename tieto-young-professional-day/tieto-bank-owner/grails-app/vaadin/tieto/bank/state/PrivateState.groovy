package tieto.bank.state

import tieto.bank.AccountDataForm
class PrivateState extends Loaded
{

	@Override
	public void initBtnSave(AccountDataForm form) 
    {
		
	super.initBtnSave(form)
	form.btnSave.setEnabled(true)
	}
  
}
