# Programa de Cálculo de Facturas de Agua

![Watter bill](https://github.com/Thalia2603/waterBill/assets/153110473/97649a91-92e8-4478-af11-9a4aebfac62a)


Este programa, desarrollado por Thalia Bravo, está diseñado para calcular el costo de las facturas de agua, teniendo en cuenta diversos factores como la cantidad de litros consumidos, la presencia de descuentos por familia numerosa o monoparental, y la aplicación de bonos sociales.

## Índice

1. [Descripción del Programa](#descripción-del-programa.md)
    - 1.1 [Función Principal (`main`)](#función-principal-main)
    - 1.2 [Función de Cálculo de Consumo (`calculateConsumption`)](#función-de-cálculo-de-consumo-calculateconsumption)
    - 1.3 [Funciones Auxiliares](#funciones-auxiliares)
2. [Ejemplo de Ejecución](#ejemplo-de-ejecución)
    - 2.1 [Inicio del Programa](#inicio-del-programa)
    - 2.2 [Cálculo de Factura](#cálculo-de-factura)
    - 2.3 [Mensajes de Descuento](#mensajes-de-descuento)
    - 2.4 [Fin del Programa](#fin-del-programa)
    - 2.5 [Ejecuciones de Ejemplo](#diferentes-ejecuciones-de-prueba)
3. [Conclusiones](#conclusiones)

## Descripción del Programa

Este programa proporciona una herramienta para calcular el costo de las facturas de agua. Su flexibilidad permite considerar diferentes situaciones, como la cantidad de litros consumidos, descuentos por familia numerosa o monoparental, y la aplicación de bonos sociales. La interacción es en español y la modularidad del código facilita su comprensión y mantenimiento.

### Función Principal (`main`)ç

![main](https://github.com/Thalia2603/waterBill/assets/153110473/7cf1b92c-743e-4ae6-8698-fb2977982e04)

Función que sirve de 'dispacher' del resto de funciones

### Función de Cálculo de Consumo (`calculateConsumption`)

![CalculateConsumption](https://github.com/Thalia2603/waterBill/assets/153110473/703def8c-815c-4621-9d62-7775b521a901)

Función principal que acredita que tipo de descuento recibirá el usuario en función si dispone o no de bono social o si dispone de carnet monoparental/família numerosa

### Funciones Auxiliares

![readYesNo](https://github.com/Thalia2603/waterBill/assets/153110473/9574190a-a84e-44c5-aafb-c5136f70ef55)

Existen diferentes funciones auxiliares en el programa, como ejemplo esta readStringSiNo, que como indica su nombre lee el input del usuario y con un control de errores nos aseguramos que el input sea correcto

### Inicio del Programa

![Imagen de bienvenida](https://github.com/Thalia2603/waterBill/assets/153110473/a81f5063-e88b-478e-85ed-f4eeab2e0054)

En el inicio, el programa muestra un mensaje de bienvenida al usuario.

### Cálculo de Factura

![Iteracción principal](https://github.com/Thalia2603/waterBill/assets/153110473/ab5c53d4-ff54-43a2-94df-32c24ff1924a)

(Ejemplo de ejecución)

Durante la ejecución, el usuario proporciona la cantidad de litros consumidos y responde a preguntas sobre descuentos y bonos sociales.

### Mensajes de Descuento

![Mensaje de descuentos](https://github.com/Thalia2603/waterBill/assets/153110473/5cd044f1-96e1-474e-8283-2ae626a83fdf)

Muestra al usuario los descuentos que le han aplicado a su tarifa y finalmente el precio final de su factura.

### Fin del Programa

![Fin de programa](https://github.com/Thalia2603/waterBill/assets/153110473/af8cff50-88f3-4953-a516-dcc9f77a1ffd)

Al finalizar el cálculo, se le pregunta al usuario si desea calcular otra factura. Si su respuesta es no, el programa muestra un mensaje de despedida y concluye su ejecución. Sin embargo, si el usuario decide continuar, se le volverán a mostrar las preguntas del principio.

![El usuario desea seguir con la ejecución](https://github.com/Thalia2603/waterBill/assets/153110473/70c9b60b-da3c-491f-8e5f-6b4af058675f)

### Diferentes Ejecuciones de Prueba

- Ejemplo 1
    - En esta ejecución, el usuario dispone de carnet de familia numerosa y a su vez de bono social. Por lo tanto, se le hará un 80% de descuento, ya que se aplica el descuento que más beneficie al usuario.

       ![primeraEjecución](https://github.com/Thalia2603/waterBill/assets/153110473/b449cb34-4e1e-4fd9-889c-df6805c22bbe)

- Ejemplo 2
    - En este caso, el usuario no dispone de ningún descuento, por lo tanto, se le calculará su factura en función de los litros consumidos y se le añadirán 6€ de cuantía fija.

      ![segundaEjecución](https://github.com/Thalia2603/waterBill/assets/153110473/6c8a71b0-9009-46c0-aaa4-906f40726c31)

- Ejemplo 3
    - En la siguiente ejecución, el usuario únicamente dispone de carnet de familia numerosa con 3 miembros en su familia. En este caso, se el aplicará el descuento en función de los miembros de su familia (numero de miembros*10 = porcentaje a aplicar).

      ![terceraEjecución](https://github.com/Thalia2603/waterBill/assets/153110473/243d2cf2-db46-4a09-a057-356d6f478f5d)

    - En el caso de que el usuario tenga más de 5 miembros en su familia solo se le aplicará como máximo un 50% de descuento.

      ![quartaEjecución](https://github.com/Thalia2603/waterBill/assets/153110473/3a8900e9-d68f-4253-b683-0ba34398054b)

- Ejemplo 4
    - Finalmente, si el usuario solo dispone de bono social se le aplicará el 80% de descuento y su cuota fija reducirá 3€.

      ![quintaEjecución](https://github.com/Thalia2603/waterBill/assets/153110473/3edea949-087b-4541-bf85-8517f9cbb364)

## Conclusiones

Este programa destaca por su capacidad para adaptarse a diversas situaciones y proporcionar resultados precisos en el cálculo de facturas de agua. Su diseño modular y la interacción amigable en español hacen que sea una herramienta accesible y fácil de utilizar.
