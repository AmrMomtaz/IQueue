package eg.edu.alexu.csd.datastructure.queue.cs_53_79;

public class AQueue implements IQueue , IArrayBased
{
	int CAPACITY;
	int size,f,r;
	Object stack [];
	
	AQueue (int capacity)
	{
		CAPACITY = capacity;
		stack = new Object [CAPACITY];
		size = 0;
		f=0;
		r=0;
	}
	
	@Override
	public void enqueue(Object item) 
	{
		if (size == CAPACITY)throw new IllegalArgumentException ("The stack is full");
		stack[r]=item;
		size++;
		r = (r+1)%CAPACITY;
	}

	@Override
	public Object dequeue() 
	{
		if (isEmpty())throw new IllegalArgumentException ("The stack is empty");
		Object element = stack[f];
		stack[f]=null;
		f = (f+1)%CAPACITY;
		size--;
		return element;
	}

	@Override
	public boolean isEmpty() 
	{
		return (size==0);
	}

	@Override
	public int size()
	{
		return size;
	}

}
