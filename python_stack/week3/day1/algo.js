/*
  String: Reverse
  Given a string,
  return a new string that is the given string reversed
*/

// const str1 = "creature"
// const expected1 = "erutaerc"

// const str2 = "dog"
// const expected2 = "god"

function reverseString(str) {
    // code here
}

/*****************************************************************************/

/*
    Acronyms
  
    Create a function that, given a string, returns the string’s acronym
    (first letter of each word capitalized).
  
    Do it with .split first if you need to, then try to do it without
  */

const str1 = " there's     no free lunch - gotta pay yer way. ";
// const expected1 = "TNFL-GPYW";

// const str2 = "Live from New York, it's Saturday Night!";
// const expected2 = "LFNYISN";

// function acronymize(str) {
//     // code here

// }
function acronymize(str) {
    newstr='';
    if(str[0]!=' '){
        newstr+=str[0];
    }
    for(var i=0;i<str.length-1;i++){
        if(str[i]==' ' && str[i+1]== ' '){
        continue;
        }else if(str[i]==' '){
            newstr+=str[i+1]
        }
    }
    console.log(newstr.toUpperCase())
}

/*****************************************************************************/

/* case insensitive string compare */

  const strA1 = "ABC";
  const strB1 = "abc";
//   const expected1 = true;

  const strA2 = "ABC";
  const strB2 = "abd";
//   const expected2 = false;

  const strA3 = "ABC";
  const strB3 = "bc";
//   const expected3 = false;

function caseInsensitiveStringCompare(strA, strB) {
    // code here
    
        console.log(strA.toLowerCase() == strB.toLowerCase())
        var s =[];
        if (strA.length != strB.length) {
            console.log(false)
        }else {

            for (let index = 0; index <strA.length; index++) {
                
                
            }
        }
        


}

// caseInsensitiveStringCompare(strA1, strB1);
// caseInsensitiveStringCompare(strA2, strB2);
// caseInsensitiveStringCompare(strA3, strB3);
//----------------------------------------------------------------------------
// var x = 'b';
// var ascii_code = x.codePointAt(0);
// console.log(ascii_code);
// console.log()
acronymize(str1)