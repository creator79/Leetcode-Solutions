class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
    int n = properties.length;
//      USE LAMDA FUNCTION TO SORT THE ARRAY JAVATPOINT
    Arrays.sort(properties, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
    int ans = 0;
    int max = 0;
        
//  YAHA PE SIRF HUM DEFENCE KI VALUE KO CHECK KARENGE PICHE SE KYO KI HUME PTA AANE VALI VALUE AB CHOTI HI HONGI 
// AGAR DEFEENCE KI VALUE KUM HOGI AAGEVALE SE TOH COUNT BADHANA H NAHI TOH MAX VALUE BADAHA SE KE NEXT ELEMENT KE DEFENCE VALUE KO MAX SE COMPARE KARTE CHALE JAAO
    for (int i = n - 1; i >= 0; i--) {
      if (properties[i][1] < max) {
        ans++;
      } else {
        max = properties[i][1];
      }
    }
    return ans;
  }
}


// a d
// i j
// r c
// 5,5
// 6,6
    