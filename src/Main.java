//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;// задача 1
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var peper = 763789;
        System.out.println(peper);

        System.out.println("Cложение");
        var dog1 = dog + 2;// задача 2
        System.out.println(dog1);
        var cat1 = cat +2;
        System.out.println(cat1);
        var peper1 = peper +2;
        System.out.println(peper1);

        System.out.println("Вычитание");
        var dog2 = dog1 - 3.5;// задача 3
        System.out.println(dog2);
        var cat2 = cat1 - 1.6;
        System.out.println(cat2);
        var peper2 = peper1 - 7639;
        System.out.println(peper2);

        var friend = 19;// задача 4
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5; //задача 5
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2; // задача 6
        var bokser2 = 82.7;
        var totalWeight = boxer1 + bokser2;
        System.out.println(totalWeight);
        var massDeference = boxer1 - bokser2;
        System.out.println( massDeference);


        var remains = bokser2 % boxer1; // задача 7
        System.out.println(remains);

        var human = 640 / 8;// задача 8
        System.out.println("Всего в компании " + human + " человек");
        var totalPeople = human + 94;
        var watch = totalPeople * 8;
        System.out.println("Если в компании " + totalPeople + " человек, то всего " + watch + " часов работы может быть поделено между сотрудниками");


    }
}