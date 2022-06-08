from flask import Flask, render_template
app = Flask(__name__)
@app.route("/play")
@app.route("/play/<number>")
@app.route("/play/<number>/<color>")
def play2(number = 3, color= "blue"):
    return render_template("index.html",times = int(number) ,Bcolor =color)
if __name__ == "__main__":
    app.run(debug=True)