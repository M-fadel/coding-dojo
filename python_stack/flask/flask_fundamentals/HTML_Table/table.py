from queue import Full
from flask import Flask, render_template
app = Flask(__name__)

users = [
    {'first_name' : 'Michael', 'last_name' : 'Choi'},
    {'first_name' : 'John', 'last_name' : 'Supsupin'},
    {'first_name' : 'Mark', 'last_name' : 'Guillen'},
    {'first_name' : 'KB', 'last_name' : 'Tonel'}
]
l = []
names = []
lengthOfNames =0
for i in users:
        l=list(i.keys())
l.append("full_name")
def iterateDictionary(some_list):
    for dict in some_list:
        names.append (dict.get('first_name'))
        names.append(dict.get('last_name'))
        names.append(dict.get('first_name')+" "+dict.get('last_name'))
    lengthOfNames= int(len(names))
    return lengthOfNames
    
lengthOfNames= iterateDictionary(users)

@app.route('/')
def something():
    
    return render_template("index.html",hhead = l,table =names,tablehead=len(l),tableR =lengthOfNames)






if __name__ == '__main__':
    app.run(debug=True)

print(users)