public class ArrayBag<O> implements Bag<P> {

    O[] list;
    int count;
    
    
    public ArrayBag(){
    list = (O[])new Object[50];
    }
    
    public ArrayBag(int num){
    list = (O[])new Object[num];
    }
    @Override
    public int getCurrentSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if(count==0)
            return true;
        return false;             
    }

    @Override
    public boolean isFull() {
        if(count == list.length)
            return true;
        return false;
    }

    @Override
    public boolean add(O num) {
       if(isFull())
           increaseArray(2);
       list[count]=num;
       count++;
       return true;  
    }

    private void increaseArray(int num){
       O[] temp = list;
       list = (O[])new Object[num*list.length];
       for(int i=0;i<temp.length;i++)
       {
            list[i]=temp[i];
       }
       temp = null;
    }
    @Override
    public boolean remove(O num) {
        boolean flag=true;
       for(int i=0; i<list.length;i++)
       {
          if (list[i]== num)
          {
              list[i]= null;
              count--;
              return flag; 
           }
          else if(i==list.length-1){
          flag = false;
          }    
       }
       return flag;
    }

    @Override
    public O remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFrequencyOf(O num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(O num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
