from cmath import e
from tkinter import W
from turtle import update
from django.db import models
import re

# Create your models here.
# Create your models here.
class loginManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
        # add keys and values to errors dictionary for each invalid field
        if len(postData['fName']) <2:
            errors['fName'] ="first name should be at least 2 characters long"
        if len(postData['lName']) <2:
            errors['lName'] ="last name should be at least 2 characters long"
        if not EMAIL_REGEX.match(postData['Email']):
            errors["Email"] = "invalid email address"
        if  postData['password'] != postData['confirm']:
            errors["Confirm"] = "confirm password should be same as password"
        if len(postData['password']) < 8:
            errors["password"] = "Password should be at least 8 characters"
        return errors   

class User(models.Model):
    fName =models.CharField(max_length=255)
    lName = models.CharField(max_length=255)
    Email = models.EmailField(max_length=255)
    password = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = loginManager()

class wishManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        if len(postData['title']) < 3:
            errors["title"] = "wish name should be at least 3 characters"
        if len(postData['title']) == 0:
            errors["title"] = "wish name must be provided"
        if len(postData['des']) < 3:
            errors["des"] = "description must be at least 3 characters"
        if len(postData['des']) == 0:
            errors["des"] = "A description must be provided"
        return errors
class Wish(models.Model):
    Title = models.CharField(max_length=255)
    des = models.CharField(max_length=255)
    granted = models.BooleanField(default=False)
    wishers = models.ManyToManyField(User, related_name="wishes")
    created = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = wishManager()

class granted(models.Model):
