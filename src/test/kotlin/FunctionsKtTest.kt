import org.example.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WaterBillTest {

    /**
     * Prueba que la función [calculateFamilyMoN] devuelve el resultado esperado cuando el porcentaje
     * es mayor al límite máximo de 50%.
     */
    @Test
    fun checkResultCalculateFamilyMoNGreaterThan50() {
        val expected = 7.5 // (50 * 10 * 15) / 100 = 7.5
        assertEquals(expected, calculateFamilyMoN(50, 15.0), 0.01)
    }

    /**
     * Verifica que la función [calculateConsumption] devuelve el resultado esperado
     * cuando no hay descuentos ni bono social aplicados.
     */
    @Test
    fun testCalculateConsumption_NoDiscountNoSocialBonus() {
        val expected = 13.5
        assertEquals(expected, calculateConsumption(50.0, false, false))
    }

    /**
     * Prueba que la función [calculateFamilyMoN] devuelve el resultado esperado cuando
     * el porcentaje es mayor al límite máximo de 50%.
     */
    @Test
    fun testCalculateFamilyMoN_GreaterThan50Percent() {
        val expected = 7.5
        assertEquals(expected, calculateFamilyMoN(50, 15.0))
    }

    /**
     * Verifica que la función [baseCalculation] devuelve el resultado esperado para un consumo
     * de agua entre 50 y 200 litros.
     */
    @Test
    fun testBaseCalculation_Between50And200Liters() {
        val expected = 28.5 // (150 * 0.15) + 6 = 22.5
        assertEquals(expected, baseCalculation(150.0))
    }

    /**
     * Prueba que la función [calculateSocialBonus] devuelve el resultado esperado
     * según la lógica implementada.
     */
    @Test
    fun testCalculateSocialBonus() {
        val expected = 17.0 // Ajusta el resultado esperado según tu lógica
        val actual = calculateSocialBonus(25.0)
        assertEquals(expected, actual)
    }

    /**
     * Verifica que la función [calculateFamilyMoN] devuelve el resultado esperado
     * para un número significativo de personas en la familia.
     */
    @Test
    fun testCalculateFamilyMoN_ManyPeople() {
        val expected = 9.0 // Ajusta el resultado esperado según tu lógica
        val actual = calculateFamilyMoN(6, 18.0)
        assertEquals(expected, actual)
    }

    /**
     * Prueba que la función [calculateFamilyMoN] devuelve el resultado esperado
     * para un número bajo de personas en la familia.
     */
    @Test
    fun testCalculateFamilyMoN_FewPeople() {
        val expected = 5.4 // Ajusta el resultado esperado según tu lógica
        val actual = calculateFamilyMoN(3, 18.0)
        assertEquals(expected, actual)
    }

    /**
     * Verifica que la función [baseCalculation] devuelve el resultado esperado
     * para un consumo de agua menor a 50 litros.
     */
    @Test
    fun testBaseCalculation_LessThan50Liters() {
        val expected = 30.0 // Precio base para menos de 50 litros
        val actual = baseCalculation(30.0)
        assertEquals(expected, actual)
    }



}
