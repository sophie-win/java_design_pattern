package vmcs.controller;

import vmcs.model.Coin;
import vmcs.model.Drink;

public interface MachineryController {

    void changeCoinStock(Coin coin, int qty);

    void changeDrinkStock(Drink drink, int qty);

    void init();

    void lockDoor();

    void unLockDoor();

}
