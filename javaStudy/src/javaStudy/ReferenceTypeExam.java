package javaStudy;

public class ReferenceTypeExam {

	public static void main(String[] args) {
		ReferenceTypeExam exam = new ReferenceTypeExam();
		
		// 기본형 변수 value1을 addOne에 전달한다
		int value = 10;
		exam.addOne(value);
		System.out.println("기본형 변수의 값을 다른 메서드에서 변경한 결과: " + value);
		
		// 참조형 변수 arr을 addOne에 전달한다
		int []arr = {10};
		exam.addOne(arr);
		System.out.println("참조형 변수의 값을 다른 메서드에서 변경한 결과: " + arr[0]);
	}
	
	public void addOne(int value) {
		value++;
	}
	
	public void addOne(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]++;
		}
	}

}

// 출처: 모두의 자바