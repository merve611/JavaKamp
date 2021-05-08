package day4work3.abstracts;


import day4work3.entities.Campaign;
import day4work3.entities.Customer;
import day4work3.entities.Game;

public interface SalesService {

	void sale(Game game, Customer customer,Campaign campaign);
}
