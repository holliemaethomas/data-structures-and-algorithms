package code401challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void test_LinkedListIsEmpty() {
        LinkedList<String> testDummyLinkedList = new LinkedList<>();
        assertNull(
                "Method should determine if Linked List was empty",
                testDummyLinkedList.getHead()
        );
    }

    @Test public void test_prepend() {
        LinkedList<String> testDummyLinkedList = new LinkedList<>();
        testDummyLinkedList.setHead("up");
        testDummyLinkedList.prepend("you");
        testDummyLinkedList.prepend("give");
        testDummyLinkedList.prepend("gonna");
        testDummyLinkedList.prepend("never");

        assertEquals(
                "method should prepend the new values to a Linked List ",
                "never gonna give you up null",
                testDummyLinkedList.toString()

        );
    }

    @Test
    public void test_insertBefore() {
        LinkedList<String> testDummyLinkedList = new LinkedList<>();
        testDummyLinkedList.setHead("down");
        testDummyLinkedList.insertBefore("down", "never gonna let you");


        assertEquals(
                "method should add the new values to a Linked List ",
                "never gonna let you down null",
                testDummyLinkedList.toString()

        );

    }

    @Test
    public void test_insertAfter() {
        LinkedList<String> testDummyLinkedList = new LinkedList<>();
        testDummyLinkedList.setHead("never gonna run around and");
        testDummyLinkedList.insertAfter("never gonna run around and", "desert you");

        assertEquals(
                "method should add the new values to a Linked List ",
                "never gonna run around and desert you null",
                testDummyLinkedList.toString()
        );
    }

    @Test
    public void test_kthFromEnd() {
        LinkedList<Integer> testDummyLinkedList = new LinkedList<>();
        testDummyLinkedList.setHead(1);
        testDummyLinkedList.append(2);
        testDummyLinkedList.append(3);
        testDummyLinkedList.append(4);
        testDummyLinkedList.append(5);

        assertEquals(
                "test_kthFromEnd()",
                "2",
                testDummyLinkedList.kthFromEnd(3)
        );
    }

    @Test
    public void test_mergeList() {
        LinkedList<Integer> testDummyLinkedListFirstList = new LinkedList<>();
        LinkedList<Integer> testDummyLinkedListSecondList = new LinkedList<>();
        testDummyLinkedListSecondList.setHead(1);
        testDummyLinkedListSecondList.append(2);
        testDummyLinkedListSecondList.append(3);

        LinkedList proveMethodWorks = LinkedList.mergeList(testDummyLinkedListFirstList, testDummyLinkedListSecondList);

        assertEquals(
                "method should return second list if first list is empty",
                "1 2 3 null",
                proveMethodWorks.toString()
        );

    }


}