/*
  Given an array of strings
  return a sum to represent how many times each array item is found (a frequency table)
  Useful methods:
    Object.hasOwnProperty("keyName")
      - returns true or false if the object has the key or not
    Python: key in dict
*/

// const arr1 = ["a", "a", "a"]
// const expected1 = {
//   a: 3,
// }

const arr2 = ["a", "b", "a", "c", "B", "c", "c", "d"]
// const expected2 = {
//   a: 2,
//   b: 1,
//   c: 3,
//   B: 1,
//   d: 1,
// }

// const arr3 = []
// const expected3 = {}

function frequencyTableBuilder(arr) {
  temp={}
  temp1 =[]
  if (temp1.length==0){
    temp1.push(arr[0])
  }else{
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < temp1.length; i++) {
      if (temp[i]==arr[j]){
        
      }
      
    }
  }
  }
  console.log(temp)
  return temp
  // code here
}

frequencyTableBuilder(arr2)

/*****************************************************************************/

/*
    Reverse Word Order
  
    Given a string of words (with spaces)
    return a new string with words in reverse sequence.
  */

const str1 = "This is a test";
// const expected1 = "test a is This";

function reverseString(str) {
  // code here
  temp = []
  temp =str.split(" ")
  console.log(temp[0])
  temp1 = ""
  for (let index = 0; index < temp.length/2; index++) {
    temp1 = temp[index]
    temp[index]=temp[temp.length-1-index]
    temp[temp.length-1-index] = temp1
  }
  return temp
}
console.log(reverseString("This is a test"))
