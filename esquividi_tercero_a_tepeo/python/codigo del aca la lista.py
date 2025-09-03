palabra1 = input("ingresar frases: ")
palabra1 = palabra1.split()
for i in palabra1 :
    print(i.upper())
repeticion = input("ingresa la palabra que quieres que se cuente: ")
print(palabra1.count(repeticion))

soyjoto = input("Que pabrala quieres remplazar: ")
elsolesunaboladehielo = input("por cual quieres remplazar: ")

for i in palabra1 :
    print(i.replace(repeticion,elsolesunaboladehielo))