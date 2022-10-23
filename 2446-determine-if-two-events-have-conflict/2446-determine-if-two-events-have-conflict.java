class Solution {
// good implementaion question due to Brute force we handled many cases
    public boolean haveConflict(String[] event1, String[] event2) {
        String st1 = event1[0];
        String endd1 = event1[1];
        String st2 = event2[0];
        String endd2 = event2[1];
        int start1 = Integer.parseInt(st1.substring(0, 2)) * 60 + Integer.parseInt(st1.substring(3));
        int end1 = Integer.parseInt(endd1.substring(0, 2)) * 60 + Integer.parseInt(endd1.substring(3));
        int start2 = Integer.parseInt(st2.substring(0, 2)) * 60 + Integer.parseInt(st2.substring(3));
        int end2 = Integer.parseInt(endd2.substring(0, 2)) * 60 + Integer.parseInt(endd2.substring(3));
        if (start1 <= start2 && end1 >= end2 || start1 >= start2 && end1 <= end2) {
            return true;
        } else if (start1 <= start2 && end1 <= end2 && end1 >= start2) {
            return true;
        } else if (start1 >= start2 && end1 >= end2 && end2 >= start1) {
            //System.out.println("viv");
            return true;
        }
        return false;
    }
}
