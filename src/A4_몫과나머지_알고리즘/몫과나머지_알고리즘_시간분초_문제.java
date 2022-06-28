package A4_몫과나머지_알고리즘;

public class 몫과나머지_알고리즘_시간분초_문제 {
	public static void main(String[] args) {	
		/*
		 *  [문제] 
		 *  	123123초 는 몇시간 몇분 몇초인가 ?			
		 */
		
		/*
		 * [단주]
		 * 1분 ==> 60초
		 * 1시간 ==> 60분
		 * 1시간 ==> 3600초
		 */
		
		System.out.println((123123/3600)+"시간");
		System.out.println((123123 - (123123/3600*3600)) / 60 + "분");
		System.out.println(123123 % 3600 / 60 + "분");
		System.out.println(123123 % 60 + "초");
		System.out.println(123123%3600/60);
		System.out.println(12123%60);
     }
}