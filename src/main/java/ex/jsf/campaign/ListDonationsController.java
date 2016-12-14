package ex.jsf.campaign;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class ListDonationsController implements Serializable {

	public String doOk() {
		return Pages.LIST_CAMPAIGNS;
	}

  private static final long serialVersionUID = 1L;
}
