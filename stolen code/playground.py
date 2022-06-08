from distutils.log import debug
from unicodedata import name
from flask import Flask, render_template

app=Flask(__name__)

@app.route('/')
def home():
    return 'Home :)'

@app.route('/play')
def play():
    return render_template('play.html')

@app.route('/play/<num>')
def playTimes(num):
    return render_template('playTimes.html',_num=int(num))

@app.route('/play/<num>/<color>')
def playColor(num,color):
    return render_template('playColor.html',_num=int(num),_color=color)

if __name__=="__main__":
    app.run(debug=True)