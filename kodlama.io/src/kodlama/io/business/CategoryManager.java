package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.category.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	private Category[] categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.loggers = loggers;
		this.categoryDao = categoryDao;
	}

	public void add(Category category) throws Exception {
	        for (Category category1:categories)
	        {
	            if(category.getName().equals(category1.getName()){
	                throw new Exception("Kategori ismi daha once kayitli!");
	            }
	        }
		categoryDao.add(category);
		for (Logger logger : loggers) {// once database sonra mail yollandin
			logger.log(category.getName());
		}
	}
}
