package org.example

/**
 * Calcula el consumo de agua y aplica descuentos según las condiciones especificadas.
 *
 * @param litros Cantidad de litros de agua consumidos.
 * @param descuento Indica si se aplica un descuento.
 * @param bono Indica si se aplica un bono social.
 * @return El costo final del consumo de agua, considerando descuentos y bono social.
 *
 * @author Thalia Bravo
 * @since 10/01/2024
 */
fun calculoConsumo(litros:Float, descuento:Boolean,bono:Boolean):Double{
    val primerCalculoSinDescuentos=calculoPrincipal(litros)
    var calculoConDescuento=primerCalculoSinDescuentos
    if (descuento && !bono){
        val nPersonas=numeroPersonas()
        if (nPersonas>5){
            println(PURPLE_BOLD_BRIGHT+"Se le aplicará un 50% de descuento por ser familia numerosa"+ RESET)
        }else if (nPersonas<5){
            println(PURPLE_BOLD_BRIGHT+"Se le aplicará un ${nPersonas*10}% de descuento por ser familia numerosa"+ RESET)
        }else if (nPersonas==1){
            println(PURPLE_BOLD_BRIGHT+"Se le aplicará un ${nPersonas*10}% de descuento por ser familia monoparental"+ RESET)
        }
        calculoConDescuento=calculoFamiliaMoN(nPersonas,primerCalculoSinDescuentos)
    }
    if (bono && !descuento){
        println(PURPLE_BOLD_BRIGHT+"Se le aplicará un 80% de descuento y su quota fija reducirá a 3€"+ RESET)
        calculoConDescuento=calculoBonoSocial(primerCalculoSinDescuentos)
    }

    if (bono && descuento){
        val nPersonas=numeroPersonas()
        if (nPersonas>5){
            println(PURPLE_BOLD_BRIGHT+"Se le aplicará un 50% de descuento"+ RESET)
        }else if (nPersonas<5){
            println(PURPLE_BOLD_BRIGHT+"Se le aplicará un ${nPersonas*10}% de descuento"+ RESET)
        }
        calculoConDescuento=calculoBonoSocial(primerCalculoSinDescuentos)
    }

    if (!bono && !descuento){
        println(PURPLE_BOLD_BRIGHT+"Lamentablemente no tiene ningún descuento"+ RESET)
    }
    return calculoConDescuento
}

/**
 * Solicita al usuario el número de miembros en su familia.
 *
 * @return Número de personas en la familia.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun numeroPersonas():Int{
    val nPersonas= readInt("Introduzca el numero de miembros en su familia")
    return nPersonas
}
/**
 * Calcula el costo final aplicando el bono social.
 *
 * @param precio Precio sin descuentos.
 * @return Precio final con descuento del bono social.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun calculoBonoSocial(precio:Double):Double{
    val precioFinal=((80*precio)/100)-3
    return precioFinal
}

/**
 * Calcula el costo inicial del consumo de agua sin descuentos.
 *
 * @param litros Cantidad de litros de agua consumidos.
 * @return Precio inicial sin descuentos.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun calculoPrincipal(litros: Float):Double{
    val quotafija=6.0
    var litrosFinales=0.0
    if (litros<50){
        litrosFinales=litros.toDouble()
    }else if (litros in 50.0..200.0){
        litrosFinales= (litros*0.15)+quotafija
    }else if (litros>200){
        litrosFinales=(litros*0.30)+quotafija
    }
    return litrosFinales
}

/**
 * Calcula el costo con descuento para familia numerosa o monoparental.
 *
 * @param personas Número de personas en la familia.
 * @param precio Precio sin descuentos.
 * @return Precio final con descuento para familia numerosa o monoparental.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun calculoFamiliaMoN(personas: Int, precio: Double): Double {
    var porcentaje = personas * 10
    val precioFamiliaNumerosa:Double
    if (porcentaje < 50) {
        precioFamiliaNumerosa=(porcentaje * precio) / 100
        return precioFamiliaNumerosa
    } else {
        porcentaje = 50
    }
    precioFamiliaNumerosa=(porcentaje * precio) / 100
    return precioFamiliaNumerosa
}

