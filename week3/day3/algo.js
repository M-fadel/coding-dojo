/*
String Encode
You are given a string that may contain sequences of consecutive characters.
Create a function to shorten a string by including the character,
then the number of times it appears.
If final result is not shorter (such as "bb" => "b2" ),
return the original string.
  */

// const str1 = "aaaabbcddd"
// const expected1 = "a4b2c1d3"

const str2 = ""
// const expected2 = ""

const str3 = "a"
// const expected3 = "a"

const str4 = "bbcc"  // b2c2  -> length is both 4
// const expected4 = "bbcc"

function encodeStr(str) {
    // your code
    temp = str[0]
    count = 0
    count2=0
    for (let index = 0; index < str.length; index++) {
        if (str[index]== temp[count]){
            count2++

        }else {
            count+=2;
            temp +=count2 +str[index]
            count2 = 1
        }
        
    }
    temp +=count2 
    
    console.log(temp)
}

encodeStr(str4)

/*****************************************************************************/

/*
    String Decode
    Given a string, create a function that repeats each letter by the number that follows
    */

const str1 = "";
// const expected1 = "aaabbcddd";

function decodeStr(str) {
    // code here
index =1
temp = ""
loop = true
count = 0
condition = false
    while (loop){

    if(index<str.length){
    
    if(count >0){
        
    temp +=str[index-1]
    count--;
  
    }else if (count==0){
        
    count =str[index] ;

    
    }

    if(count ==0){ index = index+2}
}else {loop=false

        }
    }


    console.log(temp)
    
}
decodeStr(str1)