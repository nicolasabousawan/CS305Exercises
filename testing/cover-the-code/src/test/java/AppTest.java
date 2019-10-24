import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class AppTest {
    @Test
    void noSpeedChangeUnderStandardConditions() {
        assertThat(App.getEngineSpeed(120, 20, false), is(120));
    }
    @Test
    void errorThrownWhenDistanceIsNegative(){
        boolean thrown = false;
        try {
            App.getEngineSpeed(2, -4, true);
        } catch ( IllegalArgumentException e){
            thrown = true;
        }
        assertThat(thrown, is(true));
    }
    @Test
    void speedGreaterThan200(){
        assertThat(App.getEngineSpeed(2000,20,false), is(200));
    }
    @Test
    void carIsCloseToNextCar(){
        assertThat(App.getEngineSpeed(8,1,true), is(8));
    }

    @Test
    void paranoidDriver(){
        assertThat(App.getEngineSpeed(150,1,true), is(100));
    }

}
