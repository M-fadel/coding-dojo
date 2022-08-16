Number.prototype.isPrime = function() {
    var s = false;
    for( let i=2; i<this; i++ ) {
        if( this % i === 0 ) {
            s= false;
        }
    }
    s= true;
}

const { performance } = require('perf_hooks');
const start = performance.now();
let primeCount = 0;
let num = 2; // for math reasons, 1 is considered prime
while( primeCount < 1e4 ) {
    var s = false;
    for( let i=2; i<this; i++ ) {
        if( this % i === 0 ) {
            s= false;
        }
    }
    s= true;
    if( s ) {
        primeCount++;
    }
    num++;
}
console.log(`The 10,000th prime number is ${num-1}`);
console.log(`This took ${performance.now() - start} milliseconds to run`);

// // recursive
// function rFib( n ) {
//     if ( n < 2 ) {
//         return n;
//     }
//     return rFib( n-1 ) + rFib( n-2 );
// }
// rFib(20);
// // iterative
// function iFib( n ) {
//     const vals = [ 0, 1 ];
//     while(vals.length-1 < n) {
//         let len = vals.length;
//         vals.push( vals[len-1] + vals[len-2] );
//     }
//     return vals[n];
// }
// iFib(20);
