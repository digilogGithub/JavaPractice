package c18_handleException.c1_1;

import java.util.Scanner;

class ExceptionHandleUself {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[100];

        for (int i = 0; i < 3; i++) {
            System.out.print("피제수 입력 : ");
            int num1 = kb.nextInt();

            System.out.print("제수 입력 : ");
            int num2 = kb.nextInt();

            if (num2 == 0) {
                System.out.println("제수는 0이 될 수 없습니다");
                i--;
                continue;
            }

            System.out.print("연산된 결과를 저장할 배열의 인덱스 입력 : ");
            int idx = kb.nextInt();
            if (idx < 0 || idx > 99) {
                System.out.println("유효하지 않은 인덱스 값입니다.");
                i--;
                continue;
            }

            arr[idx] = num1 / num2;
            System.out.println("나눗셈 결과는 " + arr[idx]);
            System.out.println("저장된 위치의 인덱스는 " + idx);

        }
    }
}