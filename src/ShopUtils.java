public class ShopUtils {

    // 1. Methode: Finde den billigsten Preis einer Tastatur
    public int findCheapestKeyboard(int[] keyboardPrices) {
        if (keyboardPrices == null || keyboardPrices.length == 0) {
            return -1;
        }

        int min = keyboardPrices[0];
        for (int i = 1; i < keyboardPrices.length; i++) {
            if (keyboardPrices[i] < min) {
                min = keyboardPrices[i];
            }
        }
        return min;
    }

    // 2. Methode: Finde den teuersten Gegenstand
    public int findMostExpensiveItem(int[] keyboardPrices, int[] usbPrices) {
        if ((keyboardPrices == null || keyboardPrices.length == 0) &&
                (usbPrices == null || usbPrices.length == 0)) {
            return -1;
        }

        int max = -1;

        if (keyboardPrices != null) {
            for (int i = 0; i < keyboardPrices.length; i++) {
                if (keyboardPrices[i] > max) {
                    max = keyboardPrices[i];
                }
            }
        }

        if (usbPrices != null) {
            for (int i = 0; i < usbPrices.length; i++) {
                if (usbPrices[i] > max) {
                    max = usbPrices[i];
                }
            }
        }

        return max;
    }

    // 3. Methode: Finde das teuerste USB Laufwerk
    public int findMostExpensiveUsbUnderBudget(int[] usbPrices, int budget) {
        if (usbPrices == null || usbPrices.length == 0) {
            return -1;
        }

        int max = -1;
        for (int i = 0; i < usbPrices.length; i++) {
            int price = usbPrices[i];
            if (price <= budget && price > max) {
                max = price;
            }
        }
        return max;
    }

    // 4. Methode: Finde den maximalen ausgegebenen Geldbetrag für Tastatur + USB Laufwerk
    public int findMaxSpent(int[] keyboardPrices, int[] usbPrices, int budget) {
        if (keyboardPrices == null || usbPrices == null ||
                keyboardPrices.length == 0 || usbPrices.length == 0) {
            return -1;
        }

        int max = -1;

        for (int i = 0; i < keyboardPrices.length; i++) {
            for (int j = 0; j < usbPrices.length; j++) {
                int total = keyboardPrices[i] + usbPrices[j];
                if (total <= budget && total > max) {
                    max = total;
                }
            }
        }
        return max;
    }
}
