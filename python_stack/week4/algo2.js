/*
  Array: Binary Search (non recursive)
  Given a sorted array and a value, return whether the array contains that value.
  Do not sequentially iterate the array. Instead, ‘divide and conquer’,
  taking advantage of the fact that the array is sorted.
*/

const nums1 = [1, 3, 5, 6]
const searchNum1 = 4
// const expected1 = false

const nums2 = [4, 5, 6, 8, 12]
const searchNum2 = 5
// const expected2 = true

const nums3 = [3, 4, 6, 8, 12]
const searchNum3 = 3
// const expected3 = true

const nums4 = [2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9]
const searchNum4 = 2
// const expected4 = true

function binarySearch(sortedNums, searchNum) {
    // code here
    temp = 0
    low = 0
    high = sortedNums.length
    while (temp < sortedNums.length) {
            index = parseInt((high+low)/2)
            console.log(sortedNums[index],low,high)

            if(searchNum == sortedNums[index]){
                return true;

            }else if(searchNum <sortedNums[index]){
                high =index 
            }else if(searchNum > sortedNums[index]){
                low = index
            }
        temp++
        }
        return false;
    }

        console.log(binarySearch(nums1, searchNum1))
        console.log(binarySearch(nums2, searchNum2))
        console.log(binarySearch(nums3, searchNum3))
        console.log(binarySearch(nums4, searchNum4))
