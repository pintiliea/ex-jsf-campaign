package ex.jsf.campaign;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class ListCampaignsController implements Serializable {

	@Inject
	private CampaignProducer campaignProducer;

	private Campaign campaignToDelete;

	public String doAddCampaign() {
		campaignProducer.prepareAddCampaign();
		return Pages.EDIT_CAMPAIGN;
	}
	public String doEditCampaign(Campaign campaign) {
		campaignProducer.prepareEditCampaign(campaign);
		return Pages.EDIT_CAMPAIGN;
	}
	public String doEditDonationForm(Campaign campaign) {
		campaignProducer.setSelectedCampaign(campaign);
		return Pages.EDIT_DONATION_FORM;
	}
	public String doListDonations(Campaign campaign) {
		campaignProducer.setSelectedCampaign(campaign);
		return Pages.LIST_DONATIONS;
	}
	public void doDeleteCampaign(Campaign campaign) {
		this.campaignToDelete = campaign;
		System.out.println("Campaign registered for deletion!");
	}
	public void commitDeleteCampaign() {
			System.out.println("Deletion not implemented, yet!");
	}

	private static final long serialVersionUID = 1L;
}
