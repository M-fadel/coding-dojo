from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path('addCourse' , views.addcourse),
    path('deleteCourse/<int:number>', views.deleteCourse),
    path('delete/<int:number>', views.delete)


]   