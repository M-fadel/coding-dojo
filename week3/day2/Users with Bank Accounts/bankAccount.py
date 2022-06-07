class BankAccount:
    def __init__(self, int_rate = 0.1, balance = 0):
        self.balance =balance
        self.int_rate = int_rate
        
    
    def deposit(self, amount):
        self.balance += amount
        return self
    
    def withdraw(self, amount):
        if amount>self.balance:
            print( "Insufficient funds: Charging a $5 fee" )
            self.balance -=5
            return self
        else:
            self.balance -= amount
            return self

    def display_account_info(self):
        print("balance: ",self.balance)
        return self
        

    def yield_interest(self):
        if self.balance>0:
            self.balance = self.balance * self.int_rate
            return self

# acc1 = BankAccount(5,1000)
# acc1.deposit(10).deposit(10).deposit(10).withdraw(1000).yield_interest().display_account_info()
# acc2 = BankAccount(0.1,500).deposit(10).deposit(10).withdraw(100).withdraw(100).withdraw(100).withdraw(100).yield_interest().display_account_info()
