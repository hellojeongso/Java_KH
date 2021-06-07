
DROP TABLE ADDRESS;

-- 이름 전화번호 주소 이메일
CREATE TABLE ADDRESS(
	NAME VARCHAR2(20),
	PHONE VARCHAR2(20),
	ADDR VARCHAR2(100),
	EMAIL VARCHAR2(40)
);

INSERT INTO ADDRESS
VALUES('KH', '010-0000-0000', '서울시 강남구', 'KH@KH.COM');

SELECT NAME, PHONE, ADDR, EMAIL
FROM ADDRESS;