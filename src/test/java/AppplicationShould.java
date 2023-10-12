import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppplicationShould {
    @Test
    void test() {
        Application app=new Application();
        boolean test=app.isWorking();
        Assertions.assertThat(test).isTrue();
    }
}
