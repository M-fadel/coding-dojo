/**
 * Partitions the given array in-place by selecting the number at the middle
 * index to use it as a "pivot" value, then arranges all numbers less than the
 * pivot to be to it's left and all larger numbers to the right of the pivot.
 * - Time: O(?).
 * - Space: O(?).
 * @param {Array<number>} nums
 * @param {number} left The index indicating the start of the slice of array
 *    being processed.
 * @param {number} right The index indicating the end of the slice of array
 *    being processed.
 * @returns {Array<number>} The idx where left section of smaller items ends.
 */
function partition(nums, left = 0, right = nums.length - 1) {
    var mid = nums[(nums.length - 1) / 2]
    // var temp = []

    console.log(mid)
    for (var i = 0; i < nums.length; i++) {
        console.log(i)
        console.log(left, right)
        if (right - left) {
            var temp = nums[right]
            nums[right] = nums[(nums.length - 1) / 2]
            nums[(nums.length - 1) / 2] = temp
        }
        if (nums[i] <= mid) {
            var tempn = nums[left]
            nums[left] = nums[i]
            nums[i] = tempn
            left++;
        } else if (nums[i] >= mid) {
            // var tempn = nums[right]
            // nums[right]=nums[i]
            // nums[i]=tempn
            right--;
        }
    }
    console.log(nums)
}
// result [2, 3, 14, 8, 6, 11, 7]
const nums1 = [11, 8, 14, 3, 6, 2, 7];
const nums2 = [11, 8, 14, 3, 3, 3, 6, 2, 7];
const nums3 = [1, 17, 12, 3, 9, 13, 21, 4, 27];

partition(nums1);
partition(nums2);
// partition(nums3);