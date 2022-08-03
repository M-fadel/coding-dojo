x = [ [5,2,3], [10,8,9] ] 
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]


x[1][0]=15
students[0].update({'first_name': 'Michael', 'last_name':"Bryant"})

for i in sports_directory:
    for j in sports_directory[i]:
        
        if j ==  "Messi":
            sports_directory[i][0] = "Andres"
            break
    

z[0].update({'y': 30})








dojo = {
    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
    }


students = [
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]

def iterateDictionary(some_list):
    for dict in some_list:
        print("first_name -",dict.get('first_name'),",last_name -",dict.get('last_name'))
iterateDictionary(students) 
# should output: (it's okay if each key-value pair ends up on 2 separate lines;
# bonus to get them to appear exactly as below!)

def iterateDictionary2(key_name, some_list):
    for dict in some_list:
        print(dict.get(key_name))
    
iterateDictionary2('first_name', students)

print()
def printInfo(_dict):
    for x in _dict:
        print(len(_dict[x]),x.upper())
        for i in _dict[x]:
            print(i)

printInfo(dojo)


