const nums1 = [-2, 5, 7, 0, 3];
const expected1 = 2;

const nums2 = [9, 9];
const expected2 = -1;
const num3 =[9,0,4,5];
const numstext = [-2, 5,1, 7, 0, 3,1];
function balanceIndex(nums) {
    blance=-1
    if(nums.length!=2){
        for (let index = 1; index < nums.length;++index) {
          var sumlift= 0, sumright=0
          for (let i = 0; i < index; i++) {
            sumlift = nums[i]+sumlift
          }
          for (let i = nums.length-1; i > index; i--) {
            sumright += nums[i]

          }
          if (sumlift == sumright){
            blance = index
            break
          }
        }
    }
    return blance
    // code here

}
console.log(balanceIndex(nums1))
console.log(balanceIndex(nums2))
console.log(balanceIndex(num3))
console.log(balanceIndex(numstext))