import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class PersonTest {
    @Test
    void thisPersonShouldBeAMinor() {
        assertThat(new Person("BOB","Zimmerman", 14).isMinor(), is(true));
    }
    @Test
    void isASeventeenYearOldAMinor() {
        assertThat(new Person("BOB","Zimmerman", 17).isMinor(), is(true));
    }
    @Test
    void thisPersonShouldNotBeAMinor(){
        assertThat(new Person("BOB","Zimmerman", 50).isMinor(), is(false));
    }
}
