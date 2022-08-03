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
