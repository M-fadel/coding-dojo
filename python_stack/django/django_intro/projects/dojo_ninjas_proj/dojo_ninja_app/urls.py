<<<<<<< HEAD
from django.urls import path
from . import views	# the . indicates that the views file can be found in the same directory as this file
                    
urlpatterns = [
    path('', views.index),
    path('createDojo', views.createDojo),
    path('createNinja', views.createNinja),
]
=======
from django.urls import path
from . import views	# the . indicates that the views file can be found in the same directory as this file
                    
urlpatterns = [
    path('', views.index),
    path('createDojo', views.createDojo),
    path('createNinja', views.createNinja),
]
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
