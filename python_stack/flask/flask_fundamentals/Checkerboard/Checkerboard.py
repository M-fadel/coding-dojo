from operator import index
from flask import Flask, render_template
app = Flask(__name__)
@app.route("/") 
@app.route("/<x>")
@app.route("/<x>/<y>")
def checkB(x =8,y =8):
    return render_template("index.html", y =int(y), x=int(x))

if __name__ == '__main__':
    app.run(debug=True)