from calendar import c
from contextlib import redirect_stderr
from multiprocessing import context
import numbers
import re
from this import d
from django.shortcuts import redirect, render
from .models import Show
from django.contrib import messages

# Create your views here.
def index(request):
    show = Show.objects.all()
    context = {"show": show}
    return render(request, 'index.html',context)

def new(request):
        
    return render(request, 'addShows.html')

def read(request,number = 0):
    if request.method == 'POST':
        errors = Show.objects.basic_validator(request.POST)
            # check if the errors dictionary has anything in it
        if len(errors) > 0:
            # if the errors dictionary contains anything, loop through each key-value pair and make a flash message
            for key, value in errors.items():
                messages.error(request, value)
            # redirect the user back to the form to fix the errors
            return redirect('/shows/new')
        else:
            a = Show.objects.create(
            Title=request.POST.get('title'),
            Network = request.POST.get('network'),
            releaseDate = request.POST.get('Date'),
            des = request.POST.get('des')
        )
            context={
            "show": a
            }
            a.save()
            return render(request, 'read.html',context)
    elif request.method == 'GET':
        a= Show.objects.get(id= number)
        context={
            "show": a
        }
        return render(request, 'read.html',context)


def dell(request,number):
    a = Show.objects.get(id= number)
    a.delete()
    
    return redirect("/shows")

def edit(request,number):
    if request.method == 'POST':
        errors = Show.objects.basic_validator(request.POST)
        # check if the errors dictionary has anything in it
        if len(errors) > 0:
        # if the errors dictionary contains anything, loop through each key-value pair and make a flash message
            for key, value in errors.items():
                messages.error(request, value)
        # redirect the user back to the form to fix the errors
            return redirect('/shows/edit/'+str(number))
        else:
            a = Show.objects.get(id= number)
            a.Title=request.POST.get('title')
            a.Network = request.POST.get('network')
            a.releaseDate = request.POST.get('date')
            a.des = request.POST.get('des')
            a.save()
            context={
            "show": a
            }
            return render(request, 'read.html',context)
    if request.method == 'GET':
        a= Show.objects.get(id= number)
        context={
            "show": a
        }
        return render(request, 'editShow.html',context)
