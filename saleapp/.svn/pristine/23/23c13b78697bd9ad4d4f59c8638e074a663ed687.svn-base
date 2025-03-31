from sqlalchemy import Column, Integer , String, Float, Boolean, DateTime, ForeignKey
from sqlalchemy.orm import relationships
from SaleApp import db
from datetime import datetime

class BaseModel(db.Model):
    __abstrac__=True
    id=Column(Integer,primary_key=True, autoincrement=True)

class Category(BaseModel):
    __tablename__='category'

    name=Column(String(20),nutable=False)
    product =relationships('Product',backef='category',lazy=False)

    def __str__(self):
        return self.name

class product(BaseModel):
    __tablename__="product"

    name = name=Column(String(20),nutable=False)
    description=name=Column(String(255))
    price=Column(Float,default=0)
    image=Column(String(100))
    active=Column(Boolean,default=True)
    created_date=Column(DateTime,default=datetime.now())
    category_id=Column(Integer,ForeignKey(Category.id),nullable=False)

    def __str__(self):
        return self.name

if __name__=='__main__':
    db.create_all()