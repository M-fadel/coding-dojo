from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path ('register', views.register),
    path ('login', views.login),
    path ('logout', views.logout),
    path('wishes', views.success),
    path ('wish', views.wish),
    path('addWish' , views.addWish),
    path ('remove/<int:number>', views.remove),
    path('edit/<int:number>', views.edit),
    path ('update/<int:number>', views.update),
    path ('granted/<int:number>', views.granted),
    path ('like/<int:number>', views.like),
    path ('info' , views.info),

]   