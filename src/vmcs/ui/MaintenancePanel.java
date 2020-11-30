package vmcs.ui;

import vmcs.model.Coin;
import vmcs.model.Drink;

public interface MaintenancePanel {

    void addNewCoins(Coin coin);

    void addNewDrink(Drink drink);

    void invalidPassword();

    void lock();

    void resetPassword();

    void showTotalCashHeld(int total);

    void unlock();

    void validPassword();

    void show();

    void hide();

    void refresh();

}
