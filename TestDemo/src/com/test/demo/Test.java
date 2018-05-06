package com.test.demo;

public class Test {
	
	public static void main(String[] args) {
		
		/** One */
		System.out.println("[One]");
		String name1 = "f(“junyiacademy”) == “ymedacaiynuj”";
		String name2 = "f(“flipped class room is important”) == “deppilf ssalc moor si tnatropmi”";
		
		String result1 = "";
		for (int i=name1.length()-1; i>=0; i--) {
			result1 += name1.charAt(i);
		}
		System.out.println("Reverse Name1: " + result1);
		
		// Wait
		String result2 = "";
		String[] resultArray = name2.split("f(“|“| |”) == “|”");
		
		for (int i=0; i<resultArray.length; i++) {
			System.out.println("String: " + resultArray[i]);
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
		 * "混合"包裝袋裝的就是鉛筆。
		 */
		
		/** Four */
		/**
		 *  服務生應該一人退還一人20元
		 *  三人各出300元 - 服務生還給他們一人20元 = 三人各出280元
		 *  280元*3人+服務生私吞的60元 = 840 + 60 = 900元
		 */
	}
	
}
