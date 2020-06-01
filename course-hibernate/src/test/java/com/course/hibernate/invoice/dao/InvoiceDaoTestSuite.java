package com.course.hibernate.invoice.dao;

import com.course.hibernate.invoice.Invoice;
import com.course.hibernate.invoice.Item;
import com.course.hibernate.invoice.Product;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("car");
        Product product2 = new Product("plane");
        Product product3 = new Product("boat");

        Item item1 = new Item(new BigDecimal(123123), 4);
        Item item2 = new Item(new BigDecimal(422224), 1);
        Item item3 = new Item(new BigDecimal(300000), 2);
        Item item4 = new Item(new BigDecimal(500000), 1);
        Item item5 = new Item(new BigDecimal(50000), 10);

        Invoice invoice = new Invoice("54/23412");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product3);
        item5.setProduct(product1);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);

        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        invoiceDao.save(invoice);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);

        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
        itemDao.deleteAll();
        productDao.deleteAll();


    }
}
