public class Human extends Heroes {

  private boolean canOpenChest;
  private double criticalDamage;

  public Human() {

  }

  public Human(String nameOfHero, ClassOfHero classOfHero, double experience, double intellect,
      double strength, double agility, double spirit, double stamina, double damage, int year,
      int month, int day, boolean canOpenChest, double criticalDamage) {
    super(nameOfHero, classOfHero, experience, intellect, strength, agility, spirit, stamina,
        damage, year, month, day);
    this.canOpenChest = canOpenChest;
    this.criticalDamage = criticalDamage;
  }

  public double criticalHit () {
    damage = damage*criticalDamage;
    return damage;
  }

  public void shoutVoice() {
    System.out.println("Засунь свои усы Ермошиной в трусы");
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
      System.out.println("Этот герой не умеет прыгать");
    } else {
      System.out.println("Этот герой умеет прыгать");
    }
  }





  @Override
  public void gainExperince() {
    System.out.println("Нужно бооольше опыта...");

  }
//левелы
  public void gainExperince(int incExp) {
    for (int i = 1; i < 80; i++) {
     experience = experience+(i*incExp);
    }
    System.out.println("На 80-м уровне у героя будет " + experience + " опыта");

  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Human{");
    sb.append("canOpenChest=").append(canOpenChest);
    sb.append(", criticalDamage=").append(criticalDamage);
    sb.append('}');
    return sb.toString();
  }
}






