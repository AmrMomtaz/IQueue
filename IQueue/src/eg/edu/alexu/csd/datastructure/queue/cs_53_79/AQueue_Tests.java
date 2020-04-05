package eg.edu.alexu.csd.datastructure.queue.cs_53_79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AQueue_Tests 
{
	@Test
	void test1() 
	{
		AQueue queue = new AQueue(10);
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
		assertEquals(4,queue.f);
		assertEquals(0,queue.r);
		for (int i = 4 ; i < 10 ; i ++)
		{
			assertEquals(i,queue.dequeue());
		}
		assertEquals(0,queue.f);
		assertEquals(0,queue.r);
	}

}
