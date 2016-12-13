package ex.jsf.campaign;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class CampaignProducer implements Serializable {

	private enum Mode {
		EDIT, ADD
	}
  
	private Campaign campaign;
	private Mode mode;

	public Campaign getSelectedCampaign() {
		return campaign;
	}
	public void setSelectedCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public boolean isAddMode() {
		return mode == Mode.ADD;
	}
	public void prepareAddCampaign() {
		this.campaign = new Campaign();
		this.mode = Mode.ADD;
	}
	public void prepareEditCampaign(Campaign campaign) {
		this.campaign = campaign;
		this.mode = Mode.EDIT;
	}

  private static final long serialVersionUID = 1L;
}
