lista5 = []
lista = ["Luis", 5,-9,False,"Sanchez",88.55] #arreglo
lista2 = [5,8,1,0,6] #arreglo
print(lista)
print(lista[0:3]) #muestra del 0 al 3
print(lista[2:])
print(lista[1:])#a partir del 1
lista.append("Luis") #elementos al final de la lista
lista.insert(2,"Carlos") #agrega elementos a la lista en el indice indicado
lista.extend((["Sandra",7])) #añade varios elementos
print(lista)
lista2,sorted() #orden ascendente
lista.reverse() #orden descendente
lista.remove("Carlos") #elimina datos
print(lista2)
#formas de iterar el arreglo
for l in lista :
    print(l)

#i = 0
# while i <len(lista) :
# print(lista[i])
# i+=1    