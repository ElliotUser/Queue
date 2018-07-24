package exc03;

public class PriorityQueue {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQueue(int maxSize){
        this.maxSize = maxSize;
        queArray = new long[this.maxSize];
        nItems = 0;
    }

    public void insert(long item){
        int j;

        if (nItems == 0)
            queArray[nItems++] = item;
        else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j])
                    queArray[j+1] = queArray[j];
                else
                    break;
            }
            queArray[j+1] = item;
            nItems++;
        }
    }

    public long remove(){
        return queArray[--nItems];
    }

    public long peekMin(){
        return queArray[nItems-1];
    }

    public long peekMax(){
        return  queArray[nItems-nItems];   //мдаааа лажа, но работает ВЕДЬ ахахахха
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }











}
