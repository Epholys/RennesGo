package rennesgo.data;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// This is a dummy test file to test the good use of jacoco
// TODO: REMOVE
class TestTest {
    final String usernameTest = "Testus Maximum";
    Profile profileTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        profileTest = new Profile(usernameTest);
    }

    @org.junit.jupiter.api.Test
    void constructorTest() {
        //assertEquals(usernameTest, profileTest.getUsername());
        assertTrue(profileTest.getPrefLines().isEmpty());
    }

    @org.junit.jupiter.api.Test
    void addPrefLineManipulationTest() {
/*        profileTest.addPrefLine("Test123");

        final Set<String> prefLines = profileTest.getPrefLines();
        assertTrue(prefLines.contains("Test123"));*/
    }

    @org.junit.jupiter.api.Test
    void getUsername() {
    }

    @org.junit.jupiter.api.Test
    void getPrefLines() {
    }
}
