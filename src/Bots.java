public class Bots implements takeExperience{

  private double price;
  private int level;
  private String name;

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
}
