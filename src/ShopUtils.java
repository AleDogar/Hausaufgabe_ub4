public class ShopUtils {

    // 1. Methode: Finde den billigsten Preis einer Tastatur
    public int findCheapestKeyboard(int[] keyboardPrices) {
        int minPrice = keyboardPrices[0];
        for (int i = 1; i < keyboardPrices.length; i++) {
            if (keyboardPrices[i] < minPrice) {
                minPrice = keyboardPrices[i];
            }
        }
        return minPrice;
    }

    // 2. Methode: Finde den teuersten Gegenstand
    public int findMostExpensiveItem(int[] keyboardPrices, int[] usbPrices) {
        int maxPrice = keyboardPrices[0];

        for (int i = 1; i < keyboardPrices.length; i++) {
            if (keyboardPrices[i] > maxPrice) {
                maxPrice = keyboardPrices[i];
            }
        }

        for (int i = 0; i < usbPrices.length; i++) {
            if (usbPrices[i] > maxPrice) {
                maxPrice = usbPrices[i];
            }
        }

        return maxPrice;
    }
}
