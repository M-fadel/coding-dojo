from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path('addGold', views.addGold),
    path('gamble', views.gamble),
    # path('',views.root)
]   