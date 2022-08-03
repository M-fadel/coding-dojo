/*
Given an array of integers
return the index where the smallest integer is located
return -1 if there is no smallest integer (array is empty)
since -1 is not a valid index, this indicates it couldn't be found
If the smallest integer occurs more than once, return the index of the first one.
*/
// num = 1 <- assignment
// num == 1 <- comparison

const nums1 = [5, 2, 3]
const expected1 = 1

const nums2 = [5, 7, 2, 3]
const expected2 = 2

const nums3 = []
const expected3 = -1


function indexOfMinVal(nums) {
    // code here
    console.log(nums);
    var smallest = -1;
    if (nums.length == 0) {

        return -1;
    }
    else {
        smallest = nums[0];
        for ( index = 0; index < nums.length; index++) {
            
            if (nums[index] < smallest){
            smallest = nums[index];
            }
        }
    }
    return smallest;
}

/* ******************************************************************************** */

/*
Array: Second-Largest
Return the second-largest element of an array, or null if there is none.
Bonus: do it with one loop and no nested loops
*/

const nums4 = [2, 3, 1, 4]
const expected4 = 3

const nums5 = [3, 3]
const expected5 = null

const nums6 = [2]
const expected6 = null

const nums7 = []
const expected7 = null

function secondLargest(nums) {
    // code here
    var secondlargest= null;
    var largest = null;
    console.log(nums);
    if(nums.length==0){
        return secondLargest;
    }else if (nums.length == 1) {
        return secondLargest;
    }else{
        secondLargest = nums[0];
        
        for (let index = 0; index < nums.length; index++) {
            if (nums[index]>largest) {
               largest = nums[index] ;
            //    nums[index].pop();
            }
        }
        for (let index = 0; index < nums.length; index++) {
            if (nums[index]>largest) {
                largest = nums[index] ;
                nums[index].pop();
             }
            
        }
        return largest
    }
    
}
// console.log(indexOfMinVal(nums1));
// console.log(indexOfMinVal(nums2));
// console.log(indexOfMinVal(nums3));
console.log(secondLargest(nums4));
