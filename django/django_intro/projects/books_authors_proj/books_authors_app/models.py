from calendar import c
from pyexpat import model
from re import M
from turtle import update
from django.db import models

# Create your models here.
class books(models.Model):
    title=models.CharField(max_length=255)
    desc=models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

class authors(models.Model):
    fName=models.CharField(max_length=45)
    lName=models.CharField(max_length=45)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    book=models.ManyToManyField(books, related_name="author")
    notes= models.TextField()