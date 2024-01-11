package org.example

/**
 * Calcula el costo final del consumo de agua, considerando descuentos y bono social.
 * Realiza un cálculo base inicial utilizando la función `baseCalculation` y luego aplica descuentos según las condiciones especificadas.
 * Muestra mensajes para informar al usuario sobre los descuentos aplicados.
 *
 * @param liters Cantidad de litros de agua consumidos.
 * @param discount Indica si se aplica un descuento.
 * @param socialBonus Indica si se aplica un bono social.
 * @return El costo final del consumo de agua, considerando descuentos y bono social.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun calculateConsumption(liters: Float, discount: Boolean, socialBonus: Boolean): Double {
    val initialCalculationWithoutDiscounts = baseCalculation(liters)
    var calculationWithDiscount = initialCalculationWithoutDiscounts
    // Aplica descuento por familia numerosa o monoparental
    if (discount && !socialBonus) {
        val numberOfPeople = numberOfPeople()
        if (numberOfPeople > 5) {
            println(PURPLE_BOLD_BRIGHT+"Se le aplicará un 50% de descuento por ser familia numerosa"+ RESET)
        } else if (numberOfPeople < 5) {
            println(PURPLE_BOLD_BRIGHT+"Se le aplicará un ${numberOfPeople*10}% de descuento por ser familia numerosa"+ RESET)
        } else if (numberOfPeople == 1) {
            println(PURPLE_BOLD_BRIGHT+"Se le aplicará un ${numberOfPeople*10}% de descuento por ser familia monoparental"+ RESET)
        }
        calculationWithDiscount = calculateFamilyMoN(numberOfPeople, initialCalculationWithoutDiscounts)
    }

    // Aplica descuento y ajuste de cuota fija por bono social
    if (socialBonus && !discount) {
        println(PURPLE_BOLD_BRIGHT+"Se le aplicará un 80% de descuento y su quota fija reducirá a 3€"+ RESET)
        calculationWithDiscount = calculateSocialBonus(initialCalculationWithoutDiscounts)
    }

    // Aplica descuento por bono social
    if (socialBonus && discount) {
        println(PURPLE_BOLD_BRIGHT+"Se le aplicará un 80% de descuento y su quota fija reducirá a 3€"+ RESET)
        calculationWithDiscount = calculateSocialBonus(initialCalculationWithoutDiscounts)
    }

    // Mensaje si no hay descuentos aplicados
    if (!socialBonus && !discount) {
        println(PURPLE_BOLD_BRIGHT + "Desafortunadamente, no dispone de ningún descuento" + RESET)
    }

    return calculationWithDiscount
}

/**
 * Solicita al usuario el número de miembros en su familia y devuelve este valor
 *
 * @return Número de personas en la familia.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun numberOfPeople(): Int {
    val numberOfPeople = readInt("Introduce el número de miembros en tu familia")
    return numberOfPeople
}
/**
 * Calcula el costo final aplicando el bono social.
 *
 * @param price Precio sin descuentos.
 * @return Precio final con descuento del bono social.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun calculateSocialBonus(price: Double): Double {
    val finalPrice = ((80 * price) / 100) - 3
    return finalPrice
}


/**
 * Calcula el costo inicial del consumo de agua sin descuentos.
 *
 * @param liters Cantidad de litros de agua consumidos.
 * @return Precio inicial sin descuentos.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun baseCalculation(liters: Float): Double {
    val fixedQuota = 6.0
    var finalLiters = 0.0

    // Determina el precio inicial sin descuentos según la cantidad de litros consumidos
    if (liters < 50) {
        finalLiters = liters.toDouble()
    } else if (liters in 50.0..200.0) {
        finalLiters = (liters * 0.15) + fixedQuota
    } else if (liters > 200) {
        finalLiters = (liters * 0.30) + fixedQuota
    }

    return finalLiters
}


/**
 * Calcula el costo con descuento para familia numerosa o monoparental.
 *
 * @param people Número de personas en la familia.
 * @param price Precio sin descuentos.
 * @return Precio final con descuento para familia numerosa o monoparental.
 *
 * @since 10/01/2024
 * @author Thalia Bravo
 */
fun calculateFamilyMoN(people: Int, price: Double): Double {
    var percentage = people * 10
    val familyDiscountPrice: Double

    // Calcula el precio final con descuento según el porcentaje de descuento por familia numerosa o monoparental
    if (percentage < 50) {
        familyDiscountPrice = (percentage * price) / 100
        return familyDiscountPrice
    } else {
        percentage = 50
    }

    familyDiscountPrice = (percentage * price) / 100
    return familyDiscountPrice
}

