package A1_기본이론;

/*
    세번째 출력문 (서식문자)
   [1]}System.out.println("",);
   
   [2] 서식문자의 종류
       (1)%d : 정수
       (2)%f : 실수
       (3)%c : 문자한개
       (4)%s : 문자여러개
       
 */
public class 기본이론7_서식문자 {

	public static void main(String[] args) {
		System.out.printf("%d", 10);
		System.out.println();
		System.out.println(10); //서식문자가 먼저 사용되었다. 그 이후1n 출력등장
		System.out.println("----------------------");
		System.out.printf("%f" , 10.3);
		// 서식문자는 소수점이 기본 6자리이다.
		System.out.println();
		System.out.printf("%20f" , 10.12);
		System.out.println();
		System.out.println("------------------------");
		System.out.println("%c");
	}

}
