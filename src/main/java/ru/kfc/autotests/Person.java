package ru.kfc.autotests;
// ДЗ по Уроку №2
public class Person {

    String fullName;
    Integer age;
    int id; // поле для хранения id

    // счетчик следующего id
    private static int nextId = 0;

    //Конструктор без параметров
    public Person() {
        this.id = nextId++; // присваиваем id и увеличиваем счетчик
    }

    //Конструктор с параметрами
    public Person (String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
        this.id = nextId++; // присваиваем id и увеличиваем счетчик
    }

    // метод возвращающий монолог человека
    public void talk () {
        if (id == 2) {
            System.out.println("Привет, я " + fullName + ", избранный! (p.s. мой id = 2)");
        } else if (fullName != null && age != null) {
            System.out.println("Привет, я " + fullName + " и мне " + age + " лет и номер моего id = " + id);
        }
    }

    // метод возвращающий количество созданных объектов
    public static int count() {
        return nextId;
    }

}
