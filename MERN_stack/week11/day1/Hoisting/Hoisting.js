// console.log(example);
let example = "I'm the example!";
//console log --->reference error
//let example = "I'm the example!";

var needle = 'haystack';
test();
function test() {
    var needle = 'magnet';
    console.log(needle);
}
//test -->console.log(needle); //magnet



var brendan = 'super cool';
function print() {
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);
//console.log(brendan); --->'super cool' the function will be skipped




var food = 'chicken';
console.log(food);
eat();
function eat() {
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}
//console.log(food);--->chicken
//console.log(food)---half-chicken

mean();
console.log(food,);
var mean = function () {
    food = "chicken";
    console.log(food);
    var food = "fish";
    console.log(food);
}
console.log(food);
//mean();  error






console.log(genre);
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);
//console.log(genre);-->undefined
//console.log(genre);-->rock
//console.log(genre);-->r&be

dojo = "san jose";
console.log(dojo);
learn();
function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
console.log(dojo);





console.log(makeDojo("Chicago", 65));
console.log(makeDojo("Berkeley", 0));
function makeDojo(name, students) {
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if (dojo.students > 50) {
        dojo.hiring = true;
    }
    else if (dojo.students <= 0) {
        dojo = "closed for now";
    }
    return dojo;
}
//console.log(makeDojo(chicago,65)
//enter the function
//const dojo empty object
//dojo.name =name; cant change const 
