public class Main {
    public static void main(String[] args){
        var box = 5;
        System.out.println(box);
        box = box+2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);
        box = box * 100;
        System.out.println(box);

       ///Сложение
        var x = 1456789;
        var y = 3478256;
        var summ = x + y;
        System.out.println("x+y=" + summ);

        ///Вычитание
        var a = 9785643;
        var b = 3245687;
        var result = a-b;
        System.out.println("a-b="+result);

        ///Умножение
        var alfa = 16;
        var beta = 16;
        var Result = alfa*beta;
        System.out.println("alfa * beta="+ Result);
        ///Разделение
        var X = 525;
        var Y = 25;
        var res = X/Y;
        System.out.println("X/Y="+res);

        ///5. Использование нескольких переменных
      var liftingCapacity = 50;
      var liftingWeight = 20;
      var liftingLeft = liftingCapacity - liftingWeight;
      System.out.println("Ещё можно взять" + liftingLeft + "кг вещей");

      ///Сложение загадка
        var applesWeight = 3;
        var orangeWeight = 4;
        var bananaWeight = applesWeight + orangeWeight;
        var globalWeight = applesWeight + orangeWeight + bananaWeight;
        System.out.println("Общий вес фруктов равен " + globalWeight);

        /// Задача № 2
        var apple = 4;
        var orange = 2 * apple; ///8
        var banana = 10 - orange + apple;///6
        var tenseResult = apple + orange + banana;
        System.out.println("Ответ задачи равен" + tenseResult);

        ///Задача 3
        var Картошка = 12;
        var Помидор = 14;
        var Морковь = 32;
        var Вода = 40;
        var Уголь = 16;
        var Мясо = 24;
        var Яблоко = 5;
        var Мандарин = 3;
        var Виноград = 4;
        var Овощи = Картошка + Помидор + Морковь;
        var Фрукты = Яблоко + Мандарин + Виноград;
        var ОбщийВес = Фрукты + Овощи + Мясо + Вода + Уголь;
        System.out.println("Общий вес" + ОбщийВес + "кг");
         ОбщийВес= ОбщийВес * 2;
         /// Задача перегруз
        var Potato = 5;
        var Tomato = 20;
        var Carrot = 30;
        var Water = 40;
        var Coal = 15;
        var Meat = 25;
        var Greenapple = 5;
        var Orange = 5;
        var Grape = 5;
        var Vegetables = Potato + Tomato + Carrot;
        var Fruits = Greenapple + Orange + Grape;
        var Overweight = Fruits + Овощи + Meat + Water + Coal;
        System.out.println("Общий вес" + Overweight + "кг");

        var Overload = (liftingWeight + Overweight) % liftingCapacity;
        System.out.println("Перегруз на" + Overload + "кг!");





    }

}