package packeg1;

enum Animals {
    LION(15),
    ZEBRA(4),
    MONKEY(22),
    ELEPHANT(17),
    SNAKE(4),
    WOLF(5),
    SQUIRREL(2);
    int age;


    @Override
    public String toString() {
        return "Animals name{" +name()+
                "age=" + age +
                '}';
    }

    Animals(int age) {
        this.age = age;

    }
}

////Создайте проект, используя IntelliJ IDEA. Создайте перечислительный тип (enum) Animals, содержащий конструктор,
//// который должен принимать целочисленное значение (возраст животного), и содержать перегруженный метод toString(),
//// который должен возвращать название экземпляра и возраст животного.