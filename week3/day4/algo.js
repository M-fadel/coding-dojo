/*
Zip Arrays into Map
Given two arrays, create an associative array (aka hash map, an obj / dictionary) containing keys from the first array, and values from the second.
Associative arrays are sometimes called maps because a key (string) maps to a value
 */

const keys1 = ["abc", 3, "yo"]
const vals1 = [42, "wassup", true]
// const expected1 = {
//   abc: 42,
//   3: "wassup",
//   yo: true,
// }

function zipArraysIntoMap(keys, values) {
  // code here
  console.log(keys)
var di ={}
for (var i = 0; i < keys.length;i++){
    di[keys[i]]= values[i]
    
    
}
console.log(di)
}
zipArraysIntoMap(keys1, vals1)
/*****************************************************************************/

/*
Invert Hash
A hash table / hash map is an obj / dictionary
Given an object / dict,
return a new object / dict that has the keys and the values swapped so that the keys become the values and the values become the keys
*/

const obj1 = {
  name: "Zaphod",
  charm: "high",
  morals: "dicey"
};
// const expected1 = {
//   Zaphod: "name",
//   high: "charm",
//   dicey: "morals"
// };
console.log()
function invertObj(obj) {
  // code here
var di ={}
for (var key in obj) {
  di[obj[key]] = key
}
console.log(obj)
console.log(di)
}
invertObj(obj1)