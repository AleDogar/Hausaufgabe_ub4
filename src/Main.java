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
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
