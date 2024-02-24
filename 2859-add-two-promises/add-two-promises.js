/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function (promise1, promise2) {
// soln using promise.all 

const [val1 , val2] = await Promise.all( [promise1, promise2]) 
return val1+val2

// genric method
    // let ans1 = 0; ans2 = 0;
    // await promise1.then(value1 => {
    //     return ans1 = value1
    // })
    // await promise2.then(value2 => {
    //     return ans2 = value2

    // })
    // .catch(err => {
    //         console.log(err);
    //     });
    // return ans1 + ans2;




};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */