// class Solution {
//        public static int[] twoSum(int[] numbers, int target) {
//         int len = numbers.length;
//         for (int i = 0; i < len; i++) {
//             for (int j = i + 1; j < len; j++) {
//                 if (numbers[i] + numbers[j] == target) {
//                     return new int[]{i + 1, j + 1};
//                 }
//             }
//         }

//         return new int[0];
//     }
// }


class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int[] result = new int[2]; 
       Map<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i < numbers.length; i++) {
           if(map.containsKey(target - numbers[i])) {
               result[0] = map.get(target - numbers[i]) + 1;
               result[1] = i + 1;
           }
           map.put(numbers[i], i);
       } 
       return result; 
    }
}