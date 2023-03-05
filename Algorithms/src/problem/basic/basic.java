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

		// 방법 1
		StringBuffer sb = new StringBuffer(s);
		String reverseStr = sb.reverse().toString();
		System.out.println("reverseStr : " + reverseStr);

		// 방법 2
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

	// 문제: 자연수 n을 입력받고, 1부터 n까지의 수 중에서 소수(prime number)인 수들의 합을 구하는 프로그램을 작성하세요.
	public void method7() {
//		소수는 1과 자기 자신 이외의 어떤 자연수로도 나눌 수 없는 자연수입니다. 즉, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, ... 등은 
//		모두 소수입니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 n을 입력 하시오");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 2; i <= n; i++) { // 1은 소수가 아니므로 2부터 시작
			boolean isPrime = true;

			for (int j = 2; j <= Math.sqrt(i); j++) { // Math.sqrt(i)=i의 제곱근
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) { // 소수일 경우만
				sum += i;
			}

		}
		System.out.println(sum);
	}

	// 문제: 아래와 같은 정수형 배열이 주어졌을 때, 배열의 원소들을 모두 더한 값을 출력하는 함수를 작성하세요.
	public void method8() {
//		int[] nums = {2, 5, 8, 11, 3, 6};
//		위 배열에 대한 예시로, 출력값은 35가 됩니다.

		int[] nums = { 2, 5, 8, 11, 3, 6 };

		// 방법 1
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);

		// 방법2
		int result = 0;

		for (int num : nums) {
			result += num;
		}
		System.out.println("result : " + result);
	}

	// 문제: 아래와 같은 문자열이 주어졌을 때, 해당 문자열의 길이를 출력하는 함수를 작성하세요.
	public void method9() {
//		String str = "Hello, world!";
//		위 문자열에 대한 예시로, 출력값은 13이 됩니다.
		String str = "Hello, world!";

		System.out.println(str.length());
	}

	// 문제: 아래와 같은 변수 age가 주어졌을 때, 해당 변수에 담긴 값에 따라 "미성년자", "성인", "노인" 중 하나를 출력하는 함수를
	// 작성하세요.
	public void method10() {
//		int age = 67;
//		미성년자: 19세 미만
//		성인: 19세 이상 65세 미만
//		노인: 65세 이상
		int age = 67;

		if (age < 19) {
			System.out.println("미성년자");
		} else if (age < 65) {
			System.out.println("성인");
		} else {
			System.out.println("노인");
		}
	}

	// 문제: 1부터 100까지의 수 중에서, 3의 배수이면서 7의 배수인 수들을 모두 출력하는 함수를 작성하세요.
	public void method11() {
//		21
//		42
//		63
//		84
//		이 중에서 3의 배수이면서 7의 배수인 수는 21, 42, 63, 84입니다.

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.print(i);
				if (i < 79) { // 79은 100에서 3과 7의 최소 공배수인 21을 뺀 값입니다.
					System.out.print(", ");
				}
			}
		}
	}

	// 문제 : 어떤 수가 소수인지 아닌지 판별하는 프로그램을 작성해보세요. (소수: 1과 자기 자신으로만 나누어 떨어지는 수)
	public void method12() {
//		소수는 1과 자기 자신 이외의 어떤 자연수로도 나눌 수 없는 자연수입니다. 즉, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, ... 등은 
//		모두 소수입니다.
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력하시오.");
		int num = sc.nextInt();

		boolean isPrime = true;

		if (num < 1) {
			isPrime = false;
			System.out.println("소수가 아닙니다. 양의 정수만 입력해주세요.");
		}

		// 2부터 n-1까지의 모든 수에 대해 나누어 떨어지는 수가 있는지 검사
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(num + (isPrime ? " 은 소수입니다." : " 은 소수가 아닙니다."));
	}

	// 1부터 50까지 숫자 중에서 3의 배수는 "Fizz", 5의 배수는 "Buzz", 3과 5의 공배수는 "FizzBuzz"를 출력하고,
	// 나머지 숫자는 숫자 그대로 출력하는 프로그램을 작성해보세요.
	public void method13() {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력하시오.");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println(num + " 은 음수입니다. 양의 정수로 입력해주세요");
		}

		if (num % 15 == 0 && num <= 50) {
			System.out.print("FizzBuzz");
		} else if (num % 3 == 0 && num <= 50) {
			System.out.print("Fizz");
		} else if (num % 5 == 0 && num <= 50) {
			System.out.print("Buzz");
		} else {
			System.out.print(num);
		}

	}

	// 두 개의 정수 n과 m을 입력받아, n부터 m까지의 자연수 중에서 3의 배수만 출력하는 프로그램을 작성해보세요.
	// (단, for문을 사용하여 작성하세요)
	public void method14() {
//		 예시 입력)
//		 n = 1, m = 20
//		
//		 예시 출력)
//		 3
//		 6
//		 9
//		 12
//		 15
//		 18

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 n 입력");
		int n = sc.nextInt();
		System.out.println("정수 m 입력");
		int m = sc.nextInt();

		for (int i = n; i <= m; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	// 1부터 100까지의 숫자 중에서 소수(prime number)인 숫자들을 모두 출력하는 프로그램을 작성해보세요.
	// (소수: 1과 자기 자신으로만 나누어 떨어지는 수)
	public void method15() {

		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(num + " ");
			}
		}

	}

	// 사용자로부터 문자열을 입력받아, 해당 문자열이 회문(palindrome)인지 아닌지를 판별하는 프로그램을 작성해보세요.
	public void method16() {
//		회문이란, 앞에서부터 읽으나 뒤에서부터 읽으나 동일한 단어나 구를 말합니다.
//		예를 들어, "level"이나 "racecar"는 회문입니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요");
		String str = sc.nextLine();

		if (isPalindrome(str)) {
			System.out.println(str + "은(는) 회문입니다.");
		} else {
			System.out.println(str + "은(는) 회문이 아닙니다..");
		}

	}

	public static boolean isPalindrome(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}

	// 다음 규칙에 따라 양의 정수를 입력으로 받아 일련의 숫자를 출력하는 프로그램을 작성하세요.
	public void method17() {
//		짝수이면 2로 나눈다
//		홀수이면 3을 곱하고 1을 더한다
//		출력이 1이 될 때까지 이 과정을 반복한다. 프로그램은 공백으로 구분된 시퀀스의 각 숫자를 출력해야 합니다.
//
//		예를 들어 입력이 6이면 출력은 6 3 10 5 16 8 4 2 1이어야 합니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();

		while (num != 1) {
			System.out.print(num + " ");
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = (num * 3) + 1;
			}
		}

		System.out.println(num);

	}

	// 주어진 정수를 이진수로 변환하는 프로그램을 작성하세요.
	public void method18() {
//		이진수는 0과 1만으로 이루어진 수입니다. 
//		주어진 정수를 이진수로 변환하려면, 2로 계속 나누어가며 나머지를 배열이나 스택에 저장하고, 저장된 나머지를 역순으로 출력하면 됩니다.

//		이진수로 변환하는 과정은 다음과 같습니다.
//		주어진 10진수를 2로 나누고, 나머지를 배열에 저장합니다. 
//		예를 들어 10을 2로 나누면 몫이 5, 나머지가 0이므로 배열에 0을 저장합니다.
//		몫이 0이 될 때까지 1번을 반복합니다. 
//		예를 들어 5를 2로 나누면 몫이 2, 나머지가 1이므로 배열에 1을 저장합니다.
//		배열에 저장된 나머지를 역순으로 출력하면 이진수를 얻을 수 있습니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		int decimal = sc.nextInt();

		int[] binary = new int[32]; // 정수 최대 32비트

		int index = 0;

		while (decimal > 0) {
			binary[index++] = decimal % 2; // 나머지값 배열에 넣고 인덱스 증가
			decimal = decimal / 2; // 정수 나누기
		}

		System.out.print("binary number : ");

		for (int i = index - 1; i >= 0; i--) { // 인덱스 역순으로 출력
			System.out.print(binary[i]);
		}

	}

}
