<<<<<<< HEAD
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path ('register', views.register),
    path ('login', views.login),
    path ('logout', views.logout),
    path('success', views.success),
    path('addBook', views.addBook),
    path('<int:number>', views.favorite),
    path('info/<int:number>', views.info),
    path('update', views.update),  
    path ('unfavorite/<int:number>', views.unfavorite),

=======
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path ('register', views.register),
    path ('login', views.login),
    path ('logout', views.logout),
    path('success', views.success),
    path('addBook', views.addBook),
    path('<int:number>', views.favorite),
    path('info/<int:number>', views.info),
    path('update', views.update),  
    path ('unfavorite/<int:number>', views.unfavorite),

>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
]   