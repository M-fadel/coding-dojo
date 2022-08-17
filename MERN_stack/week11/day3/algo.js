// let name = prompt("What is your name?")
const prompt = require("prompt-sync")();
console.log("this is 2 players based game each player will enter a name")
var player1 = prompt("Player1 enter your name: ")
if(player1.length<1){
    console.log("okay your name is Jeff for now\nNext time enter your own name >:(")
    player1 = "Jeff"
}
var player2 = prompt("Player2 enter your name: ")
if(player2.length<1){
    console.log("are you even trying?? fine your name is Lazy gamer")
    player2 = "Lazy gamer"
}
// console.log(player1+" "+player2)


while(true){


}