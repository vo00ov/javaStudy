
/* Drop Tables */

DROP TABLE board1212 CASCADE CONSTRAINTS;
DROP TABLE member1212 CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE board1212
(
	no number NOT NULL,
	bTitle varchar2(100 char),
	bContent varchar2(255 char),
	nickName varchar2(20) NOT NULL,
	bTIme date NOT NULL,
	bWriterId varchar2(20 char) NOT NULL,
	PRIMARY KEY (no)
);


CREATE TABLE member1212
(
	userId varchar2(20 char) NOT NULL,
	userPw varchar2(20 char) NOT NULL,
	email varchar2(100 char) NOT NULL,
	PRIMARY KEY (userId)
);



/* Create Foreign Keys */

ALTER TABLE board1212
	ADD FOREIGN KEY (bWriterId)
	REFERENCES member1212 (userId)
;



