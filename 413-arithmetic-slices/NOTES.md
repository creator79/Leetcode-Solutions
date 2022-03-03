// Dp Apporach
// we can make use of property that if currently running sequence is ap then adding one more element to that sequence will increase the total number of slices by current no of sequence in current sum.
// take two variables -> curr to hold the current sequence count
// sum to hold the answer
​
//  Example -
//  now suppose input is [0,1,2,3,4].
//   for first 3 elements in ap = curr=1; [0,1,2]
//   on reading 3, curr=2 and sum=1+2=3.  [0,1,2],[1,2,3],[0,1,2,3]
//   on reading 4, curr=3 and sum=3+3=6.
//   [0,1,2],[1,2,3],[0,1,2,3],[0,1,2,3,4],[2,3,4],[0,1,2,3,4,5]
// For case where ap sequence breaks just set current total to 0 again for fresh count