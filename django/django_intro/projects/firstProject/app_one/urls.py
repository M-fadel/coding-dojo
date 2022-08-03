<<<<<<< HEAD
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),	
    path('/new', views.new),
    path('/create', views.create),
    path('/<str:number>', views.show),
    path('/<str:number>/edit', views.edit),
    path('/<str:number>/de', views.destroy)
]   
=======
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),	
    path('/new', views.new),
    path('/create', views.create),
    path('/<str:number>', views.show),
    path('/<str:number>/edit', views.edit),
    path('/<str:number>/de', views.destroy)
]   
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
