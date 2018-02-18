package namespace
import org.assertj.core.api.Assertions.assertThat

fun main() {
    // the following works
    assertThat(false).isFalse()

    // however intellij wants to change it to the following, which doesn't work
    // assertThat(false).isFalse
}
