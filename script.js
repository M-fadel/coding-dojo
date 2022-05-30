function pizzaOven(crustType,sauceType,cheeses,toppings){
    var pizza={}
    pizza.crustType=crustType;
    pizza.sauceType=sauceType;
    pizza.cheeses=cheeses;
    pizza.toppings=toppings;
    
    return pizza;
}

function randomPizaa(){
    var crust=["Stuffed Crust" ,"Cracker Crust","Flat Bread Crust","Thin Crust","Cheese Crust Pizza."]
    var sauce=["pesto","hummus","Buffalo Sauce","White Garlic Sauce","Marinara Sauce"]
    var cheese=["Cheddar","Gorgonzola","Provolone","Goat Cheese","Mozzarella"]
    var topping=["Pepperoni","Mushrooms","Veggie","Red Onion","Sausage"]
    
    var pizza={}
    pizza.crustType=crust[Math.floor(Math.random() * 5)];
    pizza.sauceType=sauce[Math.floor(Math.random() * 5)];
    pizza.cheeses=cheese[Math.floor(Math.random() * 5)];
    pizza.toppings=topping[Math.floor(Math.random() * 5)];

    return pizza;

    
}

var p1=randomPizaa();
var p2=randomPizaa();
var p3=randomPizaa();




console.log(p1)
console.log(p2)
console.log(p3)
// console.log(p4)