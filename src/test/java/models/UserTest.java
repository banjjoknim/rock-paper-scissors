package models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static models.enums.GameSelections.*;

class UserTest {
    User rockSelectUser = new User(ROCK);
    User scissorSelectUser = new User(SCISSOR);
    User paperSelectUser = new User(PAPER);

    @Test
    public void testGetSelection() {
        assertThat(rockSelectUser.getSelection())
                .isEqualTo(ROCK);
        assertThat(scissorSelectUser.getSelection())
                .isEqualTo(SCISSOR);
        assertThat(paperSelectUser.getSelection())
                .isEqualTo(PAPER);
    }
}