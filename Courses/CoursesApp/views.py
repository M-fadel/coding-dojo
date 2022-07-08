from contextlib import redirect_stderr
from multiprocessing import context
import re
from django.shortcuts import render,redirect
from django.contrib import messages
from .models import courses

# Create your views here.
def index(request):
    a = courses.objects.all()
    context = {'a': a}
    return render(request, 'index.html' ,context)


def addcourse(request):
    if request.method == 'POST':
        errors = courses.objects.basic_validator(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect('/')
        else:
            name = request.POST['CName']
            des = request.POST['description']
            a = courses.objects.create(CName=name, Des = des)
            a.save()
            return redirect('/')
def deleteCourse(request,number):
    a = courses.objects.get(id= number)
    context = {'a' : a}
    return render(request, 'delete.html', context)

def delete(request,number):
    a = courses.objects.get(id = number)
    a.delete()
    return redirect('/')
