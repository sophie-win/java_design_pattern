package vmcs.util;

public class CurrencyHelper {

    public static String toCoins(int amount) {
        return amount + " c";
    }

    public static int coinsToAmount(String coins) {
        int results = 0;
        if (coins.contains("c")) {
            coins = coins.replace("c", "").trim();
            results = Integer.parseInt(coins);
        } else if (coins.contains("$")) {
            coins = coins.replace("$", "");
            results = Integer.parseInt(coins) * 100;
        }
        return results;
    }
}
