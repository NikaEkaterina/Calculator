package com.example.HelloWorld;

public class Gift {
    public static void main(String[] args){
        System.out.println(" ПОДАРОК: ");
        GiftClass Candy = new GiftClass();
        Candy.name = "Умка";
        Candy.weight = 0.130;
        Candy.price = 500;
        Candy.uniqueParameter = "без орехов но с шоколадом";
        System.out.println("1. Конфеты              "+Candy.name +", Вес: "+Candy.weight +" Цена за килограм: "+Candy.price+" уникальный параметр: "+Candy.uniqueParameter);

        GiftClass Jellybean= new GiftClass();
        Jellybean.name = "Бубыльгум";
        Jellybean.weight = 0.150;
        Jellybean.price = 200;
        Jellybean.uniqueParameter = "Тяни не порвешь";
        System.out.println("2. Жевательные конфеты  "+Jellybean.name +", Вес: "+Jellybean.weight +" Цена за килограм: "+Jellybean.price+" уникальный параметр: "+Jellybean.uniqueParameter);
        GiftClass chocolateCandy = new GiftClass();
        chocolateCandy.name = "Касный мак";
        chocolateCandy.weight = 0.100;
        chocolateCandy.price = 500;
        chocolateCandy.uniqueParameter = "Разрешено министерством по борьбе с наркотиками";
        System.out.println("3. Конфеты              "+chocolateCandy.name +", Вес: "+chocolateCandy.weight +" Цена за килограм: "+chocolateCandy.price+" уникальный параметр: "+chocolateCandy.uniqueParameter);
        GiftClass chocolate = new GiftClass();
        chocolate.name = "Аленка";
        chocolate.weight = 0.100;
        chocolate.price = 1000;
        chocolate.uniqueParameter = "Старые традиции";
        System.out.println("4. Шоколадка            "+chocolate.name +", Вес: "+chocolate.weight +" Цена за килограм: "+chocolate.price+" уникальный параметр: "+chocolate.uniqueParameter);

        GiftClass ChupaChups = new GiftClass();
        ChupaChups.name = "Чупачупс";
        ChupaChups.weight = 0.05;
        ChupaChups.price = 200;
        ChupaChups.uniqueParameter = "с жевачкой";
        System.out.println("5. Леденец              "+ChupaChups.name +", Вес "+ChupaChups.weight +" Цена за килограм "+ChupaChups.price);


        double W=chocolate.weight+ChupaChups.weight+chocolateCandy.weight+Candy.weight+Jellybean.weight;
        double P=chocolate.price+ChupaChups.price+chocolateCandy.price+Candy.price+Jellybean.price;
        System.out.println("                 ");
        System.out.println("Общий Вес "+W+"кг");
        System.out.println("Общая Стоимось "+P+ "р");


    }
}
class GiftClass{
    String name;
    double weight;
    double price;
    String uniqueParameter;


}

