public class Queue {
    int size = 3;
    int arr[] = new int[size];
    int front=-1; 
    int end=-1;
    
    

    void enqueue(int addedNum){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if (front==-1){
                front=0;
            }
            end++;
            arr[end]= addedNum;
        }
    }
    public boolean isEmpty(){
        if(end== -1){
            return true;
        }
        return false;
    }

    public int dequeue(){
       if (isEmpty()){
        System.out.println("Queue is empty.");
        return(-1);
       } 
       else{
        int temp=arr[front];
        if (front>=end) {
            front =-1;
            end=-1;            
        }
        else{
            front++;
        }
        System.out.println(temp +" has been deleted from queue");
        return temp;
        }
}

    public boolean isFull(){
        if (front ==0 && end==size-1) {

            return true;
        }
        else{
            return false; 
        }
    }
    
    public void printQueue(){
        if (isEmpty()) {
            System.out.println("The Queue is empty.");
        }
        else{
            for(int i=front; i<=end;i++)
            {
                System.out.print(arr[i] +", ");
            }
        System.out.println();  
        }
    }

}