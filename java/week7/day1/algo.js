/*
start at 0:52 seconds: https://www.youtube.com/watch?v=lyZQPjUT5B4
Stable sort
Time Complexity
    - Best: O(n) linear when array is already sorted.
    - Average: O(n^2) quadratic.
    - Worst: O(n^2) quadratic when the array is reverse sorted.
Space: O(1) constant.
For review, create a function that uses BubbleSort to sort an unsorted array in-place.
For every pair of adjacent indices, swap them if the item on the left is larger than the item on the right until array is fully sorted
*/
const numsOrdered = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
const numsRandomOrder = [9, 2, 5, 6, 4, 3, 7, 10, 1, 8]
const numsReversed = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

// const expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

function bubbleSort(num, i=0) {
    // code here
    var nums = num
    var temp


    for (let index = 0; index < nums.length; index++) {
        i++
        if (nums[index] > nums[index + 1]) {
            temp = nums[index]
            nums[index] = nums[index + 1]
            nums[index + 1] = temp
            index = -1
        }

    }
    console.log(i)
    return nums
}
console.log(numsOrdered)
console.log("================")
console.log(bubbleSort(numsReversed))
console.log("================")
// console.log(bubbleSort(numsRandomOrder))
