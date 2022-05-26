package day08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("abcdefg"); //첫번째 글자가 대문자인 타입은 기능을 포함하고 있다.
		//String str = "abcdefg";
		
		/*
		System.out.println("문자열 입력 : ");
		str = sc.next();
		System.out.println(str);
		System.out.println( str.toUpperCase() );//소문자를 입력하면 전부 대문자로 변환시켜준다.
		*/
		
		//a(0)b(1)c(2)d(3)e(4)f(5)g(6)
		System.out.println( str.charAt(0) );//인덱스 번호로 접근을 한다. //0번째 값 하나만 꺼내온다.
		System.out.println( str.charAt(0) == 'a' );//문자 하나만 처리하므로 ' '로 값을 비교할 수 있다.
		System.out.println( str.charAt(1) == 'a' );
		System.out.println( str.charAt(0)-32 ); //소문자 - 32 = 대문자 (숫자형태)
		System.out.println( (char)(str.charAt(0)-32) );//소문자 - 32 = 대문자 (문자형태)
		
		str += " ";//문자열 덧셈 //공백도 덧셈 가능하다.
		str += "a";
		System.out.println(str);
		
		str = "   aaaa aaa aaa    ";
		System.out.println( str );
		
		String re = str.trim(); //공백을 없애줌
		System.out.println( re );
		
		String name = "홍길동   ";
		System.out.println("name : " + name);
		if(name.trim().equals("홍길동")) { //양쪽 공백을 먼저 없앤다음에 비교
			System.out.println("같다~");
		}else {
			System.out.println("다르다!");
		}
		
		//특정 문자열을 자를때 사용
		String addr;
		addr = "047869/서울시 종로구 종로3가/3층";
		String[] ad = addr.split("/"); //해당값을 기준으로 자를거냐 정함 //split(구분자)
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		System.out.println(ad[2]);
		
		//replace - 특정문자열들을 변경하고자할때 사용
		String replace = addr.replace("/", ",");//특정 문자를 바꿔주는 기능
		System.out.println(replace);
		
	}

}
