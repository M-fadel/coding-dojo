/*
Parens Valid
Given an str that has parenthesis in it
return whether the parenthesis are valid
*/

const str1 = "Y(3(p)p(3)r)s"
// const expected1 = true

// const str2 = "N(0(p)3"
// const expected2 = false
// // Explanation: not every parenthesis is closed.

// const str3 = "N(0)t ) 0(k"
// const expected3 = false
// // Explanation: because the underlined ")" is premature: there is nothing open for it to close.

// const str4 = "a(b))(c"
// const expected4 = false
// // Explanation: same number of opens and closes but the 2nd closing closes nothing

function parensValid(str) {
    // code here
    t = true
    check = false
    numberOfChecks=0
    count = 0
    for (i = 0; i < str.length; i++) {
        console.log(str[i])
        if(check&&str[i] ==")"&&numberOfChecks!=0){
            count--
            t= false
            numberOfChecks--;
            // console.log(str[i]+"aaa")
        }
        if(str[i] =="("){
            // console.log(str[i]+"ddd")
            count++ 
            numberOfChecks++
                }else if(str[i] ==")"&&t){
                    check=false
                    
                    console.log(str[i]+numberOfChecks)
                    break 
                }
                
}

// console.log(t+count)
}
    // for (let index = 0; index < str.length; index++) {
    //     for (let i = 0; i < temp.length; i++) {
            
    //         if (str[index] == temp[i]){
    //             temp1.push(str[index])
    //         } else{ 
    //             continue }
    //         }
    //         // if(count ==0){
    //         //     t =true}else{t =false}
    //     }
    //     console.log(temp1)
    //     for (let index = 0 ; index<temp1.length-1; index++){
    //         if(temp1[index] == temp[index+1]){
    //             count++ 
    //             index++
    //         }else if(temp1[index]==temp)
    //     }
        // }   
parensValid(str1)
/*****************************************************************************/

/*
Braces Valid
Given a string sequence of parentheses, braces and brackets, determine whether it is valid.
*/

// const str1 = "W(a{t}s[o(n{ c}o)m]e )h[e{r}e]!";
// const expected1 = true;

// const str2 = "D(i{a}l[ t]o)n{e";
// const expected2 = false;

// const str3 = "A(1)s[O (n]0{t) 0}k";
// const expected3 = false;

function bracesValid(str) {
    // code here
}