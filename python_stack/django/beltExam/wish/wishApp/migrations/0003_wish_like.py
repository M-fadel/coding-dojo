# Generated by Django 4.0.5 on 2022-06-25 14:22

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('wishApp', '0002_wish'),
    ]

    operations = [
        migrations.AddField(
            model_name='wish',
            name='Like',
            field=models.CharField(default=0, max_length=255),
            preserve_default=False,
        ),
    ]
