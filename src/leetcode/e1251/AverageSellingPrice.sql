select product_id, round(sum(price * total) / sum(total), 2) as average_price

from (select p.product_id, p.start_date, p.end_date, p.price, sum(units) as total
      from Prices p
               left join UnitsSold u
                         on p.product_id = u.product_id
      where u.purchase_date >= p.start_date && u.purchase_date <= p.end_date
      group by start_date) as t

group by product_id