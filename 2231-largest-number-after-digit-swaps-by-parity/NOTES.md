PriorityQueue<Integer> oddPQ = new PriorityQueue<>((a,b) ->(b-a));
PriorityQueue<Integer> evenPQ = new PriorityQueue<>((a,b) ->(b-a));
String str = num+"";
// iterate through Array
for(char c: str.toCharArray()){
// extract each digit
int el = c-'0';
// check its even or not
if(el%2==0){
evenPQ.offer(el);
}else{
oddPQ.offer(el);
}
}
String ans = "";
// iterate through input Array that is num
for(char c: str.toCharArray()){
int el = c-'0';
if(el%2==0){
ans+= (evenPQ.poll()+"");
} else{
ans+= (oddPQ.poll()+"");
}
}
return Integer.parseInt(ans);