from flask import Flask, render_template, request, flash
from flask_sqlalchemy import SQLAlchemy


app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///patients.sqlite3'
db = SQLAlchemy(app)


class Patients(db.Model):
    _id = db.Column("id", db.Integer, primary_key=True)
    name = db.Column(db.String(80))
    age = db.Column(db.String(4))
    blood = db.Column(db.String(3))
    weight = db.Column(db.String(4))
    fever = db.Column(db.String(3))
    temp = db.Column(db.String(3))
    days = db.Column(db.String(4))
    headache = db.Column(db.String(3))
    muscleache = db.Column(db.String(3))
    diarrhea = db.Column(db.String(3))
    weightloss = db.Column(db.String(3))
    stomachache = db.Column(db.String(3))
    rash = db.Column(db.String(3))
    travel = db.Column(db.String(3))
    tongue = db.Column(db.String(3))
    condition = db.Column(db.String(20))
    respiration = db.Column(db.String(20))


    def __init__(self, name, age, blood, weight, fever, temp, days,
                    headache, muscleache, diarrhea,
                    weightloss, stomachache, rash, travel,
                    tongue, condition, respiration):


        self.name = name
        self.age = age
        self.blood = blood
        self.weight = weight
        self.fever = fever
        self.temp = temp
        self.days = days
        self.headache = headache
        self.muscleache = muscleache
        self.diarrhea = diarrhea
        self.weightloss = weightloss
        self.stomachache = stomachache
        self.rash = rash
        self.travel = travel
        self.tongue = tongue
        self.condition = condition
        self.respiration = respiration

db.create_all()

@app.route("/")
def index():
    return render_template("index.html")


@app.route("/get_data", methods=["POST"])
def get_data():
    patient = Patients(request.form.get("name"), request.form.get("age"), request.form.get("blood"), request.form.get("weight"),
                        request.form.get("fever"), request.form.get("temp"), request.form.get("days"),
                        request.form.get("headache"), request.form.get("muscleache"),
                        request.form.get("diarrhea"), request.form.get("weightloss"),
                        request.form.get("stomachache"), request.form.get("rash"), request.form.get("travel"),
                        request.form.get("tongue"), request.form.get("condition"), request.form.get("respiration"))

    db.session.add(patient)
    db.session.commit()

    return render_template('success.html')


if __name__ == "__main__":
    app.run()
