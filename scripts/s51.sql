select region_name, country_count
from regions natural join (
    select region_id, count(rowid) country_count --rowid conta il nome delle colonne scarta i null 
    from countries
    group by region_id);
--possiamo pensare sia una piccola tabella temporanea sotto il join
--country_count è come se fosse "as country_count"