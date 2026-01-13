package ya;
/*
Author: Kabysh Illia
File: practice1.java
Завдання 1: Animal → Dog

Створіть клас Animal з полем name та методом toString().
Створіть клас Dog, який extends Animal і має додаткове поле breed.
Створіть клас Cat, який extends Animal і має додаткове поле breed.
Обгрунтуйте поле breed як властивість Dog та Cat чи властивість класу Animal, за потреби виправте код
У конструкторі в класі Dog та Cat викличте super(name).
Перевизначте toString() у Dog, використовуючи super.toString().
У Main створіть об’єкт Dog і виведіть його в консоль.
Завдання 2: == vs equals()

Створіть два String через new String("hello").
Порівняйте їх через == та equals().
Створіть цикл від -128 до 127 і в ньому порівнюйте Integer зі значенням ітератора циклу.
Запишіть у коментарі короткий висновок.
В класі Animal та Dog реалізуйте метод equals() і покажіть його використання
Завдання 3: Casting + instanceof

В класі Animal створіть метод eat()
В класі Dog перевизначіть даний метод
Створіть метод feed(Animal animal).
Усередині методу перевірте instanceof Dog і викличте bark().
Покажіть приклад upcast: Animal a = new Dog(...).
Спробуйте пояснити, чому прямий downcast без перевірки небезпечний.
Завдання 4: Git‑цикл

В корені проєкту виконайте git init.
Перевірте статус через git status.
Додайте файли в індекс: git add ..
Зробіть коміт з осмисленим повідомленням, наприклад feat: add Animal and Dog.
Якщо маєте GitHub‑репозиторій — додайте remote та виконайте git push.
Критерії оцінювання
Оцінка за заняття формується з двох складових:

Тестування: Результат автоматичного тесту в Moodle.
Практична робота: Викладач перевіряє виконання 4-х завдань (відмічається у чек-листі):
Реалізація класів Animal та Dog (наслідування, super).
Правильне порівняння об'єктів (equals vs ==).
Безпечне приведення типів (Casting + instanceof).
Успішне виконання Git-циклу (ініціалізація, коміт).
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void task1() {
        Dog dog = new Dog("Rex", "Labrador");
        Cat cat = new Cat("Rudi", "Domashniy");
        System.out.println(dog);
        System.out.println(cat);
    }
    private static void task2() {
        // equals порівнює ЛОГІЧНУ рівність (за полем name), а не посилання
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println("s1 == s2: " + s1 == s2);
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        for(int i = -130; i<= 130; i++){
            Integer a = i;Integer b = i;
            if(a == b){
                System.out.println(i + " - same object");
            }else{
                System.out.println(i + " - different object");
            }
            //Висновок:
            // Поза цим діапазоном створюються різні об'єкти(бо це діапазон integer)
        }

    }
    private static void task3() {
        //Downcast тільки після instanceof
        Animal a = new Dog("Rex", "Labrador");
        feed(a);
    }

    public static void feed (Animal animal) {
        animal.eat();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}