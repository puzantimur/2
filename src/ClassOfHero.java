public enum ClassOfHero {
  ROGUE ("Rogue", "dagger dance", "dagger", 870),
  PRIEST("Priest", "holy song", "staff", 723),
  WARLOCK("Warlock", "infernal", "staff", 821),
  PALADIN("Palading", "freedom", "hammer", 918),
  WARRIOIR("Warrior", "blade vortex", "staff", 920),
  SHAMAN("Shaman", "call of nature", "cudgel", 890),
  MAGE("Mage", "freeze", "staff", 789),
  HUNTER("Hunter", "aimed shot", "bow and arrows", 900),
  DRUID("Druid", "merge with nature", "saber", 720),
  DARK_KNIGHT("Dark knight", "dancing blood", "sword", 990);
  private String name;
  private String ultimate;
  private String firstWeapon;
  private int firstHealthPointBar;

  ClassOfHero(String name, String ultimate, String firstWeapon, int firstHealthPointBar) {
    this.name = name;
    this.ultimate = ultimate;
    this.firstWeapon = firstWeapon;
    this.firstHealthPointBar = firstHealthPointBar;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUltimate() {
    return ultimate;
  }

  public void setUltimate(String ultimate) {
    this.ultimate = ultimate;
  }

  public String getFirstWeapon() {
    return firstWeapon;
  }

  public void setFirstWeapon(String firstWeapon) {
    this.firstWeapon = firstWeapon;
  }

  public int getFirstHealthPointBar() {
    return firstHealthPointBar;
  }

  public void setFirstHealthPointBar(int firstHealthPointBar) {
    this.firstHealthPointBar = firstHealthPointBar;
  }
}
