from django.urls import path     
from . import views
urlpatterns = [
    path('',views.root),
    path('blogs', views.index),	
    path('blogs/new', views.new),
    path('blogs/create', views.create),
    path('blogs/<str:number>', views.show),
    path('blogs/<str:number>/edit', views.edit),
    path('blogs/<str:number>/de', views.destroy)
]   
