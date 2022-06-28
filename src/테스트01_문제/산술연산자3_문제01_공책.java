package 테스트01_문제;
/*
	[문제]
		철수는 친구의 생일 선물로 가격이 4000원인 필통 1개와 
		가격이 700원인 공책 몇 권을 사려고 한다. 
		철수는 13000원을 가지고 있을 때,
		공책은 최대한 몇 권을 살 수 있을지 구하시오.
		남은 금액도 함께 출력하시오.
	[정답] 
		12, 600
 */
public class 산술연산자3_문제01_공책 {
	public static void main(String[] args) {	
		int 남은금액 = 13000-4000;
		int 공책갯수 = 남은금액/700;
		System.out.println(공책갯수);
		System.out.println(남은금액%700);
		
	}
}