"""
cadena que convierte a la primera letra en mayuscula 
"""
cadena1 = "juan"
print("capitalizar", cadena1.capitalize())

"""
Cadena que convierte todas las letras en minuscula
"""
cadena2 = "SoS"
print("Casefold", cadena2.casefold())

"""
Añadira dependiento de la longitud signos 
"""
print(cadena2.center(12,'-'))

menus = ["menu ATM","Depositar", "Retirar", "Consultar"]
for menu in menus :
    print(menu.center(20,'-'))

"""
te permite contar y buscar sinbolos especificos
"""
cadena3 = "hola mundo"
print(cadena3.count("o", 3, 10))