package problem.basic;

import java.util.Scanner;

public class basic {

	// 문제: 두 수의 합 구하기
	public void method1() {
//		자연수 n개가 주어집니다. 이 중 두 수를 선택해서 그 합이 k가 되는 경우의 수를 구하려고 합니다.
//		입력: 자연수 n, k (1 <= n <= 100, 1 <= k <= 100,000), n개의 자연수 (각각의 수는 1 이상 100,000 이하)
//		출력: 합이 k가 되는 경우의 수를 출력합니다.
//		예시:
//
//		입력:
//		5 9
//		2 3 4 5 7
//
//		출력:
//		2
//		해설:
//		위 예시에서는 2와 7, 4와 5 두 쌍의 합이 9가 되므로, 경우의 수는 2입니다.
		Scanner sc = new Scanner(System.in);

		System.out.println("자연수 n 입력 하시오");
		int n = sc.nextInt(); // 자연수 n개 입력
		System.out.println("합 k 입력하시오");
		int k = sc.nextInt(); // 합 k 입력

		int[] nums = new int[n];

		// n개의 자연수 입력
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "번째의 자연수 입력");
			nums[i] = sc.nextInt();
		}

		int count = 0; // 합이 k가 되는 경우의 수를 저장할 변수

		// 두 수를 선택해서 합이 k가 되는 경우의 수 구하기
		for (int i = 0; i < n; i++) {
			for (int j = (i + 1); j < n; j++) {
				if (nums[i] + nums[j] == k) {
					count++;
				}
			}
		}
		System.out.println("경우의 수 : " + count); // 결과 출력
	}

	// 문제: 최소, 최대 구하기
	public void method2() {
//		n개의 정수가 주어집니다. 이 중 최솟값과 최댓값을 찾으려고 합니다.
//		입력: 정수의 개수 n (1 <= n <= 1,000,000), n개의 정수 (각각의 정수는 -1,000,000 이상 1,000,000 이하)
//		출력: 주어진 n개의 정수 중에서 최솟값과 최댓값을 구하여 공백으로 구분하여 출력합니다.
//		예시:
//
//		입력:
//		5
//		20 10 35 30 7
//
//		출력:
//		7 35
//		해설:
//		위 예시에서는 7이 가장 작은 정수이고, 35가 가장 큰 정수이므로, 결과는 "7 35"가 됩니다.
		Scanner sc = new Scanner(System.in);

		System.out.println("자연수 n 입력 하시오");
		int n = sc.nextInt();

		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "번째의 자연수 입력");
			nums[i] += sc.nextInt();
		}

		int min = nums[0];
		int max = nums[0];

		for (int i = 1; i < n; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println(min + " " + max);

	}

}
