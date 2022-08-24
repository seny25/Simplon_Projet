package Dao;

import java.util.List;

public interface InterfaceDao<T ,Long> {
	void save(T t);
	T show(Long id);
	void delete(Long id);
	void update(Long id);
	List<T>find_ALL();

}
