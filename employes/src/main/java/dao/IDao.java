package dao;

public interface IDao<T> {
	void save(T t);
	T show(Long id);
	void delete(Long id);

}
