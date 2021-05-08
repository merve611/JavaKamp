package day4work3.entities;

import day4work3.abstracts.Entity;

public class Campaign implements Entity{

	private String campaignCode;
	private String campaignName;
	private int discountRate;		//indirim oraný
	
	
	public Campaign() {}

	public Campaign(String campaignCode, String campaignName, int discountRate) {
		super();
		this.campaignCode = campaignCode;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}


	public String getCampaignCode() {
		return campaignCode;
	}


	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public int getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
}
