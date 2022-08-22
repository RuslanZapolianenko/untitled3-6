package package2;

public enum Vehicles {
     Mersedes ( 6000, "black"), BMV( 500, "blue" );
     private int price;
     private String color;

     public String getColor(){
     return color;
     }
     Vehicles(int price, String color){
     this.price=price;
     this.color=color;
     }

     @Override
     public String toString() {
          return "Vehicles{" +
                  "price=" + price +
                  ", color='" + color + '\'' +
                  '}';
     }
}
//Создайте проект, используя IntelliJ IDEA. Создайте перечислительный тип (enum) Vehicles, содержащий конструктор,
// который должен принимать целочисленное значение (стоимость автомобиля), содержать метод getColor(), который
// возвращает строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать строку
// с названием экземпляра, цветом и стоимостью автомобиля