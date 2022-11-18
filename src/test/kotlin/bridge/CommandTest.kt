package bridge

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CommandTest {
    @ParameterizedTest
    @ValueSource(strings = ["1", "100", "2"])
    fun `명령어가 숫자인 경우 예외 테스트`(execution: String) {
        assertThrows<IllegalArgumentException> {
            Command(execution)
        }
    }
}