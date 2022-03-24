// class Solution {
//     public String multiply(String num1, String num2) {
//         int a = Integer.parseInt(num1);
//        int b= Integer.parseInt(num2);
//       int c= a*b;
//       return String.valueOf(c);  
//     }
// }
/*
Intuition: .Recall the multiplication method in elementry mathematics, we used to
            mutliply two numbers: 
            1 We multiplied each digit of second number with each digit of first num
              taking (d1*d2)%10 to answer and (d1*d2)/10 as carry
            2 If the second num have more than one digits we appended 0 before
             writing the res in the second column and continued till all the digits
             of 2nd num are used.
            3 Finally we added all the columns in case 2nd num contains more than one
              digit.
           
           .Trick here is instead of taking carry while multiplying digit by digit 
            we do this step at end
            
            .Take the example:
            num1 =98, num2 = 18.

           Step1: First we multiply each number in num1 and num2:
           -> res = [9, 8+72, 64] => [9, 80, 64]

           Step2: Then we add the carry of res[i] to res[i-1]:
           -> res = [9 , 80+6, 4] = [9, 86, 4] -> [9+8, 6, 4] = [17, 6, 4]

           Step3: Turn res to prod and then prod to string:
           -> "17" + "6" + "4" = "1764"*/


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