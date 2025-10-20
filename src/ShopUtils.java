public class ShopUtils {

    // 1. Methode: Finde den billigsten Preis einer Tastatur
    public int findCheapestKeyboard(int[] keyboardPrices) {
        int minPrice = keyboardPrices[0];  // Setze erstes Element als Minimum

        for (int i = 1; i < keyboardPrices.length; i++) {
            if (keyboardPrices[i] < minPrice) {
                minPrice = keyboardPrices[i];  // Aktualisiere Minimum, falls kleiner gefunden
            }
        }

        return minPrice;  // Rückgabe des kleinsten Preises
    }
}
