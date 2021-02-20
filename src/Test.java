import weapon.*;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Player player = new Player(new Weapon[]{
                new Pislot(), new MachineGun(), new RGP(), new WaterGun(), new Slingshot()
        });

        System.out.format(
                "У игрока %d слотов с оружием, введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );

        int slot;
        Scanner scan = new Scanner(System.in);
        while (true) {
            slot = scan.nextInt();
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}