import java.util.StringJoiner;

public class Bots implements takeExperience{

  private double price;
  private int level;
  private String name;
  Gold gold = new Gold (300);


  public Bots() {
    price = 200;
  }

  public Bots(int level, String name, double price) {
    this.price = price;
    this.level = level;
    this.name = name;
  }

  @Override
  public void gainExperince() {
    System.out.println("Получает опыт от уровня игрока");

  }

  public int getLevel() {
    return level;
  }

  public void setLevel(byte level) {
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int giveGoldToHero () {
    System.out.println("За убийство этого бота дают " + gold.goldForKill + " золота.");
    return gold.goldForKill;
  }



    public class Gold {
    int goldForKill;

    public Gold(int goldForKill) {
      this.goldForKill = goldForKill;
    }
  }


  @Override
  public String toString() {
    return new StringJoiner(", ", Bots.class.getSimpleName() + "[", "]")
        .add("price=" + price)
        .add("level=" + level)
        .add("name='" + name + "'")
        .toString();
  }
}
