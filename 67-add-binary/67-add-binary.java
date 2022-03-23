import java.math.*;
// class Solution {
//     public String addBinary(String a, String b) {
//     int b1 = Integer.parseInt(a, 2);
//     int b2 = Integer.parseInt(b, 2);
//     int sum = b1 + b2;
//     return Integer.toBinaryString(sum);
  
        
//     }
// }
class Solution{
  public String addBinary (String a, String b){
   
BigInteger d1 = new BigInteger(a, 2);
BigInteger d2 = new BigInteger(b, 2);
return (d1.add(d2)).toString(2);
    
  }
}