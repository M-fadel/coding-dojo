<<<<<<< HEAD
# Generated by Django 4.0.5 on 2022-06-19 21:32

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('books_authors_app', '0008_rename_update_books_updated_at_authors_created_at_and_more'),
    ]

    operations = [
        migrations.AddField(
            model_name='authors',
            name='notes',
            field=models.TextField(default='notes'),
            preserve_default=False,
        ),
    ]
=======
# Generated by Django 4.0.5 on 2022-06-19 21:32

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('books_authors_app', '0008_rename_update_books_updated_at_authors_created_at_and_more'),
    ]

    operations = [
        migrations.AddField(
            model_name='authors',
            name='notes',
            field=models.TextField(default='notes'),
            preserve_default=False,
        ),
    ]
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
