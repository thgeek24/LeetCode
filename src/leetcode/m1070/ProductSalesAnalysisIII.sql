/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

-- Solution 1
with FirstYearSale as (select product_id, MIN(year) as first_year from Sales group by product_id)
select s.product_id, f.first_year, s.quantity, s.price
from Sales s
         inner join FirstYearSale f
                    on s.product_id = f.product_id and s.year = f.first_year;

-- Solution 2
SELECT product_id, year AS first_year, quantity, price
FROM Sales
WHERE (product_id, year) IN (
    SELECT product_id, MIN(year) AS year
    FROM Sales
    GROUP BY product_id
);