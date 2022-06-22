# Generated by Django 4.0.5 on 2022-06-19 20:59

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('books_authors_app', '0005_remove_authors_book'),
    ]

    operations = [
        migrations.AddField(
            model_name='authors',
            name='book',
            field=models.ManyToManyField(related_name='author', to='books_authors_app.books'),
        ),
    ]
