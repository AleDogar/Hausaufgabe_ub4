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

    // 3. Methode: Finde das teuerste USB Laufwerk
    public int findMostExpensiveUsbUnderBudget(int[] usbPrices, int budget) {
        int maxAffordable = -1;
        for (int i = 0; i < usbPrices.length; i++) {
            if (usbPrices[i] <= budget && usbPrices[i] > maxAffordable) {
                maxAffordable = usbPrices[i];
            }
        }
        return maxAffordable;
    }

    // 4. Methode: Finde den maximalen ausgegebenen Geldbetrag für Tastatur + USB Laufwerk
    public int findMaxSpent(int[] keyboardPrices, int[] usbPrices, int budget) {
        int maxSpent = -1;
        for (int i = 0; i < keyboardPrices.length; i++) {
            for (int j = 0; j < usbPrices.length; j++) {
                int total = keyboardPrices[i] + usbPrices[j];
                if (total <= budget && total > maxSpent) {
                    maxSpent = total;
                }
            }
        }
        return maxSpent;
    }
}
