for (let index = 1; index <= 100; index++) {
    if(index%3 ==0 && index %5 ==0){
        console.log("FizzBuzz");
    }else if(index %3 ==0){
            console.log("FIZZ");
    }else if(index %5 == 0 ){
        console.log("BUZZ")
    }else{
        console.log(index)

    }
    
}