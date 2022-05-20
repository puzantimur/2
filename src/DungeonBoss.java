import java.util.Arrays;
import java.util.StringJoiner;

public class DungeonBoss implements takeExperience {

  String[] loot = {"Ожерелье королевы", "Меч Рагнаросса", "Лук Предназначения",
      "Печать света", "Плащ тьмы"};
  SomeLootFromKilledBoss someLootFromKilledBoss = new SomeLootFromKilledBoss(loot);
  private String name;
  private int hp;
  private double price;


  public DungeonBoss() {
    price = 999.99;
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

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void lootFromBoss() {
    System.out.println("Убив этого босса вы получите следующие вещи: " + someLootFromKilledBoss);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", DungeonBoss.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("hp=" + hp)
        .add("price=" + price)
        .add("loot=" + someLootFromKilledBoss)
        .toString();
  }

  public class SomeLootFromKilledBoss {

    String[] loot = new String[5];

    public SomeLootFromKilledBoss(String[] loot) {
      this.loot = loot;
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("Лут ");
      sb.append("-").append(Arrays.toString(loot));
      sb.append('.');
      return sb.toString();
    }
  }
}

