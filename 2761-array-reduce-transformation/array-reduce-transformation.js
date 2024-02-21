/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {

  var accumulator = init;
for (var i = 0; i < nums.length; i++) {
    if (accumulator !== undefined) {
      accumulator = fn( accumulator, nums[i],   i);
    } else {
      accumulator = arr[i];
    }
  }
  return accumulator;

    
};