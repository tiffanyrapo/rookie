/**TODO:
1.取得salary最大/最小者
2.取得各city居住人數　*
3.各部門總salary及其平均
4.算出salary介於40000~60000人數
5.列出mail屬於edu
6.算出男女平均salary
7.列出無人居住之city
*/

1.
SELECT MAX(SALARY_ )
AS 薪資最大值, MIN(SALARY_ ) AS 薪資最小值 FROM MOCK_DATA_PERSON ;

2.
SELECT COUNT(MOCK_DATA_PERSON .CITY_ ),MOCK_DATA_PERSON .CITY_ ,MOCK_DATA_CITY .NAME_   FROM MOCK_DATA_PERSON
INNER JOIN MOCK_DATA_CITY  ON MOCK_DATA_PERSON .CITY_ =MOCK_DATA_CITY .ID_ GROUP BY MOCK_DATA_PERSON .CITY_ ;

SELECT COUNT(MOCK_DATA_PERSON .CITY_ ),MOCK_DATA_PERSON .CITY_ ,MOCK_DATA_CITY .NAME_   FROM MOCK_DATA_PERSON
RIGHT JOIN MOCK_DATA_CITY  ON MOCK_DATA_PERSON .CITY_ =MOCK_DATA_CITY .ID_ GROUP BY MOCK_DATA_PERSON .CITY_,MOCK_DATA_CITY .NAME_ ;


3.
SELECT DEPT_ , SUM(SALARY_ ),AVG(SALARY_ ) FROM MOCK_DATA_PERSON  GROUP BY DEPT_;

4.
SELECT COUNT(SALARY_ ) FROM MOCK_DATA_PERSON WHERE SALARY_ BETWEEN 40000 AND 60000;

5./** % 是萬用字元 代表 任意長度的任意字;
      % →不限長度的任意字
      _ →長度為1的任意字 eg. _ack  代表撈出所有包含ack的欄位*/
SELECT *  FROM MOCK_DATA_PERSON WHERE EMAIL_  LIKE  '%edu%';

6.
SELECT AVG(SALARY_ ) FROM MOCK_DATA_PERSON  GROUP BY GENDER_ ;

7.
SELECT MOCK_DATA_PERSON .CITY_ ,MOCK_DATA_PERSON .ID_  FROM MOCK_DATA_PERSON INNER JOIN MOCK_DATA_CITY ON MOCK_DATA_PERSON .CITY_  = MOCK_DATA_CITY .ID_  ;

SELECT DISTINCT( MOCK_DATA_PERSON .CITY_ ),MOCK_DATA_PERSON .ID_  FROM MOCK_DATA_PERSON INNER JOIN MOCK_DATA_CITY ON MOCK_DATA_PERSON .CITY_  = MOCK_DATA_CITY .ID_  ;


SELECT * FROM MOCK_DATA_CITY  ;