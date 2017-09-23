public interface Bag<P>

{
    int getCurrentSize( );
    boolean isEmpty( );
    boolean isFull( );
    boolean add (P num);
    boolean remove (P num);
    P remove( );
    void clear( );
    int getFrequencyOf(P num); 
    boolean contains(P num);
    String toString( );
    boolean equals(Object o);
}