package day08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("abcdefg"); //ù��° ���ڰ� �빮���� Ÿ���� ����� �����ϰ� �ִ�.
		//String str = "abcdefg";
		
		/*
		System.out.println("���ڿ� �Է� : ");
		str = sc.next();
		System.out.println(str);
		System.out.println( str.toUpperCase() );//�ҹ��ڸ� �Է��ϸ� ���� �빮�ڷ� ��ȯ�����ش�.
		*/
		
		//a(0)b(1)c(2)d(3)e(4)f(5)g(6)
		System.out.println( str.charAt(0) );//�ε��� ��ȣ�� ������ �Ѵ�. //0��° �� �ϳ��� �����´�.
		System.out.println( str.charAt(0) == 'a' );//���� �ϳ��� ó���ϹǷ� ' '�� ���� ���� �� �ִ�.
		System.out.println( str.charAt(1) == 'a' );
		System.out.println( str.charAt(0)-32 ); //�ҹ��� - 32 = �빮�� (��������)
		System.out.println( (char)(str.charAt(0)-32) );//�ҹ��� - 32 = �빮�� (��������)
		
		str += " ";//���ڿ� ���� //���鵵 ���� �����ϴ�.
		str += "a";
		System.out.println(str);
		
		str = "   aaaa aaa aaa    ";
		System.out.println( str );
		
		String re = str.trim(); //������ ������
		System.out.println( re );
		
		String name = "ȫ�浿   ";
		System.out.println("name : " + name);
		if(name.trim().equals("ȫ�浿")) { //���� ������ ���� ���ش����� ��
			System.out.println("����~");
		}else {
			System.out.println("�ٸ���!");
		}
		
		//Ư�� ���ڿ��� �ڸ��� ���
		String addr;
		addr = "047869/����� ���α� ����3��/3��";
		String[] ad = addr.split("/"); //�ش簪�� �������� �ڸ��ų� ���� //split(������)
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		System.out.println(ad[2]);
		
		//replace - Ư�����ڿ����� �����ϰ����Ҷ� ���
		String replace = addr.replace("/", ",");//Ư�� ���ڸ� �ٲ��ִ� ���
		System.out.println(replace);
		
	}

}
