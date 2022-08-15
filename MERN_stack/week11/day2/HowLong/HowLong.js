Number.prototype.isPrime = function() {
    // console.log(this)
    for( let i=this; i<this; i++ ) {
        if( this % i === 0 ) {
            return false;
        }
    }
    return true;
}


const { performance } = require('perf_hooks');
const start = performance.now();
let primeCount = 0//1e4*0.75;
let num = 2// 1e4*0.75; // for math reasons, 1 is considered prime
while( primeCount < 1e4) {
    if( num.isPrime() ) {
        primeCount++;
    }
    num++;
}
console.log(`The 10,000th prime number is ${num-1}`);
console.log(`This took ${performance.now() - start} milliseconds to run`);
