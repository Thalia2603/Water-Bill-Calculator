package org.example

/**
 * Función principal que inicia la ejecución del programa de cálculo de facturas de agua.
 * Presenta mensajes de inicio y final, y permite al usuario realizar cálculos de factura de agua de manera iterativa.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun main() {
    startOfProgramMessage()
    do {
        val consumedLiters = readFloat("1. Enter the consumed liters of water:")
        val hasFamilyDiscount = readStringSiNo("2. Do you have a large family or single-parent card? (yes/no)")
        val hasSocialBonus = readStringSiNo("3. Do you have any social bonus? (yes/no)")
        val consumptionPrice = calculateConsumption(consumedLiters, hasFamilyDiscount, hasSocialBonus)
        println(GREEN_BOLD_BRIGHT + "-----FINAL PRICE: ${consumptionPrice.round(2)} €-----" + RESET)
        val wantsToContinue = readStringSiNo(YELLOW_BOLD_BRIGHT + "Do you want to calculate another water bill? (yes/no)" + RESET)
    } while (wantsToContinue)
    endOfProgramMessage()
}

