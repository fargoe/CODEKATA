SELECT B.category, sum(BO.sales) AS TOTLE_SALES
FROM BOOK B LEFT JOIN BOOK_SALES BO ON B.book_id = BO.book_id
where BO.SALES_DATE LIKE '%2022-01%'
group by 1
order by b.category