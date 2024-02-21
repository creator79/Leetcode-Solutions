/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    // console.log("function" +fn);
    // console.log("arr" +arr);

 let newArr = [];
for(let i=0;i<arr.length;i++){
  if( fn(arr[i], i)) {
      newArr.push(arr[i])
  }
}
return newArr;
};