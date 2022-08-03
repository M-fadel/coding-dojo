<<<<<<< HEAD
from multiprocessing import context
from re import U
from django.shortcuts import render,redirect
from .models import User,Book
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
                return redirect('/success')
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
                return redirect('/success')
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
        a =User.objects.get(id = request.session['users'])
        book = Book.objects.all()
        
        context = {'user':a,
        'book':book}
        return render(request, 'success.html', context)

def addBook(request):
    if request.method == 'POST':
        if request.method == 'POST':
            errors = Book.objects.basic_validator(request.POST)
            if len(errors) > 0:
                for key, value in errors.items():
                    messages.error(request, value)
                return redirect('/success')

        title = request.POST.get('title')
        dec = request.POST.get('dec')
        usr= User.objects.get(id =request.session['users'])
        book = Book.objects.create(title=title,dec = dec)
        book.users.add(usr)
        book.save()
        return redirect('/success')

def favorite(request ,number):
    b = Book.objects.get(id = number)
    u = User.objects.get(id = request.session['users'])
    b.users.add(u)
    return redirect('/success')

def info(request ,number):
    b = Book.objects.get(id = number)
    u = User.objects.get(id = request.session['users'])
    context = {
        "user": u,
        'book': b,
    }
    return render(request, 'info.html',context)

def update (request):
    if request.method == 'POST':
        if request.method == 'POST':
            errors = Book.objects.basic_validator(request.POST)
            if len(errors) > 0:
                for key, value in errors.items():
                    messages.error(request, value)
                    ID = request.POST['id']
                return redirect(f'/info/{ID}')

            if request.POST['button'] == 'update':
                ID = request.POST['id']
                t = request.POST['title']
                d = request.POST['dec']
                u = Book.objects.get(id = ID)
                u.title = t
                u.dec = d
                u.save()
                return redirect('/success')
            elif request.POST['button'] == 'delete':
                ID = request.POST['id']
                u = Book.objects.get(id = ID)
                u.delete()
                return redirect('/success')

def unfavorite(request ,number):
    b = Book.objects.get(id = number)
    u = User.objects.get(id = request.session['users'])
    b.users.remove(u)
=======
from multiprocessing import context
from re import U
from django.shortcuts import render,redirect
from .models import User,Book
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
                return redirect('/success')
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
                return redirect('/success')
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
        a =User.objects.get(id = request.session['users'])
        book = Book.objects.all()
        
        context = {'user':a,
        'book':book}
        return render(request, 'success.html', context)

def addBook(request):
    if request.method == 'POST':
        if request.method == 'POST':
            errors = Book.objects.basic_validator(request.POST)
            if len(errors) > 0:
                for key, value in errors.items():
                    messages.error(request, value)
                return redirect('/success')

        title = request.POST.get('title')
        dec = request.POST.get('dec')
        usr= User.objects.get(id =request.session['users'])
        book = Book.objects.create(title=title,dec = dec)
        book.users.add(usr)
        book.save()
        return redirect('/success')

def favorite(request ,number):
    b = Book.objects.get(id = number)
    u = User.objects.get(id = request.session['users'])
    b.users.add(u)
    return redirect('/success')

def info(request ,number):
    b = Book.objects.get(id = number)
    u = User.objects.get(id = request.session['users'])
    context = {
        "user": u,
        'book': b,
    }
    return render(request, 'info.html',context)

def update (request):
    if request.method == 'POST':
        if request.method == 'POST':
            errors = Book.objects.basic_validator(request.POST)
            if len(errors) > 0:
                for key, value in errors.items():
                    messages.error(request, value)
                    ID = request.POST['id']
                return redirect(f'/info/{ID}')

            if request.POST['button'] == 'update':
                ID = request.POST['id']
                t = request.POST['title']
                d = request.POST['dec']
                u = Book.objects.get(id = ID)
                u.title = t
                u.dec = d
                u.save()
                return redirect('/success')
            elif request.POST['button'] == 'delete':
                ID = request.POST['id']
                u = Book.objects.get(id = ID)
                u.delete()
                return redirect('/success')

def unfavorite(request ,number):
    b = Book.objects.get(id = number)
    u = User.objects.get(id = request.session['users'])
    b.users.remove(u)
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
    return redirect('/success')