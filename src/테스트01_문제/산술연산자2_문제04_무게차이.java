package 테스트01_문제;
/*
	[문제]	  	
		사과 4개는 32g이고,	귤 3개는 12g이다. 		
		사과 1개의 무게와 귤 1개의 무게의 차이는 얼마인지 구하시오. 
		소수점 두 자리까지 구하시오.
		단, 각각의 과일의 무게는 동일하다. 
	[정답] 
		4.00
*/  
public class 산술연산자2_문제04_무게차이 {
	public static void main(String[] args) {	
		double 사과1 = 32/4.0;
		double 귤1 = 12/3.0;
		System.out.printf ("%.2f" , 사과1-귤1);
	
	}
}