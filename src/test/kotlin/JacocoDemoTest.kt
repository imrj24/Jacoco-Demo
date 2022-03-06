import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class JacocoDemoTest {

    private val jacocoDemo = JacocoDemo()

    @Test
    fun testPositive(){
        assertTrue(jacocoDemo.isEven(10))
        assertFalse(jacocoDemo.isEven(9))
    }
}