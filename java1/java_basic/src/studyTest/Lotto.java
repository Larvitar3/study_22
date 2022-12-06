package studyTest;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		Lotto lotto = new Lotto();

		// 랜덤 숫자와 입력 받은 숫자를 담을 배열 [6]
		int[] lottoNumber = new int[6];
		int[] selectNumber = new int[6];

		boolean flag = true;

		while (flag) {

			System.out.println("번호 6개를 입력해주세요.");
			loop: // 이중 for문에서 한번에 탈출
			for (int i = 0; i < selectNumber.length; i++) {
				System.out.print((i + 1) + "번째 숫자 입력 ▷  ");
				selectNumber[i] = scanner.nextInt();
				if (selectNumber[i] <= 0 || selectNumber[i] > 45) {
					System.out.println();
					System.out.println("!!!! 잘못된 입력입니다!!!");
					System.out.println(" 1 ~ 45 번호 중 입력해주세요.");
					System.out.println();
					break;
				}
				for (int j = 0; j < i; j++) {
					if (selectNumber[j] == selectNumber[i]) {
						System.out.println();
						System.out.println("중복 값이 입력되었습니다.");
						System.out.println();
						break loop; // 안쪽에서도 탈출 가능
					}
				}
			} // end of for 숫자입력받기

			System.out.println(" 1. 결과 확인하기 \t 2. 다시 입력 \t 3.프로그램 종료");
			int reStart = scanner.nextInt();
			if (reStart == 1) {
				System.out.println("결과를 확인합니다.");
				System.out.println();
				break;
			} else if (reStart == 2) {
				flag = true;
			} else if (reStart == 3) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			} else {
				System.out.println("잘못 된 입력입니다.");
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			}
		} // while

		// 1 ~ 45 랜덤 숫자 생성
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = random.nextInt(45) + 1;

			// 중복 숫자가 발생 하면 --
			for (int j = 0; j < i; j++) {
				if (lottoNumber[i] == lottoNumber[j]) {
					i--;
					break; // 빼고 동작을 멈춤
				}
			}
		} // end of for 로또번호

		// 오름차순 정렬
		for (int i = 0; i < lottoNumber.length; i++) {
			for (int j = i + 1; j < lottoNumber.length; j++) {
				if (lottoNumber[i] > lottoNumber[j]) {
					int temp = lottoNumber[i];
					// 더 큰 숫자를 temp에 담아두고 위치를 바꾼다.
					lottoNumber[i] = lottoNumber[j];
					lottoNumber[j] = temp;
				}
			}
		} // end of for 오름차순

		if (flag == true) {

			// 숫자 입력받기
			System.out.print("입력한 번호  : ");
			for (int i = 0; i < selectNumber.length; i++) {

				System.out.print(selectNumber[i] + " ,  ");
			}

			System.out.println();

			System.out.print("로또 번호 : ");
			for (int i = 0; i < 6; i++) {
				System.out.print(lottoNumber[i] + ",  ");
			}
			System.out.println();
			System.out.println();

			int count = 0;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lottoNumber[i] == selectNumber[j]) {
						count++;
					}
				}
			}
			System.out.println("맞추신 번호의 갯수는 총 『" + count + "』 입니다.");
			System.out.println();
			if (count == 6) {
				System.out.println("1등");
			} else if (count == 5) {
				System.out.println("2등");
			} else if (count == 4) {
				System.out.println("3등");
			} else if (count == 3) {
				System.out.println("4등");
			} else {
				System.out.println("당첨내역이 없습니다.");
			}
		}

	} // end of main

} // end of class
