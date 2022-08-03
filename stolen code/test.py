users = [
    {'first_name' : 'Michael', 'last_name' : 'Choi'},
    {'first_name' : 'John', 'last_name' : 'Supsupin'},
    {'first_name' : 'Mark', 'last_name' : 'Guillen'},
    {'first_name' : 'KB', 'last_name' : 'Tonel'}
]
l = []
names = []
lengthOfNames =0
for i in users:
        l=list(i.keys())
print(l[0])

def iterateDictionary(some_list):
    for dict in some_list:
        names.append (dict.get('first_name'))
        names.append(dict.get('last_name'))
        names.append(dict.get('first_name')+" "+dict.get('last_name'))
    lengthOfNames= int(len(names)/3)
    return lengthOfNames
    
lengthOfNames= iterateDictionary(users)

print(names)
print(lengthOfNames)
# a =users[0]
# a= users[0]