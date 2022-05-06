import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Patish", ClassOfHero.PALADIN, 200.2, 67,
            12, 78, 14, 200, 200, 2017, 1, 15, true, 21.6);

        Heroes h = new Human("Hannibal", ClassOfHero.ROGUE, 300.29, 79, 33,
            92, 20, 80, 2000, 2019, 2, 15, true, 33.2);

        takeExperience takeExperience = new Human("Overflow", ClassOfHero.PRIEST, 200, 79, 33,
            92, 20, 80, 2000, 2019, 2, 15, true, 33.2);

        NightElf nightElf = new NightElf("Bouna", ClassOfHero.PRIEST, 200, 200, 200, 200, 200,
            200, 2018, 2000, 1, 1, true, 200);

        Bots bot1 = new Bots(20, "LichKing", 300.2);

        Bots bot2 = new Bots(200, "Onicsia", 902.99);

        nightElf.canKillHuman(human.stamina);
        human.getDateOfCreating();
        h.getDateOfCreating();
        human.gainExperince(2);
        nightElf.gainExperince();
        nightElf.gainExperince(20);
        System.out.println(h.getDateOfCreating());
        System.out.println(human.getDateOfCreating());
        System.out.println(nightElf.getDateOfCreating());


    }

}
