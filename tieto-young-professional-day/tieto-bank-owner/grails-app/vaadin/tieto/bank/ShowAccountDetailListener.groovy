package tieto.bank

import org.hibernate.mapping.Property
import tieto.bank.admin.*
import com.vaadin.data.Property.*
import com.vaadin.data.Property.ValueChangeEvent
import com.vaadin.data.Property.ValueChangeListener
import com.vaadin.data.*

public class ShowAccountDetailListener implements ValueChangeListener
{

	OwnerApp app;
	@Override
	public void valueChange(ValueChangeEvent event)
	{
		Property p = event.getProperty()
		Account account = p.getValue()
		if(account)
		{
		app.form.setVisible(true)
		app.form.setAccount(account)
		}
		

	}

}
