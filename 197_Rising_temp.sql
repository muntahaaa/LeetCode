SELECT 
id

FROM(
SELECT 
    id,
    temperature,
    LAG(temperature) OVER (ORDER BY recordDate) 
    AS previous_temperature
FROM Weather
)AS t
WHERE temperature> previous_temperature;
