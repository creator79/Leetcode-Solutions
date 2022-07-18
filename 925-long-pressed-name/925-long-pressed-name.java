class Solution {

    // runtime aa raha hai kyo ki jab name and typed string agar uska phela char hi alag hai toh typed ka prev check karne par par -1 pe koi condition nahi hai jiski vajah se error aa raha hai Like :---> "a"
    //                  "b"
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;

        while ( j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
                // aisa case jaha typed chal raha hai par named string khatm ho gayi hai vaha code fat raha hai
                //                 add edge case j-1 >=0
            } else if (j - 1 >= 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            } //else
        } //while

        //         add testcase 2
        if (i == name.length()) {
            return true;
        } else {
            return false;
        }
    } //main
} //solution class
