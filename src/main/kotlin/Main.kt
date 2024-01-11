package org.example

/**
 * Función principal que inicia la ejecución del programa de cálculo de facturas de agua.
 * Presenta mensajes de inicio y final, y permite al usuario realizar cálculos de factura de agua de manera iterativa.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun main() {
    // Muestra el mensaje de inicio del programa
    startOfProgramMessage()
    // Realiza el bucle do-while para permitir cálculos más de un cálculo hasta que el usuario decida parar
    do {
        // Solicita al usuario la cantidad de litros de agua consumidos
        val consumedLiters = readFloat("1. Introduza los litros consumidos este mes:")
        // Pregunta al usuario si tiene descuento por ser familia numerosa o monoparental
        val hasFamilyDiscount = readStringSiNo("2. Dispone de carnet monoparental o de familia numerosa?: (si/no)")
        // Pregunta al usuario si dispone de un bono social
        val hasSocialBonus = readStringSiNo("3. Dispone de bono social?: (si/no)")
        // Calcula el costo final de consumo y muestra el resultado
        val consumptionPrice = calculateConsumption(consumedLiters, hasFamilyDiscount, hasSocialBonus)
        println(GREEN_BOLD_BRIGHT + "-----PRECIO FINAL: ${consumptionPrice.round(2)} €-----" + RESET)
        // Pregunta al usuario si desea seguir calculando
        val wantsToContinue = readStringSiNo(YELLOW_BOLD_BRIGHT + "Desea seguir con alguna otra factura?: (si/no)" + RESET)
    } while (wantsToContinue)
    // Muestra el mensaje final del programa
    endOfProgramMessage()
}

