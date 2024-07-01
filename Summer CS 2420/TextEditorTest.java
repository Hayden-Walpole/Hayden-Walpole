package assign06;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class contains tests for TextEditor class
 *
 * @author
 * @version June 18, 2024
 */
class TextEditorTest {
    private TextEditor t, t2, simpleEditor;
    Edit a0 = new Edit('a', 0, Edit.INSERT);
    SinglyLinkedList<Edit> h = new SinglyLinkedList<>();

    @BeforeEach
    void setUp() {
        t = new TextEditor();
        h.insert(0, a0); // earlist
        h.insert(1, new Edit('b', 1, Edit.INSERT)); // last
        h.insert(2, new Edit('c', 2, Edit.INSERT)); 
        h.insert(3, new Edit('d', 3, Edit.INSERT)); 
        h.insert(4, new Edit('e', 4, Edit.INSERT)); 
        h.insert(5, new Edit('f', 5, Edit.INSERT)); 
        h.insert(6, new Edit('g', 6, Edit.INSERT)); 
        h.insert(7, new Edit('h', 7, Edit.INSERT)); 
        h.insert(8, new Edit('i', 8, Edit.INSERT)); // current
        t2 = new TextEditor(h);
        simpleEditor = new TextEditor(); 
        simpleEditor.insert('a',0);
    	simpleEditor.insert('b',1);
    	simpleEditor.insert('c',2);
        
    }

    @Test
    void t2HistoryTest() {
    	int hSize = h.size();
    	assertEquals(hSize,t2.history().size());
    	for(int i=0;i<h.size();i++)
    	assertEquals(h.get(i),t2.history().get(i));
    }
    
    @Test
    void tHistoryTest() {
    	assertEquals(0,t.history().size());
    }
    
    @Test
    void insertSimpleTest() {
    	t.insert('a',0);
    	assertEquals("a",t.toString());
    	t.insert('b',1);
    	t.insert('c',2);
    	assertEquals("abc",t.toString());
    }
    
    @Test
    void insertFirstTest() {
    	t.insert('a',0);
    	assertEquals("a",t.toString());
    	t.insert('b',0);
    	t.insert('c',0);
    	assertEquals("cba",t.toString());
    }
    
    @Test
    void insertmiddleTest() {
    	assertEquals("abc",simpleEditor.toString());
    	simpleEditor.insert('w', 1);
    	assertEquals("awbc",simpleEditor.toString());
    }
    	
    @Test
    void insertOutofBoundsTestHigh() {
    	assertThrows(IndexOutOfBoundsException.class, () -> {t.insert('a', 1);});
    }
    
    @Test
    void insertOutofBoundsTestlow() {
    	t.insert('a', 0);
    	t.insert('b', 1);
    	assertThrows(IndexOutOfBoundsException.class, () -> {t.insert('a', -1);});
    }

    @Test
    void removeSimpleFirstTest() {
    	assertEquals("abc",simpleEditor.toString());
    	simpleEditor.remove(0);
    	assertEquals("bc",simpleEditor.toString());
    	simpleEditor.remove(0);
    	assertEquals("c",simpleEditor.toString());
    }
    
    @Test
    void removeSimplelastTest() {
    	assertEquals("abc",simpleEditor.toString());
    	simpleEditor.remove(2);
    	assertEquals("ab",simpleEditor.toString());
    	simpleEditor.remove(1);
    	assertEquals("a",simpleEditor.toString());
    }
    
    @Test
    void UndoSimpleTest() {
    	assertEquals("abc",simpleEditor.toString());
    	simpleEditor.remove(0);
    	assertEquals("bc",simpleEditor.toString());
    	simpleEditor.undo();
    	assertEquals("abc",simpleEditor.toString());
    }
    
    
    @Test
    void MultipleUndoTest() {
    	assertEquals("abc",simpleEditor.toString());
    	simpleEditor.remove(0);
    	assertEquals("bc",simpleEditor.toString());
    	simpleEditor.undo();
    	assertEquals("abc",simpleEditor.toString());
    	simpleEditor.undo();
    	assertEquals("bc",simpleEditor.toString());
    	simpleEditor.undo();
    	assertEquals("abc",simpleEditor.toString());
    	simpleEditor.undo();
    	assertEquals("bc",simpleEditor.toString());
    }
    
}