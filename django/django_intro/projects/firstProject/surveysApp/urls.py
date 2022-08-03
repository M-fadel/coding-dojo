<<<<<<< HEAD
from django.urls import path,include
from . import views

urlpatterns = [
    path('', views.index),
    path('/new', views.new)
=======
from django.urls import path,include
from . import views

urlpatterns = [
    path('', views.index),
    path('/new', views.new)
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
]