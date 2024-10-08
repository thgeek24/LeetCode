/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

select s.user_id, coalesce(round(confirm_count / total, 2), 0) as confirmation_rate
from (select user_id, count(*) as total, count(case when action = "confirmed" then 1 end) as confirm_count
      from Confirmations
      group by user_id) as t
         right join Signups s on t.user_id = s.user_id;