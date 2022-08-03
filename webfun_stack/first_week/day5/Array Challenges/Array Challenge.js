function print(item) {
    console.log(item);
}
function alwaysHungry(arr) {
    // your code here 
    var feedingtime = 0;
    for (let index = 0; index < arr.length; index++) {
        if (arr[index] == "food") {
            feedingtime++;
        }

    }

    for (let i = feedingtime; i > 0; i--) {
        print("yummy");
    }
    if (feedingtime == 0) {

        print("im hungry")
    }

}
alwaysHungry([3.14, "food", "pie", true, "food"]);
// this should console log "yummy", "yummy"
alwaysHungry([4, 1, 5, 7, 2]);
// this should console log "I'm hungry"


function highPass(arr, cutoff) {
    var filteredArr = [];
    // your code here
    for (let index = 0; index < arr.length; index++) {

        if (arr[index] > cutoff) {
            filteredArr.push(arr[index]);

        }
    }
    return filteredArr;

}
var result = highPass([6, 8, 3, 10, -2, 5, 9], 5);
console.log(result); // we expect back [6, 8, 10, 9]


function betterThanAverage(arr) {
    var sum = 0;
    // calculate the average
    for (var index = 0; index < arr.length; index++) {
        sum += arr[index]
    }
    var average = sum / arr.length;
    var count = 0;
    // count how many values are greated than the average

    for (var index = 0; index < arr.length; index++) {
        if (arr[index] > average) {
            count++;
        }
    }
    return count;
}

var result = betterThanAverage([6, 8, 3, 10, -2, 5, 9]);
console.log(result); // we expect back 4
function reverse(arr) {
    // your code here
    var reverse = []
    for (var index = arr.length - 1; index >= 0; index--) {
        reverse.push(arr[index]);
    }
    arr = reverse;
    return arr;
}

var result = reverse(["a", "b", "c", "d", "e"]);
console.log(result); // we expect back ["e", "d", "c", "b", "a"]

function fibonacciArray(n) {
    // the [0, 1] are the starting values of the array to calculate the rest from
    var fibArr = [0, 1];
    // your code here
    for (let index = 0; index <= 10; index++) {
        var sum = (fibArr[fibArr.length - 2] + fibArr[fibArr.length - 1]);
        fibArr.push(sum);
    }
    return fibArr;
}

var result = fibonacciArray(10);
console.log(result); // we expect back [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
