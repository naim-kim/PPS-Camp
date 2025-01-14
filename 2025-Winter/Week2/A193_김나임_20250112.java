//https://www.acmicpc.net/problem/25314
//코딩은 체육과목 입니다

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        

        int fourByte = n / 4;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < fourByte; i++) {
            result.append("long ");
        }
        result.append("int");

        System.out.println(result);
        s.close();
    }
    
}