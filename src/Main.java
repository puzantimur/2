
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Heroes h1 = new Human();
        Heroes n1 = new NightElf();
        Human human = new Human("Patish", ClassOfHero.PALADIN, 200.2, 67,
            12, 78, 14, 200, 200, 2017, 1, 15, true, 21.6, 42141);

        Heroes hyman = new Human("Hannibal", ClassOfHero.ROGUE, 300.29, 79, 33,
            92, 20, 80, 2000, 2019, 2, 15, true, 33.2, 3411);

        takeExperience takeExperience = new Human("Overflow", ClassOfHero.PRIEST, 200, 79, 33,
            92, 20, 80, 2000, 2019, 2, 15, true, 33.2, 3211);

        NightElf nightElf = new NightElf("Bouna", ClassOfHero.PRIEST, 200, 200, 200, 200, 200,
            200, 2018, 2000, 1, 1, true, 200, 3205);

        Bots bot1 = new Bots(20, "LichKing", 300.2);

        Bots bot2 = new Bots(200, "Onicsia", 902.99);
        DungeonBoss dungeonBoss = new DungeonBoss();



        Heroes[] array = {human, hyman, nightElf};
        Store <Heroes> heroesStore = new Store<>(array);
        heroesStore.printProducts(array);
        heroesStore.purchase(0, 42142);
        heroesStore.sell(h1, 1565);
        nightElf.wornWeapon();
        System.out.println(nightElf);
        bot1.giveGoldToHero();
        human.protectedHuman();
        dungeonBoss.lootFromBoss();









    }

}
