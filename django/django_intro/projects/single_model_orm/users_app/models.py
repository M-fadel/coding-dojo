<<<<<<< HEAD
from django.db import models

# Create your models here.
class users(models.Model):
    first_name= models.CharField(max_length=255)
    last_name= models.CharField(max_length=255)
    email_address= models.CharField(max_length=255)
    age= models.IntegerField()
    create_at= models.DateTimeField(auto_now_add=True)
    updated_at= models.DateTimeField(auto_now=True)
=======
from django.db import models

# Create your models here.
class users(models.Model):
    first_name= models.CharField(max_length=255)
    last_name= models.CharField(max_length=255)
    email_address= models.CharField(max_length=255)
    age= models.IntegerField()
    create_at= models.DateTimeField(auto_now_add=True)
    updated_at= models.DateTimeField(auto_now=True)
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
