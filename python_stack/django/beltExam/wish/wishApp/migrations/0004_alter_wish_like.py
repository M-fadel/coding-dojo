# Generated by Django 4.0.5 on 2022-06-25 14:26

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('wishApp', '0003_wish_like'),
    ]

    operations = [
        migrations.AlterField(
            model_name='wish',
            name='Like',
            field=models.IntegerField(max_length=255),
        ),
    ]