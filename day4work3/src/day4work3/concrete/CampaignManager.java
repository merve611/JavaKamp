package day4work3.concrete;

import day4work3.abstracts.CampaignService;
import day4work3.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanyayý eklediniz: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanyayý sildiniz: " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanyayý güncellediniz: " + campaign.getCampaignName());
		
	}

}
