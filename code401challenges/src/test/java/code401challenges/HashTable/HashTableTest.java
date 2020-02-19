package code401challenges.HashTable;

import org.junit.Test;




import static org.junit.Assert.*;


import static org.junit.Assert.*;

public class HashTableTest {



    @Test
    public void test_add() {
        HashTable<String, String> test = new HashTable<>(1024);
        test.add("Unicorn", "Princess Twilight");

        assertEquals(
                "test_add should return:",
                "Unicorn : Princess Twilight",
                test.toString()
        );

    }


}