class Knight {
    constructor(name, forceSide, hp, str, force, power, block) {
        this.name = name;
        this.forceSide = forceSide;
        this.hp = hp;
        this.str = str;
        this.force = force;
        this.power = power;
        this.block = block;
    }

    lightsaberAttack(target){
        if (Math.ceil(Math.random() * 10 + this.str) < target.block){
            this.force -= 5
            console.log(`${target.name} block the light-saber attack of ${this.name}, stats now ${target.name} has health ${target.hp}, force ${target.force} remaining. and ${this.name} has ${this.hp} health, ${this.force} force remaining!`)
        } else {
            target.hp -= 5
            target.force -= 2
            console.log(`${this.name} make damage to the to ${target.name}, stats now ${target.name} has health ${target.hp}, force ${target.force} remaining. and ${this.name} has ${this.hp} health, ${this.force} force remaining!`)
        }
    }

    forceAttack(target){
        if (Math.ceil(Math.random()* 30 + this.str) < target.block){
            this.force -= 5
            this.target -= 5
            console.log(`${target.name} block the force attack of ${this.name}, stats now ${target.name} has health ${target.hp}, force ${target.force} remaining. and ${this.name} has ${this.hp} health, ${this.force} force remaining!`)
        } else {
            target.hp -= 10
            target.force -= 5
            if(this.hp<50){
                this.hp += 5
            }
            if(this.force<50){
            this.force += 5
            }
            console.log(`${this.name} use the force to attack the ${target.name} and he make a huge damage to his health and force, stats now ${target.name} has health ${target.hp}, force ${target.force} remaining. and ${this.name} has ${this.hp} health, ${this.force} force remaining!`)
        }
    }

    highGroundAttack(target) {
        if (Math.ceil(Math.random()* 50 + this.str) < target.block){
            
            this.force -= 15
            target.force -= 10
            console.log(`${target.name} has blocked an fetal attack from the ${this.name}, stats now ${target.name} has health ${target.hp}, force ${target.force} remaining. and ${this.name} has ${this.hp} health, ${this.force} force remaining!`)
        } else {
            target.hp = target.hp- 30
            target.force = target.force -10
            if(this.hp<50){
                this.hp += 10
            }
            if(this.force<50){
            this.force += 10
            }
            console.log(`${target.name} receive a fetal attack from the ${this.name}, stats now ${target.name} has health ${target.hp}, force ${target.force} remaining. and ${this.name} has ${this.hp} health, ${this.force} remaining!`)
        }
    }
}


class Jedi extends Knight{

    constructor(name) {
        super(name, "Jedi", 50, 50, 50, 50, 50);
    }
}

class Sith extends Knight{

    constructor(name) {
        super(name, "Sith", 50, 50, 50, 50, 50);
    }
}



function fight(player1, player2){
    while(true){
        console.log()
        console.log(player1.name ,"make your move")
        console.log("1-force attack\n2-light saber Attack\n3-highGroundAttack\n")
        var move =prompt()
        if(move ==1){
            player1.forceAttack(player2)
        }else if(move ==2){
            player1.lightsaberAttack(player2)
        }else if(move ==3){
        player1.highGroundAttack(player2)
        }else if(move=="z"||move =="Z"){
            break
        }else{
            console.log(player1.name,`didnt attack ${player2.name} have taken the initiative`)
        }
        console.log()

        if(player2.hp<=0){
            if(player1.name =="Obi-Wan Kenobi"){
                console.log(player1.name,": You was my brother anakin you was supposed chosen to destroy the sith not join them!")
            }else{
                console.log(player1.name,"won the battle!")

            }
            break;
        }

        console.log(player2.name ,"make your move")
        console.log("1-force attack\n2-light saber Attack\n3-highGroundAttack\n")
        var move =prompt()
        if(move ==1){
            player2.forceAttack(player1)
        }else if(move ==2){
            player2.lightsaberAttack(player1)
        }else if(move ==3){
        player2.highGroundAttack(player1)
        }else if(move=="z"||move =="Z"){
            break
        }else{
            console.log(player1.name,`didn't attack ${player2.name} have taken the initiative`)
        }
        if(player1.hp<0){
            if(player2.name){
                console.log(player2.name,": I told you obi-wan you can't destroy dark side!")
            }else{
                console.log(player2.name,"won the battle!")

            }
            break;
        }
    }
}

const prompt = require("prompt-sync")();

console.log("War! The Republic is crumbling under attacks by the ruthless Sith Lord, Count Dooku. There are heroes on both sides. Evil is everywhere.\n","In a stunning move, the fiendish droid leader, General Grievous, has swept into the Republic capital and kidnapped Chancellor Palpatine, leader of the Galactic Senate. \n","As the Separatist Droid Army attempts to flee the besieged capital with their valuable hostage, two Jedi Knights lead a desperate mission to rescue the captive Chancellor.... \n")

var player1 = new Jedi("Obi-Wan Kenobi")
var player2 = new Sith("Anakin Skywalker") 
console.log("press z to exit")

console.log("do you want to start the first scenario? \n 1-yes")
var choice = prompt()
console.log("anakin skywalker: \"If you're not with me, then you're my enemy.\"\n",
"Obi wan Kenobi: \"Only a Sith deals in absolutes. I will do what I must.\"\n",
"anakin skywalker: \"You will try.\"")
fight(player1, player2)
//end of battle
console.log("do you want to start the second scenario? \n 1-yes")
var choice = prompt()
if(choice == 1){

    console.log("press z to exit")
    
    player1 =new Jedi("Master Yoda")
    player2 =new Sith("Darth Sidious")
    
    console.log("YODA: I hear a new apprentice, you have. Emperor, or should I call you Darth Sidious.")
    console.log("DARTH SlDIOUS: Master Yoda, you survived.")
    console.log("YODA: Surprised?")
    console.log("DARTH SlDIOUS: Your arrogance blinds you, Master Yoda. Now you will experience the full power of the dark side.")
    
    fight(player1, player2)
}
console.log("do you want to start the second scenario? \n 1-yes")
var choice = prompt()
if(choice == 1){

    //end of battle
    console.log("this is 2 players based game each player will enter a name")
    console.log("Player1 enter your name: ")
    var player1name = prompt()
    if(player1.length<1){
            console.log("okay your name is Jeff for now\nNext time enter your own name >:(")
            player1 = "Jeff"
        }
        console.log("choose your force side \n",
        "1- Jedi\n",
        "2-Sith\n")
        var player1Clan = prompt()
if(player1Clan ==1){
        player1=new Jedi(player1name)
    }else if(player1Clan ==2){
            player1=new Sith(player1name)
        }else{
                console.log("you didn't choose your side FINE you are a Sith")
                player1=new Sith(player1name)
            }
            var player2name = prompt("Player2 enter your name: ")
            if(player2.length<1){
                    console.log("are you even trying?? fine your name is Lazy gamer")
                    player2 = "Lazy gamer"
                }
                if(player1Clan ==2){
                        player2=new Jedi(player1name)
                    }else if(player1Clan ==1){
                            player2=new Sith(player1name)
                        }
                        fight(player1, player2)
                    }
                        
                        
                        