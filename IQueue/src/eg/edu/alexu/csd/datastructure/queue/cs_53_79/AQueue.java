package eg.edu.alexu.csd.datastructure.queue.cs_53_79;

public class AQueue implements IQueue , IArrayBased
{
	int CAPACITY;
	int size,f,r;
	Object stack [];
	//I used circular array and I kept tracking the size to know if the Queue is empty or full
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
		if (size == CAPACITY)throw new IllegalArgumentException ("Queue OverFlow");
		stack[r]=item;
		size++;
		r = (r+1)%CAPACITY;
	}

	@Override
	public Object dequeue() 
	{
		if (isEmpty())throw new IllegalArgumentException ("Queue UnderFlow");
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