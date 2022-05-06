public class DungeonBoss implements takeExperience{

  private String name;
  private int hp;

  public DungeonBoss() {
  }

  public DungeonBoss(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }


  @Override
  public void gainExperince() {
    System.out.println("Получает опыт за убийство героев");

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
}
