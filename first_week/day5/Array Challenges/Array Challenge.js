function print(item){
    console.log(item);
}
function alwaysHungry(arr) {
    // your code here 
    var feedingtime = 0;
    for (let index = 0; index < arr.length; index++) {
        if(arr[index]=="food"){
            feedingtime++;
        }
        
    }
    
    for( let i= feedingtime ; i>0;i--){
        print("yummy");
    }
    if(feedingtime == 0){

        print("im hungry")
    }
    
}
   
alwaysHungry([3.14, "food", "pie", true, "food"]);
// this should console log "yummy", "yummy"
alwaysHungry([4, 1, 5, 7, 2]);
// this should console log "I'm hungry"
