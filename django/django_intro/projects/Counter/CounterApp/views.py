
from django.shortcuts import render,redirect

# Create your views here.
def index(request):
    
    
    if request.method == "GET":
        # request.session['counter'] 
        if 'counter' in request.session:
            print('key exists!')
            request.session['counter']+=1
        else:
            print("key 'counter' does NOT exist")
            request.session['counter']=0


        print("a GET request is being made to this route")
        
        return render(request, "index.html")
        
    if request.method == "POST":
        # request.session['name'] = 
        print("a POST request is being made to this route")
        
        return render(request,'index.html')

def delete(request):
    del request.session['counter']	# clears a specific key
    return redirect('/')
