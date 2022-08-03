<<<<<<< HEAD
from django.urls import path,include
from . import views

urlpatterns = [
    path('',include("app_one.urls")),
    path('users', views.users),
    path('login', views.login),
    path('register',views.index),
    path('users/new', views.index),
=======
from django.urls import path,include
from . import views

urlpatterns = [
    path('',include("app_one.urls")),
    path('users', views.users),
    path('login', views.login),
    path('register',views.index),
    path('users/new', views.index),
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
]