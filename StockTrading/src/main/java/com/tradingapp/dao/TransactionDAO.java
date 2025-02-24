package com.tradingapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tradingapp.dto.TopStockDTO;
import com.tradingapp.model.Transaction;
@Repository

public interface TransactionDAO {
   public List<Transaction> getTransactionsByUserId(int userId);
   public List<Transaction> getLastFiveTransactionsByUserId(int userId);
   List<TopStockDTO> getTopBuyStocks();
   List<TopStockDTO> getTopSellStocks();
   List<TopStockDTO> getMostTradedStocks();
}