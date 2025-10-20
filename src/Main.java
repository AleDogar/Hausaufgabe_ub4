import java.util.Arrays;

public class Main {

    public void run() {
        ShopUtils shopUtils = new ShopUtils();

        // 1. Billigste Tastatur finden
        int[] tastaturen = {40, 35, 70, 15, 45};
        int billigste = shopUtils.findCheapestKeyboard(tastaturen);
        System.out.println("Billigste Tastatur: " + billigste);

        // 2. Teuersten Gegenstand finden
        int[] tastaturen2 = {15, 20, 10, 35};
        int[] usbLaufwerke = {20, 15, 40, 15};
        int teuerster = shopUtils.findMostExpensiveItem(tastaturen2, usbLaufwerke);
        System.out.println("Teuerster Gegenstand: " + teuerster);

        // 3. Teuerstes USB Laufwerk unter Budget finden
        int[] usbPreise = {15, 45, 20};
        int budget = 30;
        int teuerstesUsb = shopUtils.findMostExpensiveUsbUnderBudget(usbPreise, budget);
        System.out.println("Teuerstes USB Laufwerk unter Budget: " + teuerstesUsb);

        // 4. Maximal ausgegebener Betrag (Tastatur + USB) unter Budget finden
        int[] tastaturen3 = {40, 50, 60};
        int[] usbPreise3 = {8, 12};
        int budget3 = 60;
        int maxAusgabe = shopUtils.findMaxSpent(tastaturen3, usbPreise3, budget3);
        System.out.println("Maximal ausgegebener Betrag: " + maxAusgabe);

        int[] tastaturen4 = {60};
        int maxAusgabe2 = shopUtils.findMaxSpent(tastaturen4, usbPreise3, budget3);
        System.out.println("Maximal ausgegebener Betrag: " + maxAusgabe2);

        int[] tastaturen5 = {40, 60};
        int maxAusgabe3 = shopUtils.findMaxSpent(tastaturen5, usbPreise3, budget3);
        System.out.println("Maximal ausgegebener Betrag: " + maxAusgabe3);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
