<<<<<<< HEAD
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path ('/new', views.new),
    path ('/read' , views.read),
    path ('/read/<int:number>', views.read),
    path ('/delete/<int:number>', views.dell),
    path ('/edit/<str:number>' , views.edit)

=======
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path ('/new', views.new),
    path ('/read' , views.read),
    path ('/read/<int:number>', views.read),
    path ('/delete/<int:number>', views.dell),
    path ('/edit/<str:number>' , views.edit)

>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
]   