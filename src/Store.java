import java.util.Arrays;

public class Store<T extends Heroes> {

  private double cashInBank;
  private T[] array;

  public Store(T[] array) {
    this.array = array;
    cashInBank = 6050.12;

  }

  public void printProducts(T[] value) {
    System.out.println("К вашему выбору следующий список лотов товаров:");
    for (int i = 0; i < value.length; i++) {
      System.out.println("Лот № - " + (i + 1) + " " + value[i]);
    }
  }

  public T purchase(int number, double summOfMoney) {
    if (array[number].getPrice() <= summOfMoney) {
      cashInBank = cashInBank + array[number].getPrice();
      array[number] = null;
      System.out.println("Поздравляем вас с покупкой товара");

    } else {
      System.out.println("К сожалению, недостаточно денег на вашем счету");
    }
    System.out.println("Текущее значение наличных в кассе составляет: " + cashInBank + " рублей");
    return array[number];
  }

  public void sell(T typeOfHero, double amountOfPrice) {
    if (typeOfHero.getPrice() >= amountOfPrice && cashInBank>amountOfPrice) {
      System.out.println("Магазин купит у нас этого героя");
      cashInBank=cashInBank-amountOfPrice;
      T [] array1 = Arrays.copyOf(array, array.length+1);
      array1[array.length - 1] = typeOfHero;
      for (int i = 0; i < array1.length; i++) {
        System.out.println("Лот № - " + (i + 1) + " " + array1[i]); }
      System.out.println("Текущее значение суммы в кассе составляет: " + cashInBank);
      } else {
      System.out.println("Да за такие деньги магазин никогда не купит этот хлам");
    }
  }


  public double getCashInBank() {
    return cashInBank;
  }

  public void setCashInBank(double cashInBank) {
    this.cashInBank = cashInBank;
  }

  public T[] getArray() {
    return array;
  }

  public void setArray(T[] array) {
    this.array = array;
  }


}

