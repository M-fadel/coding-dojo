from user import User
from bankAccount import BankAccount

guido = User("guido", "123@gmail.com",BankAccount())
guido.make_deposit(100)
guido.display_user_balance()