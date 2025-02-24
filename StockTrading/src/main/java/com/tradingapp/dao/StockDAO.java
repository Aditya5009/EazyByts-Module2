package com.tradingapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tradingapp.model.Stock;
@Repository

public interface StockDAO {
	public List<Stock> selectAllStocks();
	public  Stock getStockDetailsById(int id);
  public  double stockPriceById(int stockId);
  public  int buyStock(int userId, int stockId, int quantity, double price) ;
  public  int sellStock(int userId, int stockId, int quantity, double price) ;
  public List<Stock> filterAndSearchStocks(String filterCategory, String searchQuery) ;


}
