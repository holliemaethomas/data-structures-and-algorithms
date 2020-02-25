package code401challenges.hashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

//    Evert Pony can have new values added
    @Test
    public void test_AddMethod() {
        HashTable<String, String> EveryPony = new HashTable<>(1024);
        EveryPony.add("Unicorn", "Princess Twilight");

        assertEquals(
                "Method test should return the new KV pair",
                "Unicorn : Princess Twilight\n",
                EveryPony.toString()
        );
    }


//   EveryPony contains the value Apple Jack matching the key Pony
    @Test
    public void test_GetValueMethod() {
        HashTable<String, String> EveryPony = new HashTable<>(1024);
        EveryPony.add("Pony", "Apple Jack");

        assertEquals(
                "Method test should return the value for the given Key",
                "Apple Jack",
                EveryPony.get("Pony")
        );
    }


//    Every Pony contains the Key Pegasus
    @Test
    public void test_KeyExsists() {
        HashTable<String, String> EveryPony = new HashTable<>(1024);
        EveryPony.add("Pegasus", "Rainbow Dash");

        assertTrue(EveryPony.has("Pegasus"));
    }


//    Every Pony does not contain false value
    @Test
    public void test_DoesNotExsist() {
        HashTable<String, String> EveryPony = new HashTable<>(1024);

        assertFalse(EveryPony.has("Nightmare Moon"));
    }


//Every Pony can handle collisions

  @Test
  public void test_multipleValues () {
      HashTable<String, String> EveryPony = new HashTable<>(1024);
      EveryPony.add("Pony", "Trixie");
      EveryPony.add("Unicorn", "Trixie");
      EveryPony.add("Princess", "Celestia");

      assertEquals(
              "method can hold multiple values",
      "Unicorn : Trixie\n" + "Princess : Celestia\n" +"Pony : Trixie\n" ,
              EveryPony.toString()
      );
    }


}
