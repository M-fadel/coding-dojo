<<<<<<< HEAD
from django.shortcuts import render, HttpResponse,redirect
def index(request):
    return HttpResponse("placeholder to later display a list of all blogs")
def new(request):
    return HttpResponse("placeholder to display a new form to create a new blog")
def create(request):
    return redirect('/blogs')    
def show(request,number):
    return HttpResponse("placeholder to display blog number "+ number)
def edit(request,number):
    return HttpResponse("placeholder to edit blog number "+ number)
def destroy(request,number):
=======
from django.shortcuts import render, HttpResponse,redirect
def index(request):
    return HttpResponse("placeholder to later display a list of all blogs")
def new(request):
    return HttpResponse("placeholder to display a new form to create a new blog")
def create(request):
    return redirect('/blogs')    
def show(request,number):
    return HttpResponse("placeholder to display blog number "+ number)
def edit(request,number):
    return HttpResponse("placeholder to edit blog number "+ number)
def destroy(request,number):
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
    return redirect("/blogs")