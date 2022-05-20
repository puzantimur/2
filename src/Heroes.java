import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import someUtils.DateUtil;

public abstract class Heroes implements takeExperience {

  protected String nameOfHero;
  protected ClassOfHero classOfHero;
  protected double experience;
  protected double intellect;
  protected double strength;
  protected double agility;
  protected double spirit;
  protected double stamina;
  protected double damage;
  protected Date dateOfCreating;
  protected int year;
  protected int month;
  protected int day;


  public Heroes() {
  }

  public Heroes(String nameOfHero, ClassOfHero classOfHero, double experience, double intellect,
      double strength, double agility, double spirit,
      double stamina, double damage, int year, int month, int day) {
    this.nameOfHero = nameOfHero;
    this.classOfHero = classOfHero;
    this.experience = experience;
    this.intellect = intellect;
    this.strength = strength;
    this.agility = agility;
    this.spirit = spirit;
    this.stamina = stamina;
    this.damage = damage;
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month, day);
    this.dateOfCreating = new Date();
    this.dateOfCreating.setTime(calendar.getTimeInMillis());
    this.year = year;
    this.month = month;
    this.day = day;

  }

  protected abstract void attack();

  protected void jump() {
    System.out.println("Герой умеет прыгать");
  }




  public String getNameOfHero() {
    return nameOfHero;
  }

  public void setNameOfHero(String nameOfHero) {
    this.nameOfHero = nameOfHero;
  }

  public ClassOfHero getClassOfHero() {
    return classOfHero;
  }

  public void setClassOfHero(ClassOfHero classOfHero) {
    this.classOfHero = classOfHero;
  }

  public double getExperience() {
    return experience;
  }

  public void setExperience(double experience) {
    this.experience = experience;
  }

  public double getIntellect() {
    return intellect;
  }

  public void setIntellect(double intellect) {
    this.intellect = intellect;
  }

  public double getStrength() {
    return strength;
  }

  public void setStrength(double strength) {
    this.strength = strength;
  }

  public double getAgility() {
    return agility;
  }

  public void setAgility(double agility) {
    this.agility = agility;
  }

  public double getSpirit() {
    return spirit;
  }

  public void setSpirit(double spirit) {
    this.spirit = spirit;
  }

  public double getStamina() {
    return stamina;
  }

  public void setStamina(double stamina) {
    this.stamina = stamina;
  }

  public double getDamage() {
    return damage;
  }

  public void setDamage(double damage) {
    this.damage = damage;
  }

  public String getDateOfCreating() {
    return DateUtil.DATE_FORMAT.format(dateOfCreating);
  }

  public void setDateOfCreating(Date dateOfCreating) {
    this.dateOfCreating = dateOfCreating;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year){
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month){
    this.month = month;
  }

  public int getDay () {
    return day;
  }

  public void setDay(int day){
    this.day = day;
  }



  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Heroes{");
    sb.append("nameOfHero='").append(nameOfHero).append('\'');
    sb.append(", experience=").append(experience);
    sb.append(", intellect=").append(intellect);
    sb.append(", strength=").append(strength);
    sb.append(", agility=").append(agility);
    sb.append(", spirit=").append(spirit);
    sb.append(", stamina=").append(stamina);
    sb.append(", damage=").append(damage);
    sb.append(", dateOfCreating=").append(dateOfCreating);
    sb.append(", year=").append(year);
    sb.append(", month=").append(month);
    sb.append(", day=").append(day);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o){
    if (this == o) {
      return true;
    }
    if (!(o instanceof Heroes)) {
      return false;
    }
    Heroes heroes = (Heroes) o;
    return Double.compare(heroes.getExperience(), getExperience()) == 0
        && Double.compare(heroes.getIntellect(), getIntellect()) == 0
        && Double.compare(heroes.getStrength(), getStrength()) == 0
        && Double.compare(heroes.getAgility(), getAgility()) == 0
        && Double.compare(heroes.getSpirit(), getSpirit()) == 0
        && Double.compare(heroes.getStamina(), getStamina()) == 0
        && Double.compare(heroes.getDamage(), getDamage()) == 0
        && getYear() == heroes.getYear() && getMonth() == heroes.getMonth()
        && getDay() == heroes.getDay() && getNameOfHero().equals(heroes.getNameOfHero())
        && getClassOfHero() == heroes.getClassOfHero() && getDateOfCreating().equals(
        heroes.getDateOfCreating());
  }

  @Override
  public int hashCode () {
    return Objects.hash(getNameOfHero(), getExperience(), getIntellect(), getStrength(),
        getAgility(),
        getSpirit(), getStamina(), getDamage(), getDateOfCreating(), getYear(), getMonth(),
        getDay());
  }
}
