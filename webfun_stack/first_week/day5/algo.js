// This weeks theme: Arrays

/*
Given an array, remove and
return the value at the beginning of the array and then shift the remaining items down to fill the empty space.
Do this without using any built-in array methods except pop().
*/

const arr1 = [1, 2, 3]
// const expected1 = 1
// // after running function arr1 should now be:
// const arr1Expected = [2, 3]

// const arr2 = ["a", "b", "c", "d"]
// const expected2 = "a"
// // after running function arr2 should now be:
// const arr2Expected = ["b", "c", "d"]

function shift(arr) {
    // code here
    console.log(arr);
    var temparr= [];
    var index = 0;  
    if (arr.length !=0){
    do{
   
        
        
            if(index!= arr.length-1){
            temparr [index]= arr[index+1]}
            // temparr[index]=newItem;
        
        index++ 
    }while(index < arr.length);
    }
    console.log(temparr);
    return temparr;
    
}

/* ******************************************************************************** */

/*
Given array and an additional value, insert this value at the beginning of the array by making space for it at the beginning of the array.
return the new length of the array.

Do this without using any built-in array methods.
*/

// const arr1 = [1, 2, 3]
// const newItem1 = 0
// const expected1 = 4
// // after function is called, arr1 should be:
// const arr1Expected = [0, 1, 2, 3]

const arr2 = []
const newItem2 = "a"
// const expected2 = 1
// // after function is called, arr2 should be:
// const arr2Expected = ["a"]

function unshift(arr, newItem) {
    // code here
    console.log(arr ,newItem);
    var temparr= [];
    var index = 0;  
    do{
   
        
        if (index == 0){

            temparr[index]=newItem;
        }else{
            temparr [index]=arr[index-1]
        }
        index++ 
    }while(index < arr.length+1);
    console.log(temparr);
    return temparr;
}
shift(arr1);
// unshift(arr1,newItem1);
// unshift(arr2,newItem2);