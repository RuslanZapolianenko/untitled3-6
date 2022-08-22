package packeg1;

public class Main {
    public static void main(String[] args) {
        Animals animal = Animals.ELEPHANT;
        System.out.println(animal.toString());
        Animals animal1 = Animals.LION;
        System.out.println(animal1.toString());
    }
}
//Создайте проект, используя IntelliJ IDEA. Создайте перечислительный тип (enum) Animals, содержащий конструктор,
// который должен принимать целочисленное значение (возраст животного), и содержать перегруженный метод toString(),
// который должен возвращать название экземпляра и возраAст животного.