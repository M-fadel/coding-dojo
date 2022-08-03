<<<<<<< HEAD
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    

=======
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path('results', views.show)

>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
]   