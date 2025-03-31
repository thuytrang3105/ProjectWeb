import json,os

from SaleApp import app

def read_json(path):
    with open(path,'r') as f:
        return  json.load(f)

def load_categories():
    return read_json(os.path.join(app.root_path,'data/categories.json'))

def load_products(cate_id=None, kw=None, from_price=None, to_price=None):
    product=read_json(os.path.join(app.root_path,'data/products.json'))

    if cate_id:
         product= [p for p in product if p["category_id"]==int(cate_id) ]

    if from_price:
         product= [p for p in product if p["price"]>=int(from_price) ]

    if to_price:
        product = [p for p in product if p["price"] >= int(to_price)]

    if kw:
         product= [p for p in product if p["name"].lower().find(kw.lower()) >=0 ]

    return product

def get_product_by_id(product_id):
    product = read_json(os.path.join(app.root_path, 'data/products.json'))
    for p in product:
        if p['id']== product_id:
            return p

