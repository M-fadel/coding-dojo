from cmath import e
from platform import release
from re import A
from venv import create
from django.db import models

class BlogManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        # add keys and values to errors dictionary for each invalid field
        if len(postData['title']) < 2:
            errors["title"] = "Title should be at least 2 characters"
        if len(postData['network']) < 3:
            errors["network"] = "Network should be at least 3 characters"
        if len(postData['des']) < 10:
            errors["des"] = "description should be at least 10 characters"
        return errors

# Create your models here.
class Show (models.Model):
    Title = models.CharField(max_length=255)
    Network = models.CharField(max_length=255)
    releaseDate = models.DateField(auto_now_add=True)
    des = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = BlogManager()
    