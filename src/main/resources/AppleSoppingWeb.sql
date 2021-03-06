
CREATE DATABASE AppleShoppingWeb;

CREATE TABLE  APPLE_COMMODITY_(
    COMM_NUMBER_ SUBSTRING ,
    COMM_NAME_ varchar(255) ,
    COMM_BOOKAUTHOR_ SUBSTRING ,
    COMM_PRESS_ SUBSTRING ,
    COMM_PUBLISH_ DATE ,
    COMM_PRICE_ INT(30),
    COMM_STOCOMM_STOCK_ NUMBER(255),
    COMM_ADDEDTIME_ TIMESTAMP ,
    COMM_DISMOUNTED_TIME_ TIMESTAMP ,
    COMM_ARCHIVE_TIME_ TIMESTAMP ,
    COMM_ARCHIVER_ SUBSTRING ,
    COMM_ISBN_ SUBSTRING

    CONSTRAINT PK_COMMODITY PRIMARY KEY (COMM_NUMBER),
    FOREIGN KEY (COMM_ARCHIVER_) REFERENCES APPLE_MEMBER_(MEMB_ID_),
);

CREATE TABLE APPLE_MEMBER_(
    MEMB_ID_ SUBSTRING ,
    MEMB_ACCOUNT_ SUBSTRING ,
    MEMB_PASSWORD SUBSTRING ,
    MEMB_EMAIL_ SUBSTRING ,
    MEMB_PHONE_ SUBSTRING ,
    MEMB_REGISTER_TIME_ TIMESTAMP ,
    MEMB_ADMIN_ BOOLEAN,

    CONSTRAINT PK_MEMBER PRIMARY KEY(MEMB_ID_);
    FOREIGN KEY()
);

CREATE TABLE APPLE_SHOPPING_INVENTORY_(
    INVE_ID_ SUBSTRING ,
    INVE_LIST_ID_ SUBSTRING,
    INVE_NUMBER_ SUBSTRING ,

    CONSTRAINT PK_SHOPPING_INVENTORY PRIMARY KEY (INVE_ID_);
    FOREIGN KEY (INVE_NUMBER_) REFERENCES APPLE_COMMODITY_(COMM_NUMBER_),APPLE_SHOPPING_LIST(LIST_ID_),
);

CREATE TABLE APPLE_SHOPPING_LIST_(
    LIST_ID_ SUBSTRING ,
    LIST_MEMBER_ID_ SUBSTRING ,
    LIST_CHECKOUT_ BOOLEAN,
    LIST_ARRIVAL_ BOOLEAN,

    CONSTRAINT PK_SHOPPING_LIST PRIMARY KEY (LIST_ID_);
    FOREIGN KEY (LIST_MEMBER_ID_)REFERENCES APPLE_MEMBER_ (MEMB_ID_)
);

CREATE TABLE APPLE_DETAIL_ASSOCIATION_(
    ASSO_LIST_ID_ SUBSTRING ,
    ASSO_INVE_ID_ SUBSTRING ,

    CONSTRAINT PK_DETAIL_ASSOCIATION PRIMARY KEY (ASSO_LIST_ID_);
);

CREATE TABLE APPLE_RETURN_RECORD_(
    RETU_ID_ SUBSTRING ,
    RETU_LIST_ID_ SUBSTRING ,
    RETU_REASON_ SUBSTRING ,
    RETU_TIME_ TIMESTAMP ,
    RETU_REFUND_TIME_ TIMESTAMP ,
    RETU_CHECK_ BOOLEAN ,

    CONSTRAINT PK_RETURN_RECORD PRIMARY KEY(RETU_ID_);
);