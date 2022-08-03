<<<<<<< HEAD
from django.shortcuts import render,redirect
import random
# Create your views here.
def index(request):

    if request.method == "GET":
        request.session['random'] =  int(random.random()*100)
        if 'guess' in request.session:
            print('key exists!')
        else:
            print("key 'counter' does NOT exist")
            request.session['guess']=0
        
        print("a GET request is being made to this route")
        return render(request, "index.html")
        
    if request.method == "POST":
        print("a POST request is being made to this route")
        request.session['guess'] = request.POST['guess']

        request.session['answer'] =compair(request.session['guess'], request.session['random'])
        print(request.session['answer'])
        return render(request,'index.html')

def compair(number1, number2):
    if number1 is number2:
        return 1
    elif int(number1) >int(number2) :
        return 2
    elif int(number1)<int(number2):
        return 0
    else: 
        print(number2,number1)
        return 1
def delete(request):
    del request.session['guess']
    del request.session['random']
    del request.session['answer']
=======
from django.shortcuts import render,redirect
import random
# Create your views here.
def index(request):

    if request.method == "GET":
        request.session['random'] =  int(random.random()*100)
        if 'guess' in request.session:
            print('key exists!')
        else:
            print("key 'counter' does NOT exist")
            request.session['guess']=0
        
        print("a GET request is being made to this route")
        return render(request, "index.html")
        
    if request.method == "POST":
        print("a POST request is being made to this route")
        request.session['guess'] = request.POST['guess']

        request.session['answer'] =compair(request.session['guess'], request.session['random'])
        print(request.session['answer'])
        return render(request,'index.html')

def compair(number1, number2):
    if number1 is number2:
        return 1
    elif int(number1) >int(number2) :
        return 2
    elif int(number1)<int(number2):
        return 0
    else: 
        print(number2,number1)
        return 1
def delete(request):
    del request.session['guess']
    del request.session['random']
    del request.session['answer']
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
    return redirect('/')