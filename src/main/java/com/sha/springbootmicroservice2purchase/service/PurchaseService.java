package com.sha.springbootmicroservice2purchase.service;

import com.sha.springbootmicroservice2purchase.model.Purchase;
import com.sha.springbootmicroservice2purchase.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PurchaseService{


    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}
