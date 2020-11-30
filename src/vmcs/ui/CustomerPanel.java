package vmcs.ui;

import java.util.List;
import vmcs.controller.CustomerController;
import vmcs.model.Coin;
import vmcs.model.Drink;

public interface CustomerPanel {

    public void updateInsertedAmount(int amount);

    public void displayInvalidCoin();

    public void disableCoinButtons();

    public void disableTransactions();

    public void enableTransactions();

    public void refreshDrinkPanel(List<Drink> drinkList);

    public String getInsertedAmount();

    public void dispenseDrink(Drink drink);

    public void dispenseChange(Coin coin);

    public void dispenseChange(List<Coin> coin);

    public void displayChange(int originalChange, int changeAvailable);

    public void resetState();

    public void enableTerminateButton();

    public void terminateTransaction();

    public void show();

    public void hide();

    public void refresh();

}
