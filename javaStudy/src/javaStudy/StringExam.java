package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		String str1 = new String("Hello world");
		String str2 = new String("Hello world");
		
//		if(str1==str2){
//			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
//		}else {
//			System.out.println("str1과 str2는 다른 레퍼런스입니다.");
//		}
		
		if(str1.equals(str2)) {  // equels 메서드는 객체의 주소가 아닌 객체의 내용을 비교한다.
			System.out.println("str1과 str2는 같은 값을 가집니다.");
		}else {
			System.out.println("str1과 str2는 다른 값을 가집니다.");
		}
	}
}

// 출처: 모두의 자바
