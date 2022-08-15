class Ninja{
    constructor(nName,health = 100,speed =3,strength = 3){
        this.Name = nName;
        this.health = health;
        this.speed =speed
        this.strength =strength
    
    }
    sayName(){
        return console.log(this.Name);
    }
    showStats(){
        console.log("Ninja: " + this.Name);
        console.log("has the following stats: ")
        console.log("they have " +this.health + " hp")
        console.log("with " + this.strength+" strength");
        console.log("and " + this.speed+" speed");
    
    }
    drinkSake() {
        this.health = this.health +10
    }
    }

class Sensei extends Ninja {


    constructor(nName ,health = 200,speed=10,strength=10,wisdom =10) {
        super(nName,health,speed,strength);
        this.wisdom = wisdom;
    }
    speakWisdom(){
        super.drinkSake()
        console.log("What one programmer can do in one month, two programmers can do in two months.")
    }
}
const s = new Sensei("Hyabusa");
s.showStats()
s.speakWisdom()