<<<<<<< HEAD
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path ('register', views.register),
    path ('login', views.login),
    path ('logout', views.logout),
    path('success', views.success),
]   
=======
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path ('register', views.register),
    path ('login', views.login),
    path ('logout', views.logout),
    path('success', views.success),
]   
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
