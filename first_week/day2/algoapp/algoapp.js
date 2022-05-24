const arr1 = ["a", "b", "c"];
const newItem1 = "d";
// const expected1 = 4
// const expectedArr1 = ["a", "b", "c", "d"]

const arr2 = []
const newItem2 = "a"
// const expected2 = 1
// const expectedArr2 = ["a"]

function push(arr, newItem) {
    // code here
    arr[arr.length]=newItem;
    console.log(arr);
    console.log(arr.length);
}
console.log("1st array");
push(arr1,newItem1);
console.log("\n 2nd array");
push(arr2,newItem2)