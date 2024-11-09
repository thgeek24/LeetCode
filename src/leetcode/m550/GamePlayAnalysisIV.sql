WITH FirstLogin AS (SELECT player_id, MIN(event_date) AS first_login
                    FROM Activity
                    GROUP BY player_id)
SELECT ROUND(SUM(CASE
                     WHEN DATEDIFF(event_date, first_login) = 1
                         THEN 1
                     ELSE 0
    END) / COUNT(DISTINCT FirstLogin.player_id), 2) AS fraction
FROM Activity a
         JOIN FirstLogin ON a.player_id = FirstLogin.player_id;