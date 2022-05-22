package taskes;

import org.junit.jupiter.api.Test;
import taskes.task1.FirstTask;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FirstTaskTest {
    private final static List<String> UNSORTED = List.of("A", "Z", "C", "B", "D");
    private final static List<String> SORTED = List.of( "Z","D", "C", "B","A" );

    @Test
    void shouldReverseListOfStrings_usingAnonymousClass() {
        //when
        List<String> result = FirstTask.sortUsingAnonymousClass(UNSORTED);
        assertThat(result).isEqualTo(SORTED);
    }
    @Test
    void shouldReverseListOfStringsUsingStream(){
        List<String> result = FirstTask.sortUsingStream(UNSORTED);
        assertThat(result).isEqualTo(SORTED);
    }
}