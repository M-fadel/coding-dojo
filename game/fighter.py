import random

class Fighter:
    def __init__(self,name ="bot",hp =100,dmg=10):
        self.name=name
        self.hp=hp
    
    def attack(self ,target):
        target.hp -=dmg*(random.random()*10)
        
