package data;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest
{
    @Test
    void getName()
    {
        Person p = new Person("James");
        assertEquals("James", p.getName());
        assertEquals("John", p.getName());

    }
}
