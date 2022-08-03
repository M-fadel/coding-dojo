<<<<<<< HEAD
from django.shortcuts import render,redirect
from time import gmtime, strftime



def index(request):
    context = {
        "time": strftime("%Y-%m-%d %H:%M %p", gmtime())
    }
    return render(request,"index.html",context)

def root(request):
    return redirect("/time_display")
    # pass
=======
from django.shortcuts import render,redirect
from time import gmtime, strftime



def index(request):
    context = {
        "time": strftime("%Y-%m-%d %H:%M %p", gmtime())
    }
    return render(request,"index.html",context)

def root(request):
    return redirect("/time_display")
    # pass
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
