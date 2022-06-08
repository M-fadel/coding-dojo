from flask import Flask
app = Flask(__name__)
@app.route('/')
def hello_world():
    return "hello world"
@app.route('/dojo')
def Dojo():
    return "Dojo"

@app.route('/say/<name>') 
def hello(name):
    return "Hi " + name

@app.route('/repeat/<number>/<word>')
def repeat(number, word):
    temp =""
    for i in range(int(number)):
        temp +=word+" "
    return temp


if __name__ == '__main__':
    app.run(debug=True)
