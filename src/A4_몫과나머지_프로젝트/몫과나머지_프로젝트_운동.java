package A4_몫과나머지_프로젝트;

public class 몫과나머지_프로젝트_운동 {
	
	public static void main(String[] args) {
		/*
		 * [문제]
		 	승환이는 일정한 빠르기로 운동장을 5바퀴도는 데 1시간 15분걸렸습니다. 		 
		  	7바퀴를 도는데는 얼마나 걸릴까요? (시간분 으로 표현)	 
		 */
		
		/*
		 * [단주]
		 * 5바퀴 60+15
		 * 1바퀴 (60+15)/5
		 * 7바퀴 (((60+15)/5)*7)
		 * 
		 */
		
		System.out.println((((60+15)/5)*7)+"분");
		System.out.println(((((60+15)/5)*7)/60)+"시간"+(((60+15)/5)*7)%60+"분");
		
	}
	
}