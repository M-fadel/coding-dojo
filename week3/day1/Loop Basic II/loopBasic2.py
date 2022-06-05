from operator import le
from tempfile import tempdir
from tkinter.tix import INTEGER


temp = [-3,-2,-1,0,1,2,3]
def BiggieSize(x):
    for i in range(len(x)):
        if x[i] >0:
            x[i]="big"
    return x
            
BiggieSize(temp)
print(temp)

temp = [-3,-2,-1,1,1,2,2]
def CountPositives(x):
    count =0
    for i in range(len(x)):
        if x[i] > 0:
            count=count+1
    x[len(x)-1]=count
    return x
CountPositives(temp)
print(temp)

def SumTotal(x):
    sum = 0
    for i in range(len(x)):
        sum = sum+x[i]
    return sum

temp = [1,2,3,4]
sum = SumTotal(temp)
print(sum)
def average(x):
    avr =SumTotal(x)/len(x)
    return avr
print(average(temp))

def length(x):
    return len(x)
print(length(temp))

def minimum(x):
    minimum = x[0]
    for i in range(len(x)):
        if x[i] <minimum:
            minimum = x[i]
    return minimum

print(minimum(temp))

def maximum(x):
    max = x[0]
    for i in range(len(x)):
        if x[i]>max:
            max = x[i]
    return max
print(maximum(temp))
def analysis(x):
    print("sum total:",SumTotal(x),"average:",average(x),"minimum:",minimum(x),"maximum:",maximum(x),"length:",length(x))

analysis(temp)

def Reverse(x):
    temp = 0
    for i in range(int(len(x)/2)):
        temp = x[i]
        x[i] =x[len(x)-i-1]
        x[len(x)-i-1] =temp
    return x

print(Reverse(temp))
