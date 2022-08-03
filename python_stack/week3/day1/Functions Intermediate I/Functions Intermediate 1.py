import random
def randInt(min=  0 , max=  100 ):
    if max > min:
        num = random.random()*max+min
        return round (num)
    else:
        print ("max cannot be less than min,,, generating random number between 0 and 100:")
        num = random.random()*100
        return round (num)

print(randInt()) 		            # should print a random integer between 0 to 100
print(randInt(max=50)) 	            # should print a random integer between 0 to 50
print(randInt(min=50)) 	            # should print a random integer between 50 to 100
print(randInt(min=50, max=10))      # should print a random integer between 50 and 500