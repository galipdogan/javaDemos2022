package kodlama.io.dataAccess.category;

import kodlama.io.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		 System.out.println("Jdbc ile veritabanina eklendi. "+ category.getName());
	}

}
