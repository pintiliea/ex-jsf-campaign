package ex.jsf.campaign;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

@SessionScoped
@Named
public class EditDonationFormController implements Serializable {

	private String textColor = "000000";
	private String bgColor = "ffffff";

  @Inject
	private CampaignProducer campaignProducer;

	public String doOk() {
		return Pages.LIST_CAMPAIGNS;
	}

  public String getUrl() {
		return "http://localhost:8080/ex-jsf-campaign/donateMoney.jsf?bgColor="
				+ bgColor + "&textColor=" + textColor + "&campaignId="
				+ campaignProducer.getSelectedCampaign().getId();
	}

  public String getTextColor() {
		return textColor;
	}
  public void setTextColor(String textColor) {
		this.textColor = textColor;
	}
	public String getBgColor() {
		return bgColor;
	}
	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

  private static final long serialVersionUID = 1L;
}
