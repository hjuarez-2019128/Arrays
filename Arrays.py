
#animeles = ["Perro","Gato","Tucanes","Girafa","Cebra"]
#an = input("Ingrese un Animal:  "  )
#animeles.append(an)
#for x in animeles :
   # print (x)

# Permitir decidir al usuario el ingreso de datos a la lista de animales por medio de la respuesta y/n


Animal = []
Detener = False
num = 0

while Detener == False :
    Cliente = input("Ingrese un Animal  ") 
    Animal.append(Cliente)
    Pregunta = input("Desea Continuar? y/n ")
    if Pregunta == "y" or Pregunta == "Y":
        pass
    else :
        Detener = True 
        for x in Animal :
           num = num + 1
           print(str(num)+  " ", x)











