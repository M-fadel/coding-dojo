class Zoo:
    def __init__(self, zoo_name):
        self.animals = []
        self.name = zoo_name

    def add_lion(self, name,hp = 250,age = 0,happiness =100):
        self.animals.append( Lion(name,hp,age,happiness) )

    def add_tiger(self, name,hp = 200 , age = 0,happiness =100):
        self.animals.append( Tiger(name , hp,age,happiness) )
    def add_bear(self, name,hp = 450 , age = 0,happiness= 100):
        self.animals.append(Bear(name , hp,age,happiness))
    def print_all_info(self):
        print("-"*30, self.name, "-"*30)

        for animal in self.animals:
            animal.display_info()
    def feed_all(self):
        for animal in self.animals:
            animal.feed()
class Animal:
    def __init__(self, name,hp,age,happiness):
        self.name = name
        self.health = hp
        self.age = age
        self.happiness = happiness
    def feed(self):
        self.health +=10
        self.happiness +=10
    def display_info(self):
        print("name =",self.name,"type =",self.type,"health =",self.health,"happiness =",self.happiness)
class Lion(Animal):
    def __init__(self, name ,hp,age ,happiness):
        self.type ="Lion"
        self.name = name
        self.health = hp
        self.age = age
        self.happiness = happiness
class Tiger(Animal):
    def __init__(self, name,hp,age,happiness):
        self.type ="Tiger"
        self.name = name
        self.health = hp
        self.age = age
        self.happiness = happiness
class Bear(Animal):
    def __init__(self, name,hp,age,happiness):
        self.type ="Bear"
        self.name= name
        self.health = hp
        self.age = age
        self.happiness = happiness

zoo1 = Zoo("John's Zoo")
zoo1.add_lion("Nala")
zoo1.add_lion("Simba")
zoo1.add_tiger("Rajah")
zoo1.add_tiger("Shere Khan")
zoo1.add_bear("random bear")
zoo1.print_all_info()
zoo1.feed_all()
zoo1.print_all_info()
