import java.util.Arrays;

public class Main {

    public void run() {
        ShopUtils shopUtils = new ShopUtils();

        // 1. Billigste Tastatur finden
        int[] tastaturen = {40, 35, 70, 15, 45};
        int billigste = shopUtils.findCheapestKeyboard(tastaturen);
        System.out.println("Billigste Tastatur: " + billigste);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
