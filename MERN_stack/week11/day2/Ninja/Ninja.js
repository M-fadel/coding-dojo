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
const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.showStats();

