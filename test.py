class User:
    def __init__(self, name, amount):  # now our method has 2 parameters!
        self.name = name            # and we use the values passed in to set the name attribute
        self.account_balance = amount

    def make_withdrawal(self, amount):
        self.account_balance -= amount
        return self

    def make_deposit(self, amount):
        self.account_balance += amount
        return self

    def display_user_balance(self):
        print(self.name, ", Balance: $", self.account_balance)

    def transfer_money(self, other_user, amount):
        pass
        #return self

u1 = User("esraa", 500)
u1.make_deposit(20).make_deposit(16).make_deposit(6).make_withdrawal(10)

u1.display_user_balance
u2 = User("reem", 150)
u2.make_deposit(20).make_deposit(16).make_withdrawal(32).make_withdrawal(40)
u2.display_user_balance

u3 = User("michael", 1000)

u3.make_deposit(5000).make_withdrawal(3000).make_withdrawal(500).make_withdrawal(122)
u3.display_user_balance