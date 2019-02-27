2019/01/16
/**創表*/

/**
創表有順序性，看FK(FOREIGN KEY)優先
 */
CREATE TABLE DEPT (
    DEPT_ID_ INT,
    DEPT_DESC_ VARCHAR(255),
    CONSTRAINT PK_DEPT PRIMARY KEY (DEPT_ID_)
);
CREATE TABLE PERSONS (
    PERSONS_ID_ INT,
    DEPT_ID_ INT,
    LAST_NAME_ VARCHAR(255),
    FIRST_NAME_ VARCHAR(255),
    ADDRESS_ VARCHAR(255),
    City_ VARCHAR(255),
    CONSTRAINT PK_Person PRIMARY KEY (PERSONS_ID_),
    CONSTRAINT FK_Pdept FOREIGN KEY (DEPT_ID_)
    REFERENCES DEPT(DEPT_ID_)
    );

/**新增*/
INSERT INTO PERSONS
VALUES (1,101, 'zhou','rainy' , 'No. 144 Taiyuan Road', 'Taichung');

INSERT INTO Persons (PERSONS_ID_,DEPT_ID_, LAST_NAME_,  FIRST_NAME_, ADDRESS_, City_)
VALUES (2,102, 'Zhou','Pinny', 'No. 144 Taiyuan Road', 'Taichung');

INSERT INTO PERSONS
VALUES (3,101, 'zhou','ALEX' , 'No. 144 Taiyuan Road', 'Taichung');

INSERT INTO Persons (PERSONS_ID_,DEPT_ID_, LAST_NAME_,  FIRST_NAME_, ADDRESS_, City_)
VALUES (4,102, 'Zhou','JOHN', 'No. 144 Taiyuan Road', 'Taichung');

INSERT INTO PERSONS
VALUES (5,102, 'zhou','MEI' , 'No. 144 Taiyuan Road', 'Taichung');

INSERT INTO Persons (PERSONS_ID_,DEPT_ID_, LAST_NAME_,  FIRST_NAME_, ADDRESS_, City_)
VALUES (6,101, 'Zhou','AJ', 'No. 144 Taiyuan Road', 'Taichung');

INSERT INTO Persons (PERSONS_ID_,DEPT_ID_, LAST_NAME_,  FIRST_NAME_, ADDRESS_, City_)
VALUES (7,102, 'Zhou','AJ', 'No. 144 Taiyuan Road', 'taipei');

INSERT INTO DEPT VALUES(101,'部門1');
INSERT INTO DEPT VALUES(102,'部門2');

/**刪除欄位*/
DELETE FROM Persons WHERE LAST_NAME_='zhou';

/**刪除表格 */
DROP TABLE PERSONS;

/**查詢*/
SELECT PERSONS_ID_,City_ FROM Persons;

/**修改*/
UPDATE Persons SET City_ = 'Miaoli', LAST_NAME_= 'test'
WHERE PERSONS_ID_ = 2;

SELECT * FROM PERSONS
WHERE NOT City_='Miaoli' ;

SELECT  * FROM PERSONS
WHERE City_ IS NOT NULL;


/**GROUP BY*/
SELECT LAST_NAME_,CITY_ FROM PERSONS
GROUP BY LAST_NAME_,CITY_ ;

/**
Inner JOIN的用法
AS(或空1格) = Table縮寫,
 */
SELECT A.*,B.DEPT_DESC_  描述 FROM PERSONS AS A /**  101*/
INNER JOIN DEPT AS B ON A.DEPT_ID_=B.DEPT_ID_;

SELECT A.*,B.DEPT_DESC_  描述 FROM PERSONS AS A
INNER JOIN DEPT AS B ON A.DEPT_ID_=B.DEPT_ID_;

SELECT * FROM DEPT;

SELECT * FROM PERSONS A,DEPT B WHERE A.DEPT_ID_=B.DEPT_ID_ ;

select * from MOCK_DATA_PERSON A,mock_data_dept B,MOCK_DATA_CITY C
WHERE A.CITY_=C.ID_ AND A.DEPT_=B.ID_;


/**
BETWEEN
數字、date、字串可用
 */
SELECT * FROM PERSONS
WHERE PERSONS_ID_  BETWEEN 3 AND 5;

SELECT * FROM PERSONS
WHERE FIRST_NAME_   BETWEEN 'SUNNY' AND 'AJ' ;

/*
left join
 */
SELECT * FROM persons
LEFT JOIN dept ON persons.dept_id_= dept.dept_id_;

/*
CREATE TABEL AS
 */
CREATE TABLE TABLE_NAME AS SELECT * FROM TABLE1

/*
subquery
查出最多人居住城市名稱
 */
SELECT * FROM MOCK_DATA_CITY
WHERE ID_=(
SELECT CITY_  FROM MOCK_DATA_PERSON GROUP BY CITY_
ORDER BY COUNT(CITY_)  DESC LIMIT 1);
/*
inner join
 */
SELECT  C.NAME_ FROM MOCK_DATA_PERSON A,MOCK_DATA_CITY C
WHERE A.CITY_=C.ID_
GROUP BY C.NAME_
ORDER BY COUNT(C.NAME_) DESC LIMIT 1;

/**
view 視觀表
 */
CREATE VIEW view_mock_data_person AS
SELECT * FROM mock_data_person
WHERE dept=2;


