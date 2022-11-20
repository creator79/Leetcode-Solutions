if(x<0) return false;
int temp = x;
int rev = 0;
while(temp!=0){
int  m= temp%10;
rev = rev * 10 +m;
temp/=10;
}
return  x==rev;