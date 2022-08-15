/*
  Given an honorific (name title) and array of full name strings,
  in "LastName, FirstName" format
  Return a new array of strings in this format: "Honorific FirstName LastName"
  Bonus: re-write it with built in functional programming methods
*/

const honorific1 = "Mr."
const names1 = []
// const expected1 = []

const honorific2 = "Sir"
const names2 = ["Sanchez, Rick", "Smith, Jerry"]
// const expected2 = ["Sir Rick Sanchez", "Sir Jerry Smith"]

const honorific3 = "Mrs."
const names3 = ["HorseDoctor, Beth"]
// const expected3 = ["Mrs. Beth HorseDoctor"]

function addHonorific(honorific, fullNames) {
    // code here
    var temp = []

    for (let i = 0; i < fullNames.length; i++) {
        var stop = false
        var lName = '' 
        var fName = ''
        if (fullNames.length > 0) {

            for (let j = 0; j < fullNames[i].length; j++) {
                if (fullNames[i][j] == ',') {
                    stop = true
                    continue
                } else
                    if (stop) {
                        fName += fullNames[i][j];

                    } else {
                        lName = lName + fullNames[i][j];

                    }
            }
            temp.push(honorific + " " + fName + " " + lName)
        }
    }
    console.log(temp)
    return temp
}

addHonorific(honorific1, names1)
addHonorific(honorific2, names2)
addHonorific(honorific3, names3)