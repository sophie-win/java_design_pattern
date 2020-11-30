package vmcs.ui;

import vmcs.model.Coin;
import vmcs.model.Drink;

public interface MachineryPanel {

    void addCoinToUI(Coin coin);

    void addDrinkToUI(final Drink drink);

    void changeTextFieldState(boolean state);

    void updateCoinUI(Coin coin);

    void updateDoorLockState(boolean isLocked);

    void updateDrinkUI(Drink drink);

    void show();

    void hide();

    void refresh();

}
