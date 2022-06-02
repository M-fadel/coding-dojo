



function pizzaOven(crustType, sauceType, cheeses,toppings){
    var Pizza = {};
    Pizza.crustType =crustType;
    Pizza.sauceType = sauceType;
    Pizza.cheeses = cheeses;
    Pizza.toppings = toppings
    return Pizza;

}
// "deep dish", "traditional", ["mozzarella"], and ["pepperoni", "sausage"]

var pizza;
pizza = pizzaOven("deep dish", "traditional", ["mozzarella"],["pepperoni", "sausage"]);
console.log(pizza)
pizza = pizzaOven("hand tossed", "marinara", ["mozzarella", "feta"],["mushrooms", "olives", "onions"]);
console.log(pizza)
pizza = pizzaOven("ThinCrust, marinara", ["meatballs", "sausage", "pepperoni"]);
console.log(pizza)
pizza = pizzaOven("Thick Crust , ranch", "mozzarella", ["onions", "olives", "mushrooms","chicken"])
console.log(pizza)

