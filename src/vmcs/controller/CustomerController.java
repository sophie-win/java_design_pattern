package vmcs.controller;

import java.util.List;
import vmcs.model.Coin;
import vmcs.model.Drink;
import vmcs.ui.CustomerPanel;

public interface CustomerController {

    public List<Coin> getCoinStocks();

    public void insertCoin(Coin coin);

    public List<Drink> getDrinkStocks();

    public void selectDrink(Drink drink);

    public void terminateTransaction();
}
