package day4work3.concrete;

import day4work3.abstracts.SalesService;
import day4work3.entities.Campaign;
import day4work3.entities.Customer;
import day4work3.entities.Game;

public class SalesManager implements SalesService {

	@Override
	public void sale(Game game, Customer customer,Campaign campaign) {
		System.out.println(game.getGameName() + " Oyunu " + customer.getFirstName() + " Oyuncusuna sat��� yap�ld�.");
		
		System.out.println(game.getGameName() + "Oyununa" + "%"+ campaign.getDiscountRate() + "oran�nda indirim yap�ld�");
	}

}
