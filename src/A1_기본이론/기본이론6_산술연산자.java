package A1_기본이론;
/*
 *  산술연산자
 *  (1) 더하기   +
 *  (2) 빼기    -
 *  (3) 곱하기   *
 *  (4) 나누기   /
 *  (5) 나머지   %
 *  
 */
/*
 연산자 우선순의
  (1) 열순위 소괄호 ()
  (2) 이순위 곱하기 나누지 나머지 */
public class 기본이론6_산술연산자 {
	public static void main(String[] args) {
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);// 정수와 정수를 나누면 몫이 나온다.
		System.out.println(10 / 3.0);// 실수와 싱수를 나누면 소수점이 나온다.
		// 프로그램은 싱수를 정확하게 계산할수없기때문에 적당한선에서 올린다.
		System.out.println(10 % 3);
		//------------------------------------------------
		System.out.println("--------------------------");
		System.out.println(10 - 2 * 3);
		System.out.println((10 - 2) * 3);
	}

}

