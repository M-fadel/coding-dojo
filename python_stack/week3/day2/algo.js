/*
  Given an arr and a separator string, output a string of every item in the array separated by the separator.
  No trailing separator at the end
  Bonus: Default the separator to a comma with a space after it if no separator is provided
*/

const arr1 = [1, 2, 3]
const separator1 = ", "
// const expected1 = "1, 2, 3"

const arr2 = [1, 2, 3]
const separator2 = "-"
// const expected2 = "1-2-3"

const arr3 = [1, 2, 3]
const separator3 = " - "
// const expected3 = "1 - 2 - 3"

const arr4 = [1]
const separator4 = ", "
// const expected4 = "1"

const arr5 = []
const separator5 = ", "
// const expected5 = ""

const arr6 = [1, 2, 3]
// separator is not given
// const expected 6 = "1, 2, 3"
function join(arr, separator = ", ") {
    // code here
    temp = ""
    if(arr.length ==1){
        temp = arr[0]
        return temp
    }else if(arr.length>1){
        temp = arr[0]
        for (let index = 1; index < arr.length; index++) {
            temp +=separator
            temp +=arr[index]
            
        }
        return temp

    }else{
        return temp
    }
}

console.log(join(arr1, separator1))
console.log(join(arr2, separator2))
console.log(join(arr3, separator3))
console.log(join(arr4, separator4))
console.log(join(arr5, separator5))
console.log(join(arr6))
/*****************************************************************************/

/*
    Book Index
    Given an array of ints representing page numbers
    return a string with the page numbers formatted as page ranges when the nums span a consecutive range
  */

const nums1 = [1,2, 13, 14, 15, 37, 38, 69, 70];
// const expected1 = "1, 13-15, 37-38, 70";

function bookIndex(pageNums) {
    // code here    
    temp =""
    for (let index = 0; index < pageNums.length; index++) {
        if (index== 0){
            // temp +=pageNums[index]+", "
        }
        else if ((pageNums[index-1]-pageNums[index])-(pageNums[index]-pageNums[index+1])==0){
            temp +=pageNums[index-1] +"-"+pageNums[index+1]+", "
            index= index+1
        }
        else if ((pageNums[index]-pageNums[index-1])==-1) {
        temp +=pageNums[index-1] +"-"+pageNums[index]+", "
        }else if(index==pageNums.length-1){
            temp +=pageNums[index]
            
        }else {
            // temp +=pageNums[index]+", "
        }
        
    }
    return temp
}
console.log()

console.log(bookIndex(nums1));