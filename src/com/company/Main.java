package com.company;

public class Main {

    public static void main(String[] args) {
     //   Задание 1, 2

        boolean clientOS = true;
        if (clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке.»");
            int clientDeviceYear = 2015;
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке».");
            int clientDeviceYear =0;
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }
        //Задание 3.
        int year = 2021;
        if (year%4==0 && year%100 !=0 || year%400==0) {
            System.out.println(year + " год является високосным");
            }
        else System.out.println(year + " год  не является високосным");
        //Задание 4.

        int deliveryDistance = 259;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDistance/20);}
        else if (deliveryDistance>=21 && deliveryDistance < 60 ) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance == 60)
            System.out.println("Потребуется дней: 3" );

        else if (deliveryDistance > 60)
            System.out.println("Потребуется дней: " + (1 + ((deliveryDistance -20)/40)));
        //Задание 5.
         /*Напишите программу, которая определяет по номеру месяца в году, к какому
        сезону этот месяц принадлежит. Например, 1 месяц (он же январь) принадлежит к
        сезону зима.
        Для написания программы используйте оператор switch. Для обозначения номера
        месяца используйте переменную monthNumber = 12.Пропишите условие, при
        котором программа не будет выполняться (номер месяца больше 13).*/

        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:

                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяцев в году не может быть больше 12");
        }
    }
}





