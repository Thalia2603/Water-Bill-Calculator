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
        val litrosConsumidos= readFloat("1.Introduce los litros de agua consumidos:")
        val tieneDescuento= readStringSiNo("2.Dispone de carnet de familia numerosa o monoparental? (si/no)")
        val tieneBonoSocial= readStringSiNo("3.Dispone algún bono social?(si/no)")
        val precioConsumo= calculoConsumo(litrosConsumidos,tieneDescuento,tieneBonoSocial)
        println(GREEN_BOLD_BRIGHT+"-----PRECIO FINAL: ${precioConsumo.round(2)} €-----"+ RESET)
        val quiereSeguir= readStringSiNo(YELLOW_BOLD_BRIGHT+"Desea calcular otra factura? (si/no)"+ RESET)
    }while (quiereSeguir)
    endOfProgramMessage()
}

