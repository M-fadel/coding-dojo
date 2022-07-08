from cmath import e
from distutils import errors
from django.db import models

# Create your models here.

class CourseManager(models.Manager):
    def basic_validator(self, postData):
        errors= {}
        if len(postData['CName']) <=5:
            errors['CName'] = "name must be at more than 5 characters"
        if len(postData['description']) <=15:
            errors['description'] = "name must be at more than 15 characters"
        return errors
class courses(models.Model):
    CName = models.CharField(max_length=255)
    Des = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    objects = CourseManager()


