package taskes.task7;

import java.util.ArrayList;
import java.util.List;

public class ShootingRange {
    private final int maxSize;
    private int targetOfShooting;
    private List<String> bullets = new ArrayList<>();

    public ShootingRange(int maxSize) {
        this.maxSize = maxSize;
    }


    public void loadBullet(String bullet) {
        if (bullets.size() < maxSize) {

            bullets.add(bullet);
        }
    }


    public boolean isLoaded() {
        return bullets.size() > 0;
    }

    protected void magazineCondition() {
        if (isLoaded()) {
            System.out.println("Magazine is ful.You have " + bullets.size() + " bullets");
        }


    }

    private void targetOfShooting(int targetOfShooting) {
        System.out.print(" You hit in  |" + targetOfShooting + "|");
        if (targetOfShooting == 0) {
            System.out.println(".Unfortunately,you missed. Correct yourself\n");

        } else if (targetOfShooting < 6 & targetOfShooting > 0) {
            System.out.println(". Next shot will be better. Do not worry.\n ");
        } else if (targetOfShooting < 10) {
            System.out.println("Good shot. You hit in \n ");
        } else {
            System.out.println(" !!! BRAVO !!!\n");
        }

    }

    // metoda imitująca strzelanie - pozbawianie się kul z magazynka
    public void shoot(int targetOfShooting) {
        // wykorzystanie metody sprawdzającej zawartość magazynku
        if (!isLoaded()) {
            magazineCondition();

        } else {// jeśli nie jest pusty to mozemy strzelać -> pozbawiając się kul z magazynka (listy bullets metodą remove)
            String shot = bullets.remove(bullets.size() - 1);
            System.out.print("Twój " + shot + " strzał.");
            // gdy wystrzelimy wszystkie kule magazynek znów będzie pusty
            if (!isLoaded()) {
                magazineCondition();
            }
            targetOfShooting(targetOfShooting);

        }
    }
}