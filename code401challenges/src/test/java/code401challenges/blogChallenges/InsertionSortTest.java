package code401challenges.blogChallenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    public class InsertionSorter {

        public void sort(int[] values) {
            for (int i = 1; i < values.length; ++i) {
                insert(values, i-1, values[i]);
            }
        }

        private void insert(int[] array, int rightIndex, int value) {
            while (0 <= rightIndex && value < array[rightIndex]) {
                array[rightIndex+1] = array[rightIndex];
                --rightIndex;
            }
            array[rightIndex+1] = value;
        }
    }

            private InsertionSorter sorter = new InsertionSorter();

            @Test
            public void shouldDoNothingWithEmptyArray() {
                int[] values = {};

                sorter.sort(values);
            }

            @Test
            public void shouldDoNothingWithOneElementArray() {
                int[] values = {1};

                sorter.sort(values);

                assertArrayEquals(new int[] {1}, values);
            }

            @Test
            public void shouldSortValues() {
                int[] values = {5,4,3,2,1};
                int[] expectedOrder = {1,2,3,4,5};

                sorter.sort(values);

                assertArrayEquals(expectedOrder, values);
            }
        }

//used this as a resource https://farenda.com/algorithms/insertion-sort-in-java/ worked with Annie pineda