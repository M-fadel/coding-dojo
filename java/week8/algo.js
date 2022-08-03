/*
Efficiently combine two already sorted multiset arrays
into an array containing the sorted set intersection of the two.
Output: only the shared values between the two arrays (deduped).
* Venn Diagram Visualization (bottom):
* https://i.ytimg.com/vi/sdflTUW6gHo/maxresdefault.jpg
* - Time: O(n) linear, n = max(sortedA.length, sortedB.length) when there are
*    dupes we may end up looping over all items of longer arr.
* - Space: O(n) linear, n = shorter array length.
* @param {Array<number>} sortedA
* @param {Array<number>} sortedB Both sets are multisets
*    (multi in that it can contain multiple dupes).
* @returns {Array<number>} The sorted set intersection: a new array that is
*    sorted and contains only the shared values between the two arrays
*    deduped.
*/

const numsA1 = [0, 11, 2, 2, 2, 7,1,0,0,0];
const numsB1 = [2, 2, 6, 6, 7];
const expected1 = [2, 7];

const numsA2 = [0, 1, 2, 2, 2, 7];
const numsB2 = [2, 2];
const expected2 = [2];


function orderedIntersection (sortedA, sortedB) {
    var temp = []
    var temp1 = sortedA;
    for (var i = 0; i < sortedA.length; i++) {
        
            for (var j = 0; j < temp1.length; j++) {
                if (temp1[i] == sortedB[j]) {
                    
                    temp1[i]= null
                    break;
                    
            }
        }
    }
    for(var i = 0 ; i<temp1.length; i++){
    
        if(temp1[i]!=null){
                temp.push(temp1[i])
            }
            
    }
    console.log(temp)
}
orderedIntersection(numsA1, numsB1)
// orderedIntersection(numsA2, numsB2)
// var temp=[]
// var temp1=[]=numsA1
// var counter = 0
// var number = 16
// var index = 0;
// for(var i = 0; i < numsA1.length; i++){
//     if(numsA1[i]+counter<=number){
//         temp[index].push(temp1[i])
//         counter= counter +numsA1[i]
        
//     }
// }
// console.log(temp,counter)