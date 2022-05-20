import java.util.StringJoiner;

public class NightElf extends Heroes {

  Weapon weapon = new Weapon(300, 200);
  private boolean invisibility;
  private int increaseHealth;
  private double price;

  public NightElf() {
    price = 2890;
  }

  public NightElf(String nameOfHero, ClassOfHero classOfHero, double experience, double intellect,
      double strength, double agility, double spirit, double stamina, double damage, int year,
      int month, int day, boolean invisibility, int increaseHealth, double price) {
    super(nameOfHero, classOfHero, experience, intellect, strength, agility, spirit, stamina,
        damage, year, month, day);
    this.price = price;
    this.invisibility = invisibility;
    this.increaseHealth = (int) (increaseHealth + stamina);
  }

  public void gainStamina(double increase) {
    stamina *= increase;
  }

  public void canKillHuman(double stam) {
    if (this.damage > stam) {
      System.out.println("Ночной эльф может убить Human");
    } else {
      System.out.println("Ночной эльф не может убить Human");
    }
  }

  @Override
  public void attack() {

    if (classOfHero == ClassOfHero.DARK_KNIGHT) {
      System.out.println(
          "Тёмный рыцарь атакует с помощью " + ClassOfHero.DARK_KNIGHT.getFirstWeapon() +
              " " + "и " + ClassOfHero.DARK_KNIGHT.getUltimate());
    }
    if (classOfHero == ClassOfHero.PALADIN) {
      System.out.println("Паладин атакует с помощью " + ClassOfHero.PALADIN.getFirstWeapon() +
          " " + "и " + ClassOfHero.PALADIN.getUltimate());
    }
    if (classOfHero == ClassOfHero.DRUID) {
      System.out.println("Друид атакует с помощью " + ClassOfHero.DRUID.getFirstWeapon() +
          " " + "и " + ClassOfHero.DRUID.getUltimate());
    }
    if (classOfHero == ClassOfHero.ROGUE) {
      System.out.println("Разбойник атакует с помощью " + ClassOfHero.ROGUE.getFirstWeapon() +
          " " + "и " + ClassOfHero.ROGUE.getUltimate());
    }
    if (classOfHero == ClassOfHero.MAGE) {
      System.out.println("Маг атакует с помощью " + ClassOfHero.MAGE.getFirstWeapon() +
          " " + "и " + ClassOfHero.MAGE.getUltimate());
    }
    if (classOfHero == ClassOfHero.PRIEST) {
      System.out.println("Жрец атакует с помощью " + ClassOfHero.PRIEST.getFirstWeapon() +
          " " + "и " + ClassOfHero.PRIEST.getUltimate());
    }
    if (classOfHero == ClassOfHero.WARRIOIR) {
      System.out.println("Воин атакует с помощью " + ClassOfHero.WARRIOIR.getFirstWeapon() +
          " " + "и " + ClassOfHero.WARRIOIR.getUltimate());
    }

    if (classOfHero == ClassOfHero.SHAMAN) {
      System.out.println("Шаман атакует с помощью " + ClassOfHero.SHAMAN.getFirstWeapon() +
          " " + "и " + ClassOfHero.SHAMAN.getUltimate());
    }

    if (classOfHero == ClassOfHero.HUNTER) {
      System.out.println("Охотник атакует с помощью " + ClassOfHero.HUNTER.getFirstWeapon() +
          " " + "и " + ClassOfHero.HUNTER.getUltimate());
    }

    if (classOfHero == ClassOfHero.WARLOCK) {
      System.out.println("Чернокнижник атакует с помощью " + ClassOfHero.WARLOCK.getFirstWeapon() +
          " " + "и " + ClassOfHero.WARLOCK.getUltimate());
    }

  }

  public void jump(double coefficient) {
    super.jump();
    if (agility < coefficient * 60) {
      System.out.println("Эльф не умеет прыгать");
    } else {
      System.out.println("Эльф умеет прыгать");
    }
  }

  public void wornWeapon() {
    damage = weapon.addingDamage + damage;
    agility = weapon.addingAgility + agility;

  }

  @Override
  public void gainExperince() {
    System.out.println("Стартовый набор опыта ночного эльфа = " + experience);
  }


  public void gainExperince(int incExp) {
    for (int i = 1; i < 80; i++) {
      experience = experience + (i * incExp);
    }
    System.out.println("На 80-м уровне у ночного эльфа будет " + experience + " опыта");
  }

  public boolean isInvisibility() {
    return invisibility;
  }

  public void setInvisibility(boolean invisibility) {
    this.invisibility = invisibility;
  }

  public int getIncreaseHealth() {
    return increaseHealth;
  }

  public void setIncreaseHealth(int increaseHealth) {
    this.increaseHealth = increaseHealth;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", NightElf.class.getSimpleName() + "[", "]")
        .add("nameOfHero='" + nameOfHero + "'")
        .add("classOfHero=" + classOfHero)
        .add("experience=" + experience)
        .add("intellect=" + intellect)
        .add("strength=" + strength)
        .add("agility=" + agility)
        .add("spirit=" + spirit)
        .add("stamina=" + stamina)
        .add("damage=" + damage)
        .add("dateOfCreating=" + dateOfCreating)
        .add("invisibility=" + invisibility)
        .add("increaseHealth=" + increaseHealth)
        .add("price=" + price)
        .toString();
  }

  public class Weapon {

    int addingDamage = 200;
    int addingAgility = 100;

    public Weapon(int addingDamage, int addingAgility) {
      this.addingDamage = addingDamage;
      this.addingAgility = addingAgility;
    }
  }


}




