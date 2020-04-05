package eg.edu.alexu.csd.datastructure.queue.cs_53_79;

public class LQueue implements IQueue , ILinkedBased
{
	QNode head,tail;
	int size;
	class QNode
	{
		QNode next;
		Object element;
		QNode()
		{
			next = null;
			element = null;
		}
		void set_element(Object e)
		{
			element=e;
		}
		Object get_element()
		{
			return element;
		}
		void set_next(QNode n)
		{
			next = n;
		}
		QNode get_next()
		{
			return next;
		}
	}
	LQueue()
	{
		head = null;
		tail = null;
		size = 0;
				
	}
	@Override
	public void enqueue(Object item) 
	{
		QNode new_node = new QNode();
		new_node.set_element(item);
		if (isEmpty()) 	head = new_node;
		else tail.set_next(new_node);
		tail = new_node;
		size++;
	}

	@Override
	public Object dequeue() 
	{
		if (isEmpty()) 	if (isEmpty())throw new IllegalArgumentException ("Queue UnderFlow");
		Object element = head.get_element();
		head.set_element(null);
		head = head.get_next();
		size--;
		return element;
	}

	@Override
	public boolean isEmpty() 
	{
		return (size ==0);
	}

	@Override
	public int size()
	{
		return size;
	}
	
}
