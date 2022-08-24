package DAO1;

//public interface Dao {
	import java.sql.SQLException;

	public interface Dao {
		
		public void Create(Candidats candid); 
		public void Read(Candidats candid) ;
		public void Update(Candidats candid);
		public void Delete(Candidats candid);
		
	}


