class Solution {
public int thirdMax(int[] nums) {
HashSet set=new HashSet<>();
for(int i:nums)
set.add(i);
List list = new ArrayList<>(set);
​
Collections.sort(list);
if(list.size()==2)
return list.get(1);
else if(list.size()==1)
return list.get(0);
else
return list.get(list.size()-3);
}
}
​