# Generated by Django 4.0.5 on 2022-06-14 18:41

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('dojo_ninja_app', '0003_remove_dojo_desc'),
    ]

    operations = [
        migrations.AddField(
            model_name='dojo',
            name='desc',
            field=models.TextField(default='old dojo'),
            preserve_default=False,
        ),
    ]
