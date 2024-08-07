package Level5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {
    @Test
    public void basicTests(){
        assertEquals(4,MissingNumber.missing("123567"));
        assertEquals(92,MissingNumber.missing("899091939495"));
        assertEquals(100,MissingNumber.missing("9899101102"));
        assertEquals(-1,MissingNumber.missing("599600601602"));
        assertEquals(-1,MissingNumber.missing("8990919395"));
        assertEquals(1002,MissingNumber.missing("998999100010011003"));
        assertEquals(10000,MissingNumber.missing("99991000110002"));
        assertEquals(-1,MissingNumber.missing("979899100101102"));
        assertEquals(900003,MissingNumber.missing("900001900002900004900005900006"));
    }
    @Test
    public void randomTests(){
        assertEquals(-1,MissingNumber.missing("9993999499"));
        assertEquals(-1,MissingNumber.missing("9929939949"));
        assertEquals(999,MissingNumber.missing("9949959969979981000100110021003"));
        assertEquals(100,MissingNumber.missing("949596979899101102103"));
    }
}