package day08;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {

		//1
		String fStr = new String("Have a nice day Have a nice day Have a nice day");
		int i=0;
		ArrayList arr = new ArrayList();
		while(i < fStr.length()) {
			if(fStr.charAt(i) == 'a') {
				arr.add(i);
			}
			i++;
		}
		System.out.println(arr);
		System.out.println();
		
		
		//2
		String sStr = new String("It is a fun java programming");
		int j=0;
		int cnt_a=0,cnt_g=0,cnt=0;
		while(j < sStr.length()) {
			if(sStr.charAt(j) == 'a')
				cnt_a++;
			else if(sStr.charAt(j) == 'g')
				cnt_g++;
			j++;
		}
		System.out.println("�� ���� : "+sStr.length());
		System.out.println("a ���� : "+cnt_a);
		System.out.println("g ���� : "+cnt_g);
		System.out.println();
		
		
		//3
		String tStr = new String("tESt  sTring  change   first");
		String changeStr = new String();
		int k=0;

		tStr = tStr.toLowerCase();
		if(tStr.charAt(0) >='a' && tStr.charAt(0) <='z') {
			changeStr+=(char)(tStr.charAt(k)-32);
			k++;
		}
		while(k<tStr.length()) {
			if(tStr.charAt(k) != ' ') {
				changeStr+=tStr.charAt(k);
				k++;
				continue;
			}
			while(tStr.charAt(k) == ' ') {
				changeStr+=tStr.charAt(k);
				k++;
			}
			if(tStr.charAt(k) >= 'a' && tStr.charAt(k) <='z')
				changeStr+=(char)(tStr.charAt(k)-32);
			k++;
		}
		System.out.println("���� �� : " + tStr);
		System.out.println("���� �� : " + changeStr);
		System.out.println();
		
		
		//4
		String pStr = "�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
		System.out.println("====���� �� str====\n"+pStr);
		pStr = pStr.replace("-", ":");
		String[] arrStr = pStr.split("\n");
		pStr="";
		for(int n=0;n<arrStr.length;n++) {
			String[] reStr = arrStr[n].split(":");
			reStr[1]=reStr[1].replace(reStr[1], "1999��");
			//reStr[1]="1999��";
			pStr+=(reStr[0]+":"+reStr[1]+"\n");
		}
		System.out.println("====���� �� str====\n"+pStr);
	}

}
