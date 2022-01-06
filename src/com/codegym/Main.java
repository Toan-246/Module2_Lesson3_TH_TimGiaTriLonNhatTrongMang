package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhập sze mảng: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Nhập lại size");
            }
        }
        while (size > 20);

        arr = new int[size];

        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập các phần tử " + i + " trong mảng ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Danh sách mảng: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];
        int index = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j ;
            }
        }
        System.out.println("Gí trị lớn nhất của mảng là " + max + " ,tại vị trí " + index);
    }
}
