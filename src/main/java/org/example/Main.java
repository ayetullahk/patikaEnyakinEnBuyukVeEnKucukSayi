package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner inp=new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int x = inp.nextInt();

        int k = enKucukYakinSayiyiBul(list, x);
        int j = enBuyukYakinSayiyiBul(list, x);

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + k);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + j);
    }

    public static int enKucukYakinSayiyiBul(int[] list, int x) {
        Arrays.sort(list);
        int n = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] >= x) {
                n = list[i - 1];
                break;
            }
        }

        return n;
    }

    public static int enBuyukYakinSayiyiBul(int[] list, int x) {
        Arrays.sort(list);
        int enBuyukYakinSayi = list[list.length - 1];

        for (int i = list.length - 2; i >= 0; i--) {
            if (list[i] <= x) {
                enBuyukYakinSayi = list[i + 1];
                break;
            }
        }

        return enBuyukYakinSayi;
    }
}