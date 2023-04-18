/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
const farr=[];

for (let i=0;i<arr.length;i++){
  if(fn(arr[i],i,arr)){
    farr.push(arr[i])
  }
}
    return farr;
};


