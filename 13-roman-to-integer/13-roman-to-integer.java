class Solution {
   public int romanToInt(String s) {
		char charArr[] = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int valueArr[] = { 1, 5, 10, 50, 100, 500, 1000 };
		int number = 0;
		int lastNum = 0;
		for (int j = s.length() -1 ; j>=0;j--) {
			for (int i = 0; i < charArr.length; i++) {
				if (charArr[i] == s.charAt(j)) {
					if (valueArr[i] < lastNum) {
						number -= valueArr[i];
					} else {
						number += valueArr[i];
					}
					lastNum = valueArr[i];
				}
			}
		}
		return number;
	}
}