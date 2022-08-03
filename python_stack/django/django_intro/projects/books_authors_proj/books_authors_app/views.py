<<<<<<< HEAD
from multiprocessing import context
from re import A
from tkinter import N
from tokenize import Number
from turtle import title
from django.shortcuts import render,redirect
from. models import books,authors

# Create your views here.
def book(request):
    book= books.objects.all()
    context = {
        "book": book,
    }
    return render(request, 'books.html',context)

def addBook(request):
    if request.method == 'POST':
        book = books.objects.create(
            title=request.POST.get('title'),
            desc = request.POST.get('des')
            )
    return redirect("/")

def bookView(request,number):
    book = books.objects.get(id=number)
    author = books.objects.get(id= number).author.all()
    allAuthors= authors.objects.all()
    context = {
        "book": book,
        "author": author,
        "allAuthors":allAuthors
    }
    return render(request, 'booksView.html',context)

def bookToAuthor(request):
    if request.method == 'POST':
        temp =[]
        temp = request.POST.get('authors').split(',')
        auth = authors.objects.get(id=temp[0])
        book =books.objects.get(id=temp[1])
        auth.book.add(book)
        auth.save()
    return redirect("/")

def author(request):
    auth= authors.objects.all()
    context = {
        "auth": auth,
    }
    return render(request, 'authors.html',context)

def addAuthor(request):
    if request.method == 'POST':
        auth = authors.objects.create(
            fName=request.POST.get('fName'),
            lName = request.POST.get('lName'),
            notes = request.POST.get('note')
            )
    return redirect("/author")

def authorView(request,number):
    author = authors.objects.get(id=number)
    book = authors.objects.get(id=number).book.all()
    allBooks = books.objects.all()
    context = {
        "book": book,
        "author": author,
        "allBooks": allBooks
    }
=======
from multiprocessing import context
from re import A
from tkinter import N
from tokenize import Number
from turtle import title
from django.shortcuts import render,redirect
from. models import books,authors

# Create your views here.
def book(request):
    book= books.objects.all()
    context = {
        "book": book,
    }
    return render(request, 'books.html',context)

def addBook(request):
    if request.method == 'POST':
        book = books.objects.create(
            title=request.POST.get('title'),
            desc = request.POST.get('des')
            )
    return redirect("/")

def bookView(request,number):
    book = books.objects.get(id=number)
    author = books.objects.get(id= number).author.all()
    allAuthors= authors.objects.all()
    context = {
        "book": book,
        "author": author,
        "allAuthors":allAuthors
    }
    return render(request, 'booksView.html',context)

def bookToAuthor(request):
    if request.method == 'POST':
        temp =[]
        temp = request.POST.get('authors').split(',')
        auth = authors.objects.get(id=temp[0])
        book =books.objects.get(id=temp[1])
        auth.book.add(book)
        auth.save()
    return redirect("/")

def author(request):
    auth= authors.objects.all()
    context = {
        "auth": auth,
    }
    return render(request, 'authors.html',context)

def addAuthor(request):
    if request.method == 'POST':
        auth = authors.objects.create(
            fName=request.POST.get('fName'),
            lName = request.POST.get('lName'),
            notes = request.POST.get('note')
            )
    return redirect("/author")

def authorView(request,number):
    author = authors.objects.get(id=number)
    book = authors.objects.get(id=number).book.all()
    allBooks = books.objects.all()
    context = {
        "book": book,
        "author": author,
        "allBooks": allBooks
    }
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
    return render(request, 'authorsView.html',context)