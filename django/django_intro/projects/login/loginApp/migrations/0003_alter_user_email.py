# Generated by Django 4.0.5 on 2022-06-22 19:12

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('loginApp', '0002_rename_emaile_user_email'),
    ]

    operations = [
        migrations.AlterField(
            model_name='user',
            name='Email',
            field=models.EmailField(max_length=255),
        ),
    ]
