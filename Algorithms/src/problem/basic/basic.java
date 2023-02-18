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

	// 문제: 1부터 N까지의 합 구하기
	public void method3() {
//		자연수 N이 주어졌을 때, 1부터 N까지의 합을 구하려고 합니다.
//		입력: 자연수 N (1 <= N <= 10,000)
//		출력: 1부터 N까지의 합을 출력합니다.
//		예시:
//
//		입력:
//		10
//
//		출력:
//		55
//		해설:
//		위 예시에서는 1부터 10까지의 합인 55가 출력됩니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("자연수 n 입력 하시오");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.println("sum : " + sum);
	}

	// 문제: 최대공약수 구하기
	public void method4() {
//		자연수 A, B가 주어졌을 때, A와 B의 최대공약수(GCD, Greatest Common Divisor)를 구하는 프로그램을 작성하세요.
//		입력: 자연수 A, B (1 <= A, B <= 10,000)
//		출력: A와 B의 최대공약수를 출력합니다.
//		예시:
//
//		입력:
//		12 18
//
//		출력:
//		6
//		해설:
//		위 예시에서는 12와 18의 최대공약수인 6이 출력됩니다.
		Scanner sc = new Scanner(System.in);

		System.out.println("자연수 A 를 입력 하시오");
		int a = sc.nextInt();
		System.out.println("자연수 B 를 입력 하시오");
		int b = sc.nextInt();

		int gcd = getGCD(a, b); // 유클리드 호제법

//		유클리드 호제법은 다음 이론을 이용합니다.
//		두 자연수 A, B (A > B)가 있고, A를 B로 나눴을 때 나머지를 r이라 하면,
//		gcd(A, B) = gcd(B, r) 이다.

		System.out.println("gcd : " + gcd);
	}

	private int getGCD(int a, int b) {

		if (b == 0) {
			return a;
		} else {
			return getGCD(b, a % b);
		}
	}

	// 문제: 문자열 뒤집기
	public void method5() {
//		문자열이 주어졌을 때, 문자열을 뒤집어서 출력하는 프로그램을 작성하세요.
//		입력: 문자열 S (1 <= S의 길이 <= 100,000)
//		출력: 문자열 S를 뒤집어서 출력합니다.
//		예시:
//
//		입력:
//		hello world
//
//		출력:
//		dlrow olleh
//		해설:
//		위 예시에서는 문자열 "hello world"가 주어졌을 때, "dlrow olleh"로 뒤집혀서 출력됩니다.
		Scanner sc = new Scanner(System.in);

		System.out.println("입력: 문자열 S (1 <= S의 길이 <= 100,000)");
		String s = sc.nextLine();

		String reversed = reverseString(s);

		System.out.println(reversed);
	}

	private String reverseString(String s) {

		char[] arr = s.toCharArray(); // 문자열 char 배열 변환

		int left = 0;
		int right = arr.length - 1;

		// left와 right를 이용하여 문자열을 뒤집음
		while (left < right) {
			char temp = arr[left]; // 첫번째 포인터가 가리키는 값
			arr[left] = arr[right]; // 첫번째 포인터와 두번째 포인터가 가리키는 값을 서로 바꿈
			arr[right] = temp; // 두번째 포인터가 가리키는 값
			left++; // 첫번째 포인터를 다음 인덱스로 이동
			right--; // 두번째 포인터를 이전 인덱스로 이동
		}

		// char 배열을 다시 문자열로 변환 후 반환
		return new String(arr);
	}

	// 문제 : 정수 n이 주어졌을 때, 1부터 n까지의 정수 중에서 3과 5의 공배수인 수들의 합을 구하는 프로그램을 작성하세요.
	public void method6() {
//		입력
//		첫 번째 줄에 정수 n이 주어집니다. (1 <= n <= 1000)
//		
//		출력
//		1부터 n까지의 정수 중에서 3과 5의 공배수인 수들의 합을 출력합니다.
//		
//		예시
//		
//		입력
//		15
//		
//		출력
//		45
//		
//		
//		참고
//		1부터 15까지의 정수 중 3과 5의 공배수인 수들은 다음과 같습니다.
//
//		15
//		따라서, 이들의 합은 15입니다.
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 n을 입력 하시오");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
				System.out.println("sum : " + sum);
			}
		}


	}
	
	//test01
}
