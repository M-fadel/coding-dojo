# Generated by Django 4.0.5 on 2022-06-27 10:08

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('wishApp', '0013_user_email_user_created_at_user_fname_user_lname_and_more'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='wish',
            name='granted',
        ),
    ]
