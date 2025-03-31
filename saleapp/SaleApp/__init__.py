from flask import Flask
from flask_sqlalchemy import SQLAlchemy

app=Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI']='mysql+pymysql://root:12345678@localhost/labsaledb?charset=utf8mb4'
app.config['SQLALCHEMY_STRACK_MODIFICATIONS']=True

db=SQLAlchemy(app=app)