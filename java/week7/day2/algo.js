
const numsOrdered = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const numsRandomOrder = [9, 2, 5, 6, 4, 3, 7, 10, 1, 8];

const numsReversed = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1];

// const expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function insertionSort(nums, nums1) {
    // code here
    var temp
    
    for (let index = 1; index < nums.length; index++) {
        if(nums[index]< nums[index-1]){
            temp = nums[index]
            for ( index; index >= 0; index--) {
                nums[index]= nums[index-1]
                if (nums[index] > nums[index-1]|| index ==0){
                    nums[index] = temp;
                    break
                }    
            }
        }
    }
    
    
    return nums;
}
function comp(nums , nums1){
    for ( var i=0; i<nums1.length; i++ ){
        nums.push(nums1[i]);
    }
    nums = insertionSort(nums);
    return insertionSort(nums);
}
console.log(comp(numsRandomOrder,numsReversed))
// console.log(insertionSort(numsOrdered)); 
// console.log(insertionSort(numsRandomOrder , numsReversed));
// console.log(insertionSort(numsReversed));
  // Resources
  // https://visualgo.net/en/sorting