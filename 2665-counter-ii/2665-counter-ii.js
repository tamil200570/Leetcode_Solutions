/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let cval=init;
    return{
        increment: () =>
        {
             return ++cval;
        },
        decrement: () =>
        {
            return --cval;
        },
        reset: () =>
        {
            cval=init;
            return cval;
        }
    };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */