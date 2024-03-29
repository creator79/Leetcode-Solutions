/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */



const createCounter = (init) => {
    let counter = init;

    return {
        increment: () => {
            return ++counter;
        },
        decrement: () => {
            return --counter;
        },
        reset: () => {
            counter = init;  // this init is outer function init
            return counter;  // we can access it due to closure 
        }
    };
};



/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */