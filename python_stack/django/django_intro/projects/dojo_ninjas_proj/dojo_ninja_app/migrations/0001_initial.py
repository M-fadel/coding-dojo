<<<<<<< HEAD
# Generated by Django 4.0.5 on 2022-06-14 17:36

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='dojo',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=255)),
                ('city', models.CharField(max_length=255)),
                ('state', models.CharField(max_length=2)),
            ],
        ),
        migrations.CreateModel(
            name='ninja',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('fName', models.CharField(max_length=255)),
                ('lName', models.CharField(max_length=255)),
                ('dojo', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='ninjas', to='dojo_ninja_app.dojo')),
            ],
        ),
    ]
=======
# Generated by Django 4.0.5 on 2022-06-14 17:36

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='dojo',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=255)),
                ('city', models.CharField(max_length=255)),
                ('state', models.CharField(max_length=2)),
            ],
        ),
        migrations.CreateModel(
            name='ninja',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('fName', models.CharField(max_length=255)),
                ('lName', models.CharField(max_length=255)),
                ('dojo', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='ninjas', to='dojo_ninja_app.dojo')),
            ],
        ),
    ]
>>>>>>> e952974c77d98ff495761fdcef6ddcc990316774
