<<<<<<< HEAD
from django.db import models

# Create your models here.
class dojo(models.Model):
    name = models.CharField(max_length=255)
    city = models.CharField(max_length=255)
    state = models.CharField(max_length=2)
    desc = models.TextField()

class ninja(models.Model):
    dojo = models.ForeignKey(dojo, related_name="ninjas", on_delete = models.CASCADE)
    fName = models.CharField(max_length=255)
    lName= models.CharField(max_length=255)
=======
from django.db import models

# Create your models here.
class dojo(models.Model):
    name = models.CharField(max_length=255)
    city = models.CharField(max_length=255)
    state = models.CharField(max_length=2)
    desc = models.TextField()

class ninja(models.Model):
    dojo = models.ForeignKey(dojo, related_name="ninjas", on_delete = models.CASCADE)
    fName = models.CharField(max_length=255)
    lName= models.CharField(max_length=255)
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
    pass