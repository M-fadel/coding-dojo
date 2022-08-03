<<<<<<< HEAD
from django.urls import path
from . import views	# the . indicates that the views file can be found in the same directory as this file
                    
urlpatterns = [
    path('', views.book),
    path('addBook', views.addBook),
    path('book/<int:number>', views.bookView),
    path('authorToBooks', views.bookToAuthor),
    path('author', views.author),
    path("addAuthor", views.addAuthor),
    path('author/<int:number>', views.authorView)
]
=======
from django.urls import path
from . import views	# the . indicates that the views file can be found in the same directory as this file
                    
urlpatterns = [
    path('', views.book),
    path('addBook', views.addBook),
    path('book/<int:number>', views.bookView),
    path('authorToBooks', views.bookToAuthor),
    path('author', views.author),
    path("addAuthor", views.addAuthor),
    path('author/<int:number>', views.authorView)
]
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
