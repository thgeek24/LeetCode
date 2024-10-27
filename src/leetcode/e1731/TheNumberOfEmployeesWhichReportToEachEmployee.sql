select m.employee_id, m.name, count(*) as reports_count, round(avg(e.age)) as average_age
from Employees m
         inner join Employees e
                    on m.employee_id = e.reports_to
group by employee_id
order by employee_id;