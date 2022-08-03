from ast import Return
from django.shortcuts import render,HttpResponse,redirect
# Create your views here.
def index(request):
    return render(request, 'index.html')

def show(request):
    if request.method == "GET":
        print("a GET request is being made to this route")
        # val_from_field_two = request.POST["two"]
        return render(request, "index.html")
        
    if request.method == "POST":
        
        print("a POST request is being made to this route")
        # context={

        # val_from_field_one
        name = request.POST['name']
        city = request.POST['city']
        job = request.POST['job']
        Comments = request.POST['Comments']
        context ={
            "name":name,
            "city":city,
            "job":job,
            "Comments":Comments
        }
        # }
        # val_from_field_two = request.POST["4"]
        # return redirect("/results")
        return render(request, "result.html",context)

