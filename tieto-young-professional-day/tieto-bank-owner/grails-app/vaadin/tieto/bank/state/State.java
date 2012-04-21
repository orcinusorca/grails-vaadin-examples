package tieto.bank.state;

import tieto.bank.AccountDataForm;

public interface State {
	
	void initTxtAccountBalance(AccountDataForm form);

	void initBtnRemove(AccountDataForm form);

	void initBtnSave(AccountDataForm form);

}
