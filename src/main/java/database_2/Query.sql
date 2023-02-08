CREATE DATABASE testing_db;

USE testing_db;

CREATE TABLE TestTable (
    Tanggal VARCHAR(100),
    Choice VARCHAR(1)
) ENGINE = InnoDB;

INSERT INTO TestTable (Tanggal, Choice) values ("01/02/2008", "A");
INSERT INTO TestTable (Tanggal, Choice) values ("02/05/2008", "B");
INSERT INTO TestTable (Tanggal, Choice) values ("09/23/2008", "C");
INSERT INTO TestTable (Tanggal, Choice) values ("09/25/2008", "C");
INSERT INTO TestTable (Tanggal, Choice) values ("10/1/2008", "B");
INSERT INTO TestTable (Tanggal, Choice) values ("1/15/2009", "A");
INSERT INTO TestTable (Tanggal, Choice) values ("3/30/2009", "A");
INSERT INTO TestTable (Tanggal, Choice) values ("5/5/2009", "B");
INSERT INTO TestTable (Tanggal, Choice) values ("7/13/2009", "B");

SELECT Tahun, COUNT(A) AS A, COUNT(B) AS B, COUNT(C) AS C FROM (
    SELECT
        SUBSTRING(Tanggal, LENGTH(Tanggal) - 3, 4) AS Tahun,
        CASE WHEN Choice = "A" THEN Choice END AS A,
        CASE WHEN Choice = "B" THEN Choice END AS B,
        CASE WHEN Choice = "C" THEN Choice END AS C
    FROM TestTable
) AS FilteredTable GROUP BY Tahun ORDER BY Tahun ASC;
