public class OrderCollection implements Container{
    private OrderCake[] orders;

    public OrderCollection(OrderCake[] orders){
        this.orders = orders;
    }

    @Override
    public Iterator getIterator(){
        return new OrderIterator();
    }

    public class OrderIterator implements Iterator{
        private int position;
        
        public OrderIterator(){
            position = 0;
        }
        
        @Override  
        public boolean hasNext() {  
            if (position < orders.length){  
                return true;  
            }  
            return false;  
        }  
        @Override  
        public Object next() {  
            if(this.hasNext()){  
                return orders[position++];  
            }  
            return null;      
        }  
    }

}
