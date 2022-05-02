package com.callor.school.exec;

public class ExecV2 {
	public static void main(String[] args) {
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		
		int[] intSum = new int[5];
		
		for(int i =0; i < intKor.length; i++) {
			int iKor = (int)(Math.random() *100)+1;
			int iEng = (int)(Math.random() *100)+1;
			int iMath = (int)(Math.random() *100)+1;
			
			int iSum = iKor + iEng + iMath;
			
			intKor[i] = iKor;
			intEng[i] = iEng;
			intMath[i] = iMath;
			
			intSum[i] = iSum;
		}
		
		printScore(intKor, intEng, intMath, intSum);
		
		System.out.println("=".repeat(50));
		for(int i =0; i < intSum.length; i++) {
			for(int j =0; j < intSum.length; j++) {
				
				if(intSum[i] > intSum[j]) {
					
					int _n = intSum[i];
					intSum[i] = intSum[j];
					intSum[j] = _n;
					
					_n = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _n;
					
					_n = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _n;
					
					_n = intKor[i];
					intMath[i] = intMath[j];
					intMath[j] = _n;
					
				}
			}
		}
		printScore(intKor, intEng, intMath, intSum);
	}
	public static void printScore(int[] intKor, int[] intEng, int[] intMath, int[] intSum) {
		
		for(int i =0; i < intKor.length; i++) {
			System.out.printf("%3d\t",intKor[i]);
			System.out.printf("%3d\t",intEng[i]);
			System.out.printf("%3d\t",intMath[i]);
			System.out.printf("%3d\n",intSum[i]);
		}
	}
}
