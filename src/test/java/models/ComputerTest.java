package models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static models.enums.GameSelections.*;

class ComputerTest {
    Computer rockSelectComputer = new Computer(ROCK);
    Computer scissorSelectComputer = new Computer(SCISSOR);
    Computer paperSelectComputer = new Computer(PAPER);

    @Test
    public void testGetSelection() {
        assertThat(rockSelectComputer.getSelection())
                .isEqualTo(ROCK);
        assertThat(scissorSelectComputer.getSelection())
                .isEqualTo(SCISSOR);
        assertThat(paperSelectComputer.getSelection())
                .isEqualTo(PAPER);
    }
}