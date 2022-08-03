from django.shortcuts import render,redirect
from .models import *
# Create your views here.
def index(request):
    Dojo = dojo.objects.all()
    Ninja = ninja.objects.all()
    context ={
        'i':Dojo,
        'z':Ninja
    }
    return render(request,'index.html',context)

def createDojo(request):
    if request.method == 'POST':
        newDojo = dojo.objects.create(
            name=request.POST['name'],
            city=request.POST['city'],
            state=request.POST['state']
        )
        newDojo.save()
    return redirect('/')

def createNinja(request):
    if request.method == 'POST':
        
        print("---------------------------------------------------------------------------------------")
        Dojo =dojo.objects.get(name = request.POST['Dojo'])
        print(Dojo)
        newNinja = ninja.objects.create(
            dojo = Dojo,
            fName=request.POST['fName'],
            lName=request.POST['lName']
        )
        newNinja.save()
    return redirect('/')