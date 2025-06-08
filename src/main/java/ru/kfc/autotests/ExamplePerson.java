package ru.kfc.autotests;
//ДЗ по Уроку №2
public class ExamplePerson {
    public static void main (String[] args) {
        Person person1 = new Person("Иван Иванов", 20);
        person1.talk();
        Person person2 = new Person();
        person2.talk();
        Person person3 = new Person("Александ Некрасов", 45);
        person3.talk();
        Person person4 = new Person("Максим Шолохов", 35);
        person4.talk();

        // Получаем и выводим количество созданных объектов
        System.out.println("Количество созданных объектов: " + Person.count());

    }
}
