package com.test.demo;

public class Test {
	
	public static void main(String[] args) {
		
		/** One */
		System.out.println("[One]");
		String name1 = "junyiacademy";
		String name2 = "flipped class room is important";
		
		String result1 = "";
		for (int i=name1.length()-1; i>=0; i--) {
			result1 += name1.charAt(i);
		}
		System.out.println("Reverse Name1: " + result1);
		
		// Wait
		String[] resultArray = name2.split(" ");
		
		System.out.print("Reverse Name2: ");
		for (int i=0; i<resultArray.length; i++) {
			String tempName = "";
			for (int j=resultArray[i].length()-1; j>=0; j--) {
				tempName += resultArray[i].charAt(j);
				if (j==0) {
					resultArray[i] = tempName;
				}
			}
			System.out.print(resultArray[i] + " ");
		}
		
		System.out.println();
		
		
		/** Two */
		System.out.println("[Two]");
		int inputData = 15;
		int resultNumber = 0;
		int[] result = new int[inputData];
		for (int i=1; i<=inputData; i++) {
			if (i%15==0) {
				result[resultNumber] = i;
				resultNumber+=1;
			} else if (i%3==0 || i%5==0) {

			} else {
				result[resultNumber] = i;
				resultNumber+=1;
			}
		}
		System.out.print("Two Result: ");
		for (int i=0; i<=result.length-1; i++) {
			if (result[i] != 0) {
				System.out.print(result[i] + ", ");
			}
		}
		System.out.println("\nTwo Result Total: " + resultNumber);
		
		
		/** Three */
		/**
		 * 如果抽出"鉛筆"包裝袋的是鉛筆，那麼這個一定是混合袋。
		 * "原子筆"包裝袋裝的就是鉛筆。
		 * "混合"包裝袋裝的就是原子筆。
		 */
		
		/** Four */
		/**
		 *  750 + 60 = 810是三人總共要付的價格。
		 *  另外再加上90元還給三位遊客的 810 + 90 = 900元
		 */
	}
	
}
