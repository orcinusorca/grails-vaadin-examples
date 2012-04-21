package tieto.bank.state

import tieto.bank.AccountDataForm
class Stateholder {
	private AccountDataForm form
	private State state

	public Stateholder(AccountDataForm form, State state) {
		super();
		this.form = form;
		this.state = state;
	}
	public void setState(State state) {
		this.state=state
		applyState()
	}
	private void applyState() {
		state.initTxtAccountBalance(form)
		state.initBtnRemove(form)
		state.initBtnSave(form)
	}
}
