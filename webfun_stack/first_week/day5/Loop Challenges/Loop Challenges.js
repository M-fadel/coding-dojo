function print(item){
    console.log(item)
}

function br(){
    print("======================================================================");
}
function from1to20(){

    for (let i = 1; i <= 20; i++) {
        print(i);
        
    }

}

function remOf3(){
for (let index = 100; index > 0; index--) {
    if (index % 3 == 0) {
        print(index)
    }
    
}
}

function de1(){
var i =50;
print(i);
for (let index = 0; index < 50; index++) {
    
    print(i=i-1.5);
    
}
}

function adding(){
    var i = 0;
    for (index = 0; index <= 100; index++) {
    i = i+index
    
    }
    print(i);
}

function Factorial(){
    var i=1;
for (index = 1; index <= 12; index++) {
    i = i*index;
    
}
print(i);
}

from1to20();
br();
remOf3();
br();
de1();
br();
adding();
br();
Factorial();
