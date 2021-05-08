package day4work3;

import java.time.LocalDate;

import day4work3.concrete.CampaignManager;
import day4work3.concrete.CustomerCheckManager;
import day4work3.concrete.CustomerManager;
import day4work3.concrete.SalesManager;
import day4work3.entities.Campaign;
import day4work3.entities.Customer;
import day4work3.entities.Game;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1996, 8, 30);
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Merve");
		customer.setLastName("Çakýroðlu");
		customer.setNationalityId("12345");
		customer.setDateOfBirth(date);
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("gta");
		game.setPrice(100);
		
		Campaign campaign = new Campaign();
		campaign.setCampaignCode("123");
		campaign.setCampaignName("Öðrencilere Özel");
		campaign.setDiscountRate(50);
	
		
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		customerManager.Save(customer);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sale(game, customer,campaign);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		

	}

}
