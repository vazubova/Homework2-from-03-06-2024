public class Main {
    public static void main(String[] args)
    {
        byte cats = 110;
        short towns = 25678;
        int dogs = 1546875;
        long frogs = 576499938L;
        float number = 42.46f;
        double bigNumber = 32.5734;

        System.out.println(cats+" кошек");
        System.out.println(towns+" городов");
        System.out.println(dogs+" собак");
        System.out.println(frogs+" лягушек");
        System.out.println("число "+number);
        System.out.println("большое число "+bigNumber);

        byte firstNumber = 67;
        short secondNumber = -159;
        short thirdNumber = 569;
        short fourthNumber = 27897;
        long fifthNumber = 987678965549L;
        float sixthNumber = 27.12f;
        double seventhNumber = 2.786;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        System.out.println(fifthNumber);
        System.out.println(sixthNumber);
        System.out.println(seventhNumber);


        byte studentsOfLudmilaPavlovna = 23;
        byte studentsOfAnnaSergeevna = 27;
        byte studentsOfEkatherinaAndreevna = 30;
        int totalSheets = 480;

        int sheetsForOneStudent = totalSheets/(studentsOfLudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkatherinaAndreevna);

        System.out.println("На каждого ученика рассчитано " + sheetsForOneStudent + " листов бумаги");

        byte numberOfBottles = 16;
        byte minutesForNumberOfBottles = 2;
        byte numberOfMinutes = 20;
        byte numberOfOneDay = 1;
        byte numberOfThreeDays = 3;
        byte minutesInOneHour = 60;
        byte hoursInOneDay = 24;
        byte daysInOneMonth = 31;

        int bottlesInTwentyMinutes = (numberOfMinutes/minutesForNumberOfBottles)*numberOfBottles;
        int bottlesInOneDay = ((hoursInOneDay*minutesInOneHour)/minutesForNumberOfBottles)*numberOfBottles;
        int bottlesInThreeDays = (((hoursInOneDay*numberOfThreeDays)*minutesInOneHour)/minutesForNumberOfBottles)*numberOfBottles;
        int bottlesInOneMonth = (((daysInOneMonth*hoursInOneDay)*minutesInOneHour)/minutesForNumberOfBottles)*numberOfBottles;

        System.out.println("За " + numberOfMinutes + " минут " + "машина произвела " + bottlesInTwentyMinutes + " штук бутылок");
        System.out.println("За " + numberOfOneDay + " день " + "машина произвела " + bottlesInOneDay +  " штук бутылок");
        System.out.println("За " + numberOfThreeDays + " дня " + "машина произвела " + bottlesInThreeDays + " штук бутылок");
        System.out.println("За " + daysInOneMonth +  " день " + "машина произвела " + bottlesInOneMonth + " штук бутылок");

        byte tinsOfPaint = 120;
        byte tinsOfWhitePaintForOneClass = 2;
        byte tinsOfBrownPaintForOneClass = 4;

        int countOfTinsForOneClass = tinsOfWhitePaintForOneClass+tinsOfBrownPaintForOneClass;
        int countOfClasses = tinsOfPaint/countOfTinsForOneClass;
        int countOfWhitePaint  = tinsOfWhitePaintForOneClass*countOfClasses;
        int countOfBrownPaint = tinsOfBrownPaintForOneClass*countOfClasses;

        System.out.println("В школе, где " + countOfClasses +  " классов, нужно " + countOfWhitePaint +  " банок белой краски и " + countOfBrownPaint +  " банок коричневой краски");

    }
}