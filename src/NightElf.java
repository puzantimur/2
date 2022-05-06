public class NightElf extends Heroes {

  private boolean invisibility;
  private int increaseHealth;

  public NightElf() {
  }

  public NightElf(String nameOfHero, ClassOfHero classOfHero, double experience, double intellect,
      double strength, double agility, double spirit, double stamina, double damage, int year,
      int month, int day, boolean invisibility, int increaseHealth) {
    super(nameOfHero, classOfHero, experience, intellect, strength, agility, spirit, stamina,
        damage, year, month, day);
    this.invisibility = invisibility;
    this.increaseHealth = (int) (increaseHealth+stamina);
  }

  public void gainStamina (double increase) {
    stamina *= increase;
  }

  public void canKillHuman (double stam) {
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
    if (agility < coefficient*60) {
      System.out.println("Эльф не умеет прыгать");
    } else {
      System.out.println("Эльф умеет прыгать");
    }
  }


  @Override
    public void gainExperince () {
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
}




