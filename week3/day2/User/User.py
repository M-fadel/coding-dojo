class User:		# here's what we have so far
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account_balance = 0
    # adding the deposit method
    def make_deposit(self, amount):	# takes an argument that is the amount of the deposit
        self.account_balance += amount	# the specific user's account increases by the amount of the value received
    def make_withdrawal(self, amount):
        self.account_balance -= amount
    def display_user_balance(self):
        print(self.account_balance)
    def transfer_money(self, other_user, amount):
        self.make_withdrawal(amount)
        other_user.make_deposit(amount)
        


guido = User("guido","123@gmail.com")
monty = User("monty", "321@gmail.com")
mona = User("mona", "mona@gmail.com")

guido.make_deposit(100)
guido.make_deposit(100)
guido.make_deposit(200)
guido.make_withdrawal(300)
guido.display_user_balance()

monty.make_deposit(50)
monty.make_deposit(2008)
monty.make_withdrawal(62)
monty.make_deposit(4)
monty.display_user_balance()

mona.make_deposit(100)
mona.make_withdrawal(100)
mona.make_withdrawal(20)
mona.make_withdrawal(60)
mona.display_user_balance()

monty.transfer_money(mona,1000)
mona.display_user_balance()
monty.display_user_balance()

