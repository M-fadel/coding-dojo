class card{
    constructor(name,cost){
        this.name = name;
        this.cost = cost;
    }
}
class unit extends card{
    constructor(name,cost,power ,res){
        super(name,cost);
        this.power = power;
        this.res = res;
    }
    attack(target){
        target.res =target.res-this.power
        console.log(target.res,target.name ,"got hit by",this.power,"he now have" ,target.res)
    }
}
class effect extends card{
    constructor(name,cost,stat,magnitude){
        super(name,cost);
        this.magnitude = magnitude;
        this.stat= stat;
    }


efe(target){
    if( target instanceof unit ) {
        // implement card text here
        if(this.stat = "res"){
            target.res= target.res+this.magnitude
            console.log(target.name ,"has his res effected by",this.magnitude,
            "he have ",target.res)
        }else if(this.stat = "power"){
            target.power= target.power+this.magnitude
            console.log(target.name ,"has his power effected by",this.magnitude,
            "he have ",target.power)
        }
    } else {
        throw new Error( "Target must be a unit!" );
    }
}
}

p1 = new unit("Red Belt Ninja",3,3,4)
e1 =new effect("Hard Algorithm" , 2,"res",3)
e1.efe(p1)
p2 = new unit("Black Belt Ninja",4,5,4)
e2 =new effect("Unhandled Promise Rejection",1,"res",-2)
e2.efe(p1)
e3 =new effect("Pair Programming", 3,"power",2)
e3.efe(p1)
p1.attack(p2)

