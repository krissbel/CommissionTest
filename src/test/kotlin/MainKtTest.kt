package commissionTest.main
import commissionCalculation
import org.junit.Assert.*
import org.junit.Test


class MainKtTest {


    @Test
    fun commissionCalculation_Maestro() {
        val type: String = "Maestro"
        val summ: Int = 8_000_000
        val transfer: Int = 1_500_000


        val result = commissionCalculation(
            type,
            summ,
            transfer,
        )
        assertEquals("Зачислено: 14909.8 р. Комиссия составила: 90.2 р.", result)
    }

    @Test
    fun commissionCalculation_VkPay() {
        val type: String = "VkPay"
        val summ: Int = 73_000_000
        val transfer: Int = 1_000_000


        val result = commissionCalculation(
            type,
            summ,
            transfer,
        )
        assertEquals("Зачислено: 10000.0 р. Комиссия составила: 0.0 р.", result)
    }

    @Test
    fun commissionCalculation_MasterCard() {
        val type: String = "MasterCard"
        val summ: Int = 73_000_000
        val transfer: Int = 1_000_000


        val result = commissionCalculation(
            type,
            summ,
            transfer,
        )
        assertEquals("Зачислено: 9939.8 р. Комиссия составила: 60.2 р.", result)
    }
}
