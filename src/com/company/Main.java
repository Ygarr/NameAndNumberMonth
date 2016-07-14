package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 3) создайте простой календарь.
        // ;Чтобы сначала по номеру месяца вычислял количество дней в нем,  и по названию.

        int month = 0, days = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер месяца до 12");

        month = in.nextInt();

        switch (month) {
            case 1:  days = 31;break;
            case 2:  System.out.println("Введите год: ");
                     if (((GregorianCalendar) Calendar.getInstance()).isLeapYear(new Scanner(System.in).nextInt())) {
                     days = 29; } else { days = 28;
                                            } break;

            case 3:  days = 31;break;
            case 4:  days = 30;break;
            case 5:  days = 31;break;
            case 6:  days = 30;break;
            case 7:  days = 31;break;
            case 8:  days = 31;break;
            case 9:  days = 30;break;
            case 10:  days = 31;break;
            case 11:  days = 30;break;
            case 12:  days = 31;break;
        }

        System.out.println("В вашем месяце " + days + ((days  % 10) == 1 ? " день" : " дней"));
       // in.close();

        System.out.println("Введите месяц словами\n");

        String monthStr;
        Scanner inTwo = new Scanner(System.in);
        monthStr = inTwo.nextLine().toString().toLowerCase();
        int year = (Calendar.getInstance()).get(Calendar.YEAR);

        switch (monthStr) {
            case "январь":  days = 31;break;
            case "февраль":
                     if (year % 4 == 0 && year % 100 !=0 || year % 400==0) {
                     days = 29; } else { days = 28;
                                            } break;

            case "март":  days = 31;break;
            case "апрель":  days = 30;break;
            case "май":  days = 31;break;
            case "июнь":  days = 30;break;
            case "июль":  days = 31;break;
            case "август":  days = 31;break;
            case "сентябрь":  days = 30;break;
            case "октябрь":  days = 31;break;
            case "ноябрь":  days = 30;break;
            case "декабрь":  days = 31;break;
            default : System.out.println("ммм.... что-то не то ввели");
        }

System.out.println("В введенном месяце " + days + ((days  % 10) == 1 ? " день" : " дней") + " на текущий " + year + " год");

    }


}
