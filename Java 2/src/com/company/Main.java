package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] year = new int[366];
        int[] mounths = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        int sm = 2;                 //Отыечает за смещение первого дня в году
        String[] mounthNames = new String[]{"Январь","Февраль","Март","Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String[] week = new String[]{" Пн", " Вт", " Ср", " Чт", " Пт", " Сб", " Вс"};
        Scanner input = new Scanner(System.in);
        int primeDay = input.nextInt() - 1;
        sm -= primeDay;
        if (sm < 0) {
            sm +=7;
        }
        int j = 0;
        {
            for (int i = 0; i < 12; i++) {
                for (int k = 1; k <= mounths[i]; k++, j++) {
                    year[j] = k;
                }
            }

            j = 0;
            for (int i = 0; i < 12; i++) {
                System.out.println("\n\t" + mounthNames[i] + "\n");
                for (int m = primeDay; m - primeDay < 7; m++) {
                    if (m < 7 ){
                        System.out.print(week[m]);
                    }
                    else {
                        System.out.print(week[m - 7]);
                    }
                }
                System.out.println();
                // "Отодвигание" числа, если оно не должно стоять в начале стоки
                for (int l = j % 7; l > 0 ; --l) {
                    System.out.print("   ");
                }
                for (int k = 0; k < mounths[i]; k++,j++) {
                    // "Отодвигание" числа, если оно не должно стоять в начале стоки в первом месяце
                    while (j < sm) {
                        System.out.print("   ");
                        j++;
                    }
                    if (j % 7 == 0) {
                        System.out.println();
                    }
                    //Форматированный вывод чисел
                    if (year[j - sm] < 10) {
                        System.out.print(" " + year[j - sm] + " ");
                    } else {
                        System.out.print( " " + year[j - sm]);
                    }

                }
                System.out.println();
            }
        }
    }
}
