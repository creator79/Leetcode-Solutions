Choice 1: Add current indexed number to current field of IP.
Choice 2: Terminate current field and add to next field of IP.
​
public List<String> restoreIpAddresses(String s)
{
List<String> result = new ArrayList<>();
//Start filling from field = 1 & index = 0;
restore(s,result,1,0,"","");
return result;
}
public void restore(String s, List<String> result, int fieldCount, int index, String curIp, String curNumStr)
{
curNumStr = curNumStr + s.charAt(index);
int curNumInt = Integer.parseInt(curNumStr);
//Check for number in range [0,255] && should not have leading zero(s) for non-zero numbers
if(curNumInt <= 255 && curNumInt>= 0 && (curNumStr.length() == 1 || curNumStr.charAt(0) != '0'))
{
//If last index & currently at 4th field
if(index == s.length()-1 && fieldCount == 4)
{
//Tricky one: curIp is generated only using choice-2. So empty string & '.' added needs to be removed.
result.add((curIp+"."+curNumStr).substring(1));
}
else if(index < s.length()-1)
{
//Choice 1: Add current indexed number to current field of IP.
restore(s,result,fieldCount,index+1,curIp,curNumStr);
//Choice 2: Terminate current field and add to next field of IP.
restore(s,result,fieldCount+1,index+1,curIp+"."+curNumStr,"");
}
}
}