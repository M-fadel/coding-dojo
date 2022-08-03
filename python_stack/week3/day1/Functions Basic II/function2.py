def countDown(number):
    s = []
    for i in range(number+1):
        s.append(number-i)
    return s

print(countDown(5))
def printAndReturn(number):
    print(number[0])
    return number[1]

i = [1,2]
# printAndReturn(i)
print(printAndReturn(i))

def FirstPlusLength(x):
    return x[0] + len(x)

temp = [9,8,7,6,5,4,3,2,1]
print(FirstPlusLength(temp))

def ValuesGreaterThanSecond(x):
    temp = []
    for i in range(len(x)):
        if x[i]>x[2]:
            temp.append(x[i])
    return temp
t = [1,2,3,4,5,]
print(ValuesGreaterThanSecond(t))

def ThisLengthThatValue(number1, number2):
    temp = []
    for i in range(number1):
        temp.append(number2)
    return temp

print(ThisLengthThatValue(4,2))