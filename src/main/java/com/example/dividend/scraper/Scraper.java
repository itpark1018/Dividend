package com.example.dividend.scraper;

import com.example.dividend.model.Company;
import com.example.dividend.model.ScrapeResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapeResult scrap(Company company);
}
