package org.example

import java.security.Principal

/**
 *This function prints welcome in blue
 * @author Thalia2603
 * @since 04/01/2024
 */
fun startOfProgramMessage() {
    //AsciiArt()
    println(BLUE_BOLD_BRIGHT + "----------------------------")
    println("        Bienvenido/a        ")
    println("----------------------------" + RESET)
    println(BLUE_BOLD_BRIGHT + "  CÁLCULO FACTURA DEL AGUA" + RESET)
}


/**
 *This function prints goodbye message at the end of every iteration of program with blue bold color
 * @author Thalia2603
 * @since 04/01/2024
 */
fun endOfProgramMessage(){
    println(BLUE_BOLD_BRIGHT+"         ¡HASTA PRONTO!        "+RESET)
}

/**
 *This function prints Data Type error message (used in functions that check input) in red
 * @author Thalia2603
 * @since 04/01/2024
 */
fun messageErrorDT(){
    //funcion que es llamada cuando el tipo de dato es incorrecto
    println(RED_BOLD+"El tipo de dato no es correcto, vuelva a intentarlo"+RESET)
}
/**
 *This function prints range error message (used in functions that check input) in yellow
 * @author Thalia2603
 * @since 04/01/2024
 */
fun messageErrorRange(){
    //funcion que es llamada cuando el tipo de dato esta fuera del rango establecido
    println(YELLOW_BOLD+"El tipo de dato no es correcto, vuelva a intentarlo"+RESET)
}

