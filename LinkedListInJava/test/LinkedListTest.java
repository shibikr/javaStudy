import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    @Test
    public void add_inserts_value_to_first_position_of_list() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1, (int) list.get(0));
    }

    @Test
    public void add_should_throw_an_exception_if_we_try_to_insert_into_invalid_index() {
        LinkedList<String> list = new LinkedList<>();
        try {
            list.add("Anu");
            list.add("Syani");
            list.add("anjaly");
            list.add(2, "shibi");
            list.add(6,"lalu");
        }catch (Exception e){
            String expected = "Size is 4 you can't insert to position 6";
            assertEquals(expected,e.getMessage());
        }
    }

    @Test
    public void add_inserts_value_to_given_index_of_list() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Anu");
        list.add("Syani");
        list.add("anjaly");
        list.add(2, "shibi");
        assertEquals("shibi", list.get(2));
    }

    @Test
    public void size_gives_the_size_of_the_list() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2, 5);
        assertEquals(4, list.size());
    }

    @Test
    public void get_should_give_the_value_of_given_index() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2, 4);
        assertEquals(3, (int) list.get(3));
    }

    @Test
    public void get_should_throw_an_exception_if_the_given_index_can_not_be_accessed() {
        try{
            LinkedList<Integer> list = new LinkedList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(2, 4);
            list.get(6);
        }catch (Exception e){
            String expected = "Size is 4 you can't access the element from 6";
            assertEquals(e.getMessage(),expected);
        }
    }

    @Test
    public void addLast_inserts_value_to_the_end_of_the_list() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Anu");
        list.add("Syani");
        list.add("anjaly");
        list.addLast("shibi");
        assertEquals("shibi", list.get(3));
    }

    @Test
    public void hasNext_should_return_true_if_index_is_less_than_size() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Anu");
        list.add("Syani");
        list.add("anjaly");
        list.addLast("shibi");
        MyInterface itr = list.iterator();
        assertEquals(true, itr.hasNext());
    }

    @Test
    public void hasNext_should_return_false_if_index_is_less_than_size() {
        LinkedList<String> list = new LinkedList<>();
        MyInterface itr = list.iterator();
        assertEquals(false, itr.hasNext());
    }

    @Test
    public void next_should_return_next_value() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Anu");
        list.add("Syani");
        list.add("anjaly");
        list.addLast("shibi");
        MyInterface itr = list.iterator();
        assertEquals("Anu", itr.next());
    }

}
