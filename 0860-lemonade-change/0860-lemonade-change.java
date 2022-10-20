class Solution {
//     Count the number of $5 and $10 in hand.

// if (customer pays with $5) five++;
// if (customer pays with $10) ten++, five--;
// if (customer pays with $20) ten--, five-- or five -= 3;

// Check if five is positive, otherwise return false.

    public boolean lemonadeChange(int[] bills) {
        int five = 0 , ten =0;
        for (int i = 0; i < bills.length; i++) {
           if (bills[i]==5) five++;
            else if(bills[i]==10) {
                five--;
                ten++;
            }
            else if(ten>0) {
                ten--;
                five--;
            }
            else {
                five-=3;
            }
            
            if(five<0)return false;
        }
        // System.out.println(s);
        return true;
    }
}
