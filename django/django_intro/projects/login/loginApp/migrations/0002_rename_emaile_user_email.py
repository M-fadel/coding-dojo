# Generated by Django 4.0.5 on 2022-06-22 10:06

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('loginApp', '0001_initial'),
    ]

    operations = [
        migrations.RenameField(
            model_name='user',
            old_name='Emaile',
            new_name='Email',
        ),
    ]
