package queue;

public class Main {

	public static void main(String[] args) {
		Queue q= new Queue();
		q.Enqueue(10);
		
		q.Enqueue(20);
		
		q.Enqueue(30);
		
		q.Enqueue(40);
		
		q.Enqueue(50);
		
	q.Display();
	q.Dequeue();
	q.Display();
		
	}

}


class Queue{
	int arr[] = new int[5];
	int front = -1;
	int rear = -1;
	
	
	void Enqueue(int data) {
		if(rear ==arr.length-1) {
			System.out.println("Queue is full");
		}
		else if(rear==-1 && front==-1) {
			rear=0;
			front=0;
			arr[rear]=data;
		}
		else {
				rear=rear+1;
				arr[rear]=data;
		}
	}
	
	void Dequeue() {
		if(front==-1 && rear==-1) {
			System.out.println("Queue is empty");
			
		}
		else if(front==rear) {
			System.out.print(arr[rear]);
			front=-1;
			rear=-1;
		}
		else {
			System.out.print(arr[front]);
			front = front+1;
		}
	} 
	
	void Display() {
		if(rear==-1 && rear ==-1) {
			System.out.println("Queue is empty!");
			}
		else {
			for(int i = front;i<=rear;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	void Peek() {
		if(front==-1) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.print(arr[front]);
		}
	}
}
