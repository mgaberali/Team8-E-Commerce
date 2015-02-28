package controller;

import bean.Category;
import bean.Product;
import dao.CategoryDao;
import dao.ProductDao;
import java.util.ArrayList;

public class ProductInformationController {

    private CategoryDao categoryDao;
    private static ProductInformationController INSTANCE = new ProductInformationController();
    private ProductDao productDao;

    private ProductInformationController() {

        categoryDao = CategoryDao.getInstance();
        productDao = ProductDao.getInstance();
    }

    public ArrayList<Category> getCategoriesWithProducts() {
        return null;
    }

    /**
     *
     * @param id
     */
    public Category getCategoryWithProducts(int id) {
        return null;
    }

    public static ProductInformationController getInstance() {
        return INSTANCE;
    }

    /**
     *
     * @param code
     * @return Product
     * Get product details from DB by it's code
     */
    public Product getProductDetails(int code) {
        
        // get froduct from DB by code
        Product product = productDao.findProduct(code);        
        return product;
    }

}
