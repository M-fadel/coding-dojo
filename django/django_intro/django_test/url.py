from django.urls import path    ,include 
from . import views
urlpatterns = [
    path('',include ('CoursesApp.urls')),
    path('', views.root),
    
]
