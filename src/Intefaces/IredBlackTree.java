package Intefaces;

import java.util.List;

public interface IredBlackTree <T> {
	
	public  void insertar(T elemt);
	public void eliminar (T elemt);
	public List<T> getPreOrder();
	public boolean existe(T elemt);
    public T bsucar(T elemt);
    public T getRoot();
    public int getWeight();
    public int getHeight();
    public T getMin();
    public T getMax();
	

}
