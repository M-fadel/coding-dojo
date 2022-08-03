from multiprocessing import context
from re import T, U
from django.shortcuts import render,redirect
from .models import *
from django.contrib import messages
import bcrypt

# Create your views here.
def index(request):
    return render(request, 'index.html')

def register(request):
    if request.method == 'POST':
        errors = User.objects.basic_validator(request.POST)
        # check if the errors dictionary has anything in it
        if len(errors) > 0:
        # if the errors dictionary contains anything, loop through each key-value pair and make a flash message
            for key, value in errors.items():
                messages.error(request, value)
        # redirect the user back to the form to fix the errors
            return redirect('/')
        else:
            users = User.objects.filter(Email=request.POST['Email'])
            if len(users) == 0:
                password = request.POST.get('password')
                a=User.objects.create(
                    fName= request.POST.get('fName'),
                    lName = request.POST.get('lName'),
                    Email = request.POST.get('Email'),
                    # encrypting password
                    password = bcrypt.hashpw(password.encode('utf8'), bcrypt.gensalt()).decode()
                )
                a.save()
                context={
                    "user": a
                }
                request.session['users'] = a.id
                return redirect('/wishes')
            else:
                messages.error(request, "User already exist!")
                return redirect('/')

def login(request):
    if request.method == 'POST':
        a = User.objects.filter(Email = request.POST['Email'])
        if len(a)==1:
            if not bcrypt.checkpw(request.POST['Password'].encode('utf8'),a[0].password.encode('utf8')):
                messages.error(request, "Email or Password is incorrect!")
                return redirect('/')
            else:
                context = {
                    "user": a[0]
                }
                request.session['users'] = a[0].id
                return redirect('/wishes')
        else:
            messages.error(request, "User dose not exist!")
            return redirect('/')

def logout(request):
    request.session.clear()
    return redirect('/')

def success(request):
    if not 'users' in request.session:
        return redirect('/')
    else:
        u =User.objects.get(id = request.session['users'])
        w = Wish.objects.all()
        a = User.objects.all()
        context = {
            "user": u ,
            "wishes":w ,
            "users": a 
        }
        return render(request, 'board.html', context)

def wish(request):
    u = User.objects.get(id = request.session['users'])
    context = {
        'user': u}
    return render(request, 'wish.html',context)

def addWish(request):
    if request.method == 'POST':
        errors = Wish.objects.basic_validator(request.POST)
        # check if the errors dictionary has anything in it
        if len(errors) > 0:
        # if the errors dictionary contains anything, loop through each key-value pair and make a flash message
            for key, value in errors.items():
                messages.error(request, value)
        # redirect the user back to the form to fix the errors
            return redirect('/wish')
        else:
            u = User.objects.get(id = request.session['users'])
            title = request.POST['title']
            des = request.POST['des']
            w = Wish.objects.create(
                Title  =title ,
                des = des ,
            )   
            w.save()
            
            return redirect ("/wishes")
def remove(request ,number):
    w = Wish.objects.get(id = number)
    w.delete()
    return redirect("/wishes")

def edit(request ,number):
            w = Wish.objects.get(id = number)
            u = User.objects.get(id = request.session['users'])
            context = {
                "wish": w ,
                "user": u
            }
            return render(request,"Edit.html",context)

def update(request ,number):
    if request.method == 'POST':
        errors = Wish.objects.basic_validator(request.POST)
        # check if the errors dictionary has anything in it
        if len(errors) > 0:
        # if the errors dictionary contains anything, loop through each key-value pair and make a flash message
            for key, value in errors.items():
                messages.error(request, value)
        # redirect the user back to the form to fix the errors
            return redirect(f'/edit/{number}')
        else:
            w = Wish.objects.get(id = number)
            w.Title = request.POST['title']
            w.dec = request.POST['des']
            w.save()
            return redirect("/wishes")
def granted(request ,number):
    w = Wish.objects.get(id = number)
    u = User.objects.get(id = request.session['users'])
    w.granted = True
    w.wishers   .add(u)
    w.save()
    return redirect('/wishes')
def like(request ,number):
    w = Wish.objects.get(id = number)
    w.Like +=1
    w.save()
    return redirect("/wishes")

def info(request):

    return render(request, 'info.html')