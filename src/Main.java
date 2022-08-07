public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задание 1
        int clientOS = 1;
        if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else {
            System.out.println("Установите версию приложения IOS по ссылке.");
        }
        //Задание 2
        int clientDeviceYear = 2019;
        if (clientDeviceYear < 2015 ){
            System.out.println("Установите облегченную версию приложения");
        }
        else {
            System.out.println("Установите  версию приложения");
        }

        if ( clientOS == 1){
            System.out.println("для Android по ссылке.");
        }
        else {
            System.out.println("для IOS по ссылке.");
        }
        //Задание 3
        //Не поняла

        //Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");
        }
        if (deliveryDistance <= 60 && deliveryDistance >20){
            System.out.println("Потребуется дней: 2");
        }
        if (deliveryDistance <= 100 && deliveryDistance > 60){
            System.out.println("Потребуется дней: 3");
        }
        //Задание 5
        int monthNumber = 13;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Зима");
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            case 12:
                System.out.println("Зима");
            default:
                System.out.println("Нет такого месяца!");






        }

    }
    }
