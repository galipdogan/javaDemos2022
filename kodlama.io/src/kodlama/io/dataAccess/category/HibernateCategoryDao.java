package kodlama.io.dataAccess.category;

import kodlama.io.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veritabanina eklendi. " + category.getName());
	}

}
