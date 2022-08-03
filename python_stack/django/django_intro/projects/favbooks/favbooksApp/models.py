<<<<<<< HEAD
from turtle import update
from django.db import models
import re

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

class bookManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        if len(postData['title'])==0:
            errors["title"] = "title should not be empty"
        if len(postData['dec'])<5:
            errors['dec'] = "should be at least 5 characters long"
        return errors


class User(models.Model):
    fName = models.CharField(max_length=255)
    lName = models.CharField(max_length=255)
    Email = models.EmailField(max_length=255)
    password = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = loginManager()

class Book(models.Model):
    title = models.CharField(max_length=255)
    dec = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    users = models.ManyToManyField(User, related_name="publishers")
    objects = bookManager()
# uploaded_by = user who uploaded a given book
# users_who_like = a list of users who like a given book

=======
from turtle import update
from django.db import models
import re

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

class bookManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        if len(postData['title'])==0:
            errors["title"] = "title should not be empty"
        if len(postData['dec'])<5:
            errors['dec'] = "should be at least 5 characters long"
        return errors


class User(models.Model):
    fName = models.CharField(max_length=255)
    lName = models.CharField(max_length=255)
    Email = models.EmailField(max_length=255)
    password = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = loginManager()

class Book(models.Model):
    title = models.CharField(max_length=255)
    dec = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    users = models.ManyToManyField(User, related_name="publishers")
    objects = bookManager()
# uploaded_by = user who uploaded a given book
# users_who_like = a list of users who like a given book

>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
