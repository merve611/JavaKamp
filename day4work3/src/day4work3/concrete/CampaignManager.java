package day4work3.concrete;

import day4work3.abstracts.CampaignService;
import day4work3.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanyay� eklediniz: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanyay� sildiniz: " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanyay� g�ncellediniz: " + campaign.getCampaignName());
		
	}

}
