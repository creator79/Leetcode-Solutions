// class Solution {
//     public String multiply(String num1, String num2) {
//         int a = Integer.parseInt(num1);
//        int b= Integer.parseInt(num2);
//       int c= a*b;
//       return String.valueOf(c);  
//     }
// }

 //Time complexity: O(len1 * len2)
// Auxiliary Space: O(len1 + len2) , to store res or prod
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))return  "0";
        int len1 = num1.length(), len2 = num2.length(), res[] = new int[len1+len2-1];
        //step1
        for(int indx1 = 0; indx1<len1; indx1++){
            for(int indx2 = 0; indx2<len2; indx2++){
                res[indx1+indx2] += (num1.charAt(indx1) - '0') * (num2.charAt(indx2) -'0');
            }
        }
        //step2
        for(int indx = res.length-1; indx>0; indx--){
            res[indx-1] += res[indx] /10;
            res[indx] = res[indx] % 10;
        }
        //step3
        StringBuilder prod = new StringBuilder();
        for(int num : res){
            prod.append(num+"");
        }
        return prod.toString();
    }
}