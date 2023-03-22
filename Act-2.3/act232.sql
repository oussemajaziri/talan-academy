
\c db_oussema;


CREATE TYPE grp AS ENUM ('staff','student','other');


CREATE TABLE ft_table (
	id BIGSERIAL NOT NULL PRIMARY KEY,
	login VARCHAR(50) NOT NULL DEFAULT 'toto',
	groupe grp NOT NULL,
	date_de_creation DATE NOT NULL
);




