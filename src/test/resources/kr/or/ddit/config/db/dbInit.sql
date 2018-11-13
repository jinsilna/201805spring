--운영db에는 없는테이블
select * from notexistsinprd;

--테스트코드가 실행되기전 rangers 데이터 삭제
delete from rangers;

-- rangers 초기 데이터 3건 입력하기 
insert into rangers values('brown', '브라운');
insert into rangers values('sally', '샐리');
insert into rangers values('cony', '코니');

-- jspuser 
delete from jspuser;

-- jspuser 데이터 초기화 
insert into jspuser values ('brown','비라운','brownpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/08/08','brown@gmail.con','123123123','/profile/강동원.jpg');
insert into jspuser values ('sally','샐리','sallypass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/04/27','sally@gmail.con','123123123','');
insert into jspuser values ('cony','코니','conypass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/08/08','cony@gmail.con','123123123','');
insert into jspuser values ('moon','문','moonpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/06','moon@gmail.con','123123123','');
insert into jspuser values ('james','젬젬젬젬','jamespass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','88/08/08','james@gmail.con','123123123','');
insert into jspuser values ('xxxx1','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx2','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx3','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx4','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx5','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx6','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx7','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx8','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx9','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx10','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx11','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx12','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx13','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx14','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx15','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx16','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx17','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx18','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx19','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx20','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx21','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx22','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx23','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx24','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx25','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx26','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx27','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx28','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx29','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx30','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx31','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx32','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx33','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx34','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx35','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx36','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx37','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx38','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx39','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx40','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx41','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx42','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx43','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx44','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx45','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx46','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx47','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx48','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx49','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx50','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx51','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx52','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx53','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx54','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx55','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx56','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx57','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx58','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx59','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx60','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx61','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx62','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx63','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx64','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx65','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx66','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx67','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx68','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx69','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx70','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx71','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx72','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx73','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx74','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx75','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx76','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx77','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx78','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx79','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx80','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx81','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx82','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx83','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx84','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx85','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx86','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx87','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx88','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx89','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx90','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx91','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx92','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx93','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx94','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx95','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx96','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx97','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx98','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx99','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('xxxx100','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/26','xxxx@gmial.com','123123123','');
insert into jspuser values ('brownc','바바바바바dfdf','brownpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/08/08','brown@gmail.con','123123123','');
insert into jspuser values ('sally11','샐리','gg','대전서구괴정동','경성스포츠 ','33333','88/08/08','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('sallyww','샐리','gg','대전서구괴정동','경성스포츠 ','33333','88/08/08','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('sally434','샐리','gg','대전서구괴정동','경성스포츠 ','33333','88/08/08','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('sallyfdf','샐리','gg','대전서구괴정동','경성스포츠 ','33333','88/08/08','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('sally456456456','샐리','gg','대전서구괴정동','경성스포츠 ','33333','88/08/08','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('eeeeeeeee','샐리','gg','대전서구괴정동','경성스포츠 ','33333','88/08/08','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('123123123123','ㅎ후후후후','gg','대전서구괴정동','경성스포츠 ','33333','88/08/08','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('공유','샐리','gg','대전서구괴정동','경성스포츠 ','33333','88/08/08','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('solt','샐리','gg','대전서구괴정동','경성스포츠 ','33333','88/08/08','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('dfdfdfdfdf','어아','gg','대전서구괴정동','경성스포츠 ','33333','18/10/06','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('hohohoho','유승호이이ㅇㅇㅇ','gg','대전서구괴정동','경성스포츠 ','33333','88/08/08','skwlstlf@gmail.com','01011111111','');
insert into jspuser values ('ccccccccc','주원주원주원111','gg','대전서구괴정동','경성스포츠 ','33333','18/10/18','skwlstlf@gmail.com','01011111111','');


-- 월 단위 달력 생성 데이터 초기화
delete from calender where ymd like '201811%';







