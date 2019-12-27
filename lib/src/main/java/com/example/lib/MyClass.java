package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PrimeNumber[] = new int[1000];
        int FactorsNumber[] = new int[1000];
        int PrimeNumberCount = 0;
        System.out.println("請輸入一整數");
        int InputInteger = Integer.parseInt(scanner.next());
        for (int i = 1; i <= InputInteger; i++) {
            int PrimeNumberJudge = 0;
            for (int j = 1; j <= InputInteger; j++) {
                if (i % j == 0) {
                    PrimeNumberJudge++;
                }
                if (PrimeNumberJudge > 2) {
                    break;
                }
            }
            if (PrimeNumberJudge == 2) {
                PrimeNumber[PrimeNumberCount] = i;
                PrimeNumberCount++;
            }
        }
        int FindFactors = InputInteger;
        int countN = 0;
        int FactorsNumberCount = 0;
        while (FindFactors != 1) {
            if (FindFactors % PrimeNumber[countN] == 0) {
                FactorsNumber[FactorsNumberCount] = PrimeNumber[countN];
                FactorsNumberCount++;
                FindFactors /= PrimeNumber[countN];
            } else {
                countN++;
            }
        }
        System.out.printf("整數 %d,他的因數為:\n", InputInteger);
        for (int i = 0; i < FactorsNumberCount; i++) {
            System.out.print(FactorsNumber[i] + " ");
        }
    }
}