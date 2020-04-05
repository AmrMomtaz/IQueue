package eg.edu.alexu.csd.datastructure.queue.cs_53_79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LQueue_Tests 
{

	@Test
	void test1() 
	{
		LQueue queue = new LQueue();
		assertEquals(0,queue.size());
		assertEquals(true,queue.isEmpty());
		for (int i = 0 ; i < 5 ; i ++)
		{
			queue.enqueue(i);
		}
		assertEquals(5,queue.size());
		for (int i = 0 ; i < 4 ; i ++)
		{
			assertEquals(i,queue.dequeue());
		}
		assertEquals(false,queue.isEmpty());
		assertEquals(1,queue.size());
		for (int i = 5; i < 10;i++)
		{
			queue.enqueue(i);
		}
		assertEquals(6,queue.size());
	}
	@Test
	void test2()
	{
		LQueue queue = new LQueue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		assertEquals(4,queue.size());
		queue.enqueue(5);
		assertEquals(5,queue.size());
		assertEquals(false,queue.isEmpty());
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(6);
		queue.enqueue(7);
		assertEquals(5,queue.size());
		queue.dequeue();
		queue.enqueue(8);
	}
	@Test
	void test3()
	{
		//UnderFlow error test
		LQueue queue = new LQueue ();
		queue.enqueue("Egypt");
		queue.enqueue("France");
		assertEquals(2,queue.size());
		assertEquals("Egypt",queue.dequeue());
		queue.enqueue("Germany");
		queue.enqueue("Spain");
		for (int i = 0 ; i < 3 ; i++)
		{
			queue.dequeue();
		}
		assertEquals(true,queue.isEmpty());

		Exception IllegalArgumentException = assertThrows(IllegalArgumentException.class, () -> 
	    {
			queue.dequeue();
		});
	    String actualMessage = IllegalArgumentException.getMessage();
	    String expectedMessage = "Queue UnderFlow";
	    assertTrue(actualMessage.contains(expectedMessage));
	}

}
