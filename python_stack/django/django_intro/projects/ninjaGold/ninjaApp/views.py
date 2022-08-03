<<<<<<< HEAD
from tkinter import N
from django.shortcuts import render, HttpResponse,redirect
import random
from time import gmtime, strftime
# Create your views here.

# log =[]
def index(request):
    if request.method == 'GET':
        if 'yourGold' in request.session:
            print('key exists!')
        else:
            print("key 'key_name' does NOT exist")
            request.session['yourGold']=0
            if 'logg' in request.session:
                print('log exists')
            else:
                request.session['logg']=[]
        return render(request, 'index.html')
    elif request.method == 'POST':

        return render(request, 'index.html')

def addGold(request):
    amount =_random(10,20)
    
    request.session['yourGold']+= amount
    _log(request,amount)
    print (request.session['logg'])
    return redirect("/")

def gamble(request):
    amount = _random(-50,50)
    request.session['yourGold']+=amount
    _log(request,amount)
    return redirect('/')
def _random(number1,number2):
    return random.randint(number1,number2)

def _log(request ,amount):
    time =strftime("%Y-%m-%d %H:%M %p", gmtime())
    if request.POST['quest'] == "farm":
        request.session['logg'].append(f"you Entered a farm and gained {amount} gold. {time}\n")
        
    elif request.POST['quest']== "cave":
        request.session['logg'].append(f"you Entered a cave and gained {amount} gold. {time}\n")

    elif request.POST['quest']== "house":
        request.session['logg'].append(f"you Entered a house and gained {amount} gold. {time}\n")

    elif request.POST['quest']== "gamble":
        if amount>0:
            request.session['logg'].append(f"you completed a quest and gained {amount} gold. {time}\n")

        else :
            request.session['logg'].append(f"you failed a quest and lost {amount} gold. {time}\n")
=======
from tkinter import N
from django.shortcuts import render, HttpResponse,redirect
import random
from time import gmtime, strftime
# Create your views here.

# log =[]
def index(request):
    if request.method == 'GET':
        if 'yourGold' in request.session:
            print('key exists!')
        else:
            print("key 'key_name' does NOT exist")
            request.session['yourGold']=0
            if 'logg' in request.session:
                print('log exists')
            else:
                request.session['logg']=[]
        return render(request, 'index.html')
    elif request.method == 'POST':

        return render(request, 'index.html')

def addGold(request):
    # del request.session['yourGold']
    # del request.session['logg']
    amount =_random(10,20)
    
    request.session['yourGold']+= amount
    _log(request,amount)
    print (request.session['logg'])
    return redirect("/")

def gamble(request):
    amount = _random(-50,50)
    request.session['yourGold']+=amount
    _log(request,amount)
    return redirect('/')
def _random(number1,number2):
    return random.randint(number1,number2)

def _log(request ,amount):
    time =strftime("%Y-%m-%d %H:%M %p", gmtime())
    if request.POST['quest'] == "farm":
        request.session['logg'].append(f"you Entered a farm and gained {amount} gold. {time}\n")
        
    elif request.POST['quest']== "cave":
        request.session['logg'].append(f"you Entered a cave and gained {amount} gold. {time}\n")

    elif request.POST['quest']== "house":
        request.session['logg'].append(f"you Entered a house and gained {amount} gold. {time}\n")

    elif request.POST['quest']== "gamble":
        if amount>0:
            request.session['logg'].append(f"you completed a quest and gained {amount} gold. {time}\n")

        else :
            request.session['logg'].append(f"you failed a quest and lost {amount} gold. {time}\n")
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
