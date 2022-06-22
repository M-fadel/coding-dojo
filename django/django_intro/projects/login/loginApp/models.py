from django.db import models
import re

# Create your models here.
class BlogManager(models.Manager):
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
    fName = models.CharField(max_length=255)
    lName = models.CharField(max_length=255)
    Email = models.EmailField(max_length=255)
    password = models.CharField(max_length=255)
    objects = BlogManager()

