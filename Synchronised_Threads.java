package Thrusday_Lab;

	class Synchronised_Threads {
	    private int[] buffer;
	    private int size;
	    private int count;

	    public Synchronised_Threads(int size) {
	        this.size = size;
	        this.buffer = new int[size];
	        this.count = 0;
	    }

	    public synchronized void produce(int item) throws InterruptedException {
	        while (count == size) {
	            System.out.println("Buffer is full. Producer is waiting...");
	            wait();
	        }

	        buffer[count] = item;
	        count++;
	        System.out.println("Produced: " + item);
	        notify();  // Notify the consumer that data is available
	    }

	    public synchronized void consume() throws InterruptedException {
	        while (count == 0) {
	            System.out.println("Buffer is empty. Consumer is waiting...");
	            wait();
	        }

	        int item = buffer[count - 1];
	        count--;
	        System.out.println("Consumed: " + item);
	        notify();  // Notify the producer that space is available
	    }
	}

	class Producer extends Thread {
	    private Synchronised_Threads sharedResource;

	    public Producer(Synchronised_Threads sharedResource) {
	        this.sharedResource = sharedResource;
	    }

	    @Override
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            try {
	                sharedResource.produce(i);
	                Thread.sleep(1000); // Simulate some processing time
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

	class Consumer extends Thread {
	    private Synchronised_Threads sharedResource;

	    public Consumer(Synchronised_Threads sharedResource) {
	        this.sharedResource = sharedResource;
	    }

	    @Override
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            try {
	                sharedResource.consume();
	                Thread.sleep(1500); // Simulate some processing time
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

	
