class User:		# here's what we have so far
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account_balance = 0

    def make_deposit(self, amount):
        self.account_balance += amount
        return self

    def make_withdrawal(self, amount):
        self.account_balance -= amount
        return self

    def display_user_balance(self):
        print(self.account_balance)
        return self

    def transfer_money(self, other_user, amount):
        self.make_withdrawal(amount)
        other_user.make_deposit(amount)
        return self


guido = User("guido", "123@gmail.com")
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

monty.transfer_money(mona, 1000)
mona.display_user_balance()
monty.display_user_balance()

guido.make_deposit(100).make_deposit(200).make_deposit(300).make_withdrawal(50).display_user_balance()

