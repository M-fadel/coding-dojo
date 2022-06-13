from django.urls import path,include
from . import views

urlpatterns = [
    path('',include("app_one.urls")),
    path('users', views.users),
    path('login', views.login),
    path('register',views.index),
    path('users/new', views.index),
]