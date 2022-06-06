class BankAccount:
    def __init__(self, int_rate = 0.1, balance = 0):
        self.balance =balance
        self.int_rate = int_rate
        
    
    def deposit(self, amount):
        self.balance += amount
    
    def withdraw(self, amount):
        if amount>self.balance:
            print( "Insufficient funds: Charging a $5 fee" )
            self.balance -=5
        else:
            self.balance -= amount

    def display_account_info(self):
        print("balance: ",self.balance)
        

    def yield_interest(self):
        if self.balance>0:
            self.balance = self.balance * self.int_rate

acc1 = BankAccount(5,1000)
acc1.deposit(10)
acc1.withdraw(5)
acc1.display_account_info()
acc1.yield_interest()
acc1.display_account_info()