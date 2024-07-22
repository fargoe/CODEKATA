SELECT p.PRODUCT_CODE, sum(p.PRICE* o.sales_amount) as SALES
FROM PRODUCT p LEFT JOIN OFFLINE_SALE o ON p.product_id = o.product_id
group by 1
order by SALES desc, PRODUCT_CODE ASC