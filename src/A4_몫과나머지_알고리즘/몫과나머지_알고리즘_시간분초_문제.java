package A4_���������_�˰���;

public class ���������_�˰���_�ð�����_���� {
	public static void main(String[] args) {	
		/*
		 *  [����] 
		 *  	123123�� �� ��ð� ��� �����ΰ� ?			
		 */
		
		/*
		 * [����]
		 * 1�� ==> 60��
		 * 1�ð� ==> 60��
		 * 1�ð� ==> 3600��
		 */
		
		System.out.println((123123/3600)+"�ð�");
		System.out.println((123123 - (123123/3600*3600)) / 60 + "��");
		System.out.println(123123 % 3600 / 60 + "��");
		System.out.println(123123 % 60 + "��");
		System.out.println(123123%3600/60);
		System.out.println(12123%60);
     }
}