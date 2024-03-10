# Alcohol Hub(Ahub Project)

이미지 추가 필요 
이미지 추가 필요

### 팀명: 불4조(Team Phoenix)
### 팀원

- 팀원 : **백동현**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">]

- 팀원 : **손세림**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">]

- 팀원 : **송동준**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/dongjunsong)

- 팀원 : **양지혜**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">]

- 팀원 : **정태원**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/t4e1)

---

# 제안요청서

# 1. 프로젝트 개요

 Alcohol Hub 프로젝트(이하 Ahub)는 COVID-19 이후 급격하게 성장하는 수입 주류 시장에 발맞춰, 주종별로 폐쇄적인 환경에서 운영되던 기존의 커뮤니티들과 달리, 수입 주류 전반에 걸쳐 행사와 이벤트 정보를 제공하는 서비스 입니다.   

## 1-1 필요성
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/9d3ce8dd-9469-42fa-97d6-83d1511b95e7)
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/cf754126-a85a-4f27-89e7-bff0cf64f4e9)


 관세청에서 제공한 수입 주류 수입액 통계에 의하면, 2019년 코로나19 발생 이후 수입 주류에 대한 수요는 꾸준히 증가하고 있다는 사실을 확인할 수 있습니다. 기존의 소주와 맥주 위주로 소비되던 주류 시장에서, 2030 세대를 기준으로 와인과 위스키 등 수입 주류 시장으로 주류 소비의 트렌드가 확장되고 있으며, 이는 현재 하이볼이나 칵테일의 유행으로 알 수 있듯이 하나의 주종(酒種)으로서의 유행이 아니라 믹솔로지(Mixology)라는 새로운 트랜드와 맞닿아 있는 하나의 흐름인 것을 확인할 수 있습니다. <br>
 하지만 커져가는 시장 규모와 달리 수입 주류 정보를 얻을 수 있는 행사에 대한 정보를 얻을 수 있는 사이트는 주류 별로 제한되어 있고, 사용자들의 니즈를 충족하기 위해서는 이를 통합적으로 관리하여 정보를 제공할 수 있는 사이트의 필요성이 새로이 제시되고 있습니다. 


# 2. 프로젝트 작업 범위

Ahub 프로젝트의 산출 결과물은 다음과 같습니다.

- 요구사항 명세서 : 프로젝트의 요구사항을 정리하여 기능별로 분류해둔 문서 
- 도메인 기반 개발(DDD) Context-map : 프로젝트의 기능을 도메인으로 나누고, 생성된 도메인을 중요도에 따라 핵심,지원,일반으로 분류 
- 데이터베이스 논리/물리모델 : 프로젝트에 사용할 데이터베이스 생성을 위해 
- 웹 어플리케이션 실행 파일 : 실제 기능들이 구현되는 프로젝트 파일   
- 테스트 케이스 정의서: 요구사항에 해당하는 테스트를 작성 및 진행, 해당 결과를 보여주는 문서 
- REST-API 명세서: REST-API의 테스트 결과를 보여주는 문서 

## 2-1 추진 계획

*테이블 1: 추진체계*

| 구분 | 조직 | 주요 역할 |
| --- | --- | --- |
| 주관 | 불4조 (Team Phoenix) | 백엔드 프로젝트 |
| 지원기관 | 한화시스템x엔코아 | 장비 지원 및 퀄리티 점검 |

프로젝트 일정: 2024-02-26 ~ 2024-03-11

작업 공간: 서울 동작구 보라매로 SFC빌딩, 원격 소통

기술 스택: 
MariaDB 10.6, OpenJDK 17.0.7, Spring Boot Framework 3.0.3, Spring security 6 <br>
Spring Data JPA, MyBatis, Spring Cloud Gateway 

## 2-2  일정관리 (WBS)
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/3437f986-b25e-4e4f-8947-75a3a5a241d1)



# 3. 프로젝트 설계

프로젝트 설계 항목에서는 프로젝트 기능 구현에 필요한 요구사항 파악과, 해당 요구사항을 구현하기 위한 프로젝트의 설계를 확인할 수 있습니다. 

## 3-1 요구사항 명세서
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/55bcfeee-ae16-4494-b1d2-9e8ca0dee02d)

    
## 3-2. DDD Context map
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/b6a80658-3d07-4161-b46c-78e96c188ae9)


## 3-3 DB 모델링
-  DA# 논리 모델 

![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/ac63be56-bcb9-4715-921d-21f4c9ccf151)

- DA# 물리 모델

![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/092dabe3-8721-4ef9-9dbc-d9867ba43579)

## 3-4 네트워크 아키텍처 
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/b820bcc8-b244-4d03-86a3-5b6ac8da2230)

## 4-테스트

- **TESTCASE Definition Table**

![7 pic](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/35d855bb-5753-457f-828d-25ca70d49449)

<details>
<summary>TC_001</summary>
<br/>

- **실행 화면**

![TC001](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/cfc25f5b-c2e8-4570-b9f4-02a93c8dda57)

- **쿼리문**

```sql
SELECT * FROM Member;

INSERT INTO Member (
  Member_ID, Member_name, Member_nickname, Member_password
, Member_email, Member_phoneNum, Member_address, Member_birth
, Member_sign_up_date, Member_coupon, Dealer_company, Dealer_region
, Dealer_grade, Member_type, Member_blacklist, Restriction_date
, Restriction_end_date, Login_fail_stack, Report_issue_stack
, Login_restriction_check, Member_withdraw_check, Member_withdraw_date 
)
VALUES 
(
  NULL, 'test','test_nick','test_passwd'
, 'test@gmail.com','010-5678-1234','서울','2023-1-1 00:00:00'
, NOW(), NULL, 'test_company', 'test_region'
, 1, 1,	NULL, NULL
, NULL,	NULL, NULL
, NULL, 0, NULL 
);

SELECT * FROM Member;
```

- **실행 결과**

</details>

<details>
<summary>TC_002</summary>
<br/>

- **실행 화면**

![TC002](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/ce509b73-3b04-4bf9-9b69-d407e2cd350a)

- **쿼리문**

```sql
SELECT  
       Member_id
     , Member_withdraw_check 
     , Member_withdraw_date
  FROM Member 
 WHERE Member_id = 4;
	
UPDATE
       Member
   SET Member_withdraw_check=1
     , Member_withdraw_date=NOW()
 WHERE Member_id = 4;

SELECT  
       Member_id
     , Member_withdraw_check 
     , Member_withdraw_date
  FROM Member 
 WHERE Member_id = 4;
```

- **실행 결과**

</details>

<details>
<summary>TC_003</summary>
<br/>

- **실행 화면**

![TC003](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/f6ed9c81-57fc-412f-af00-8ed0a142f636)

- **쿼리문**

```sql
SELECT * FROM Login_log;

INSERT INTO Login_log
(
  Success_check, Attempt_date, Attempt_time, Attempt_IP, Member_ID
)
Values
(
  1, NOW(), NOW(), '서울', 1
);

SELECT * FROM Login_log;
```

- **실행 결과**

</details>

<details>
<summary>TC_004</summary>
<br/>

- **실행 화면**

![TC004](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/ec69b70e-96c1-4088-8e12-96c122d35e2e)

- **쿼리문**

```sql
DELIMITER //

CREATE OR REPLACE TRIGGER LOGIN_FAIL_TR
    AFTER INSERT 
    ON Login_log
    FOR EACH ROW
BEGIN 
    IF NEW.Success_check = 0 THEN
        UPDATE Member
           SET Login_fail_stack = Login_fail_stack + 1
         WHERE Member_id = New.Member_id; 
    END IF;
END//
 
DELIMITER;

SELECT * FROM Login_log;

SELECT
       Member_id
     , Login_fail_stack
  FROM Member;

INSERT INTO Login_log
(
  Success_check, Attempt_date, Attempt_time, Attempt_IP, Member_ID
)
VALUES
(
  0, NOW(), NOW(), '서울', 1
);

SELECT * FROM Login_log;

SELECT
       Member_id
     , Login_fail_stack
  FROM Member;

SELECT * FROM Member;
```

- **실행 결과**

</details>

<details>
<summary>TC_005</summary>
<br/>

- **실행 화면**

![TC005](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/0a87b591-562e-48bd-ad1b-cf0c0e7e4f85)

- **쿼리문**

```sql
SELECT
       Member_id
     , Member_password
  FROM Member
 WHERE Member_id = 5;

UPDATE
       Member
   SET Member_password='updatetest'
 WHERE Member_id = 5;

SELECT
       Member_id
     , Member_password
  FROM Member
 WHERE Member_id = 5;
```

- **실행 결과**

</details>

<details>
<summary>TC_006</summary>
<br/>

- **실행 화면**

![TC006](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/05552cbf-918c-47a3-a768-10a1f272b91d)

- **쿼리문**

```sql
SELECT 
       Member_id, Member_nickname, Member_email
     , Member_Phonenum, Member_address 
  FROM Member 
 WHERE Member_id = 5;

UPDATE
       Member
   SET Member_nickname='testnickname'
     , Member_email='updatetest@gmail.com'
     , Member_phonenum='010-8888-8888'
     , Member_address='광주'
 WHERE Member_id = 5;

SELECT 
       Member_id, Member_nickname, Member_email
     , Member_Phonenum, Member_address 
  FROM Member 
 WHERE Member_id = 5;
```

- **실행 결과**

</details>

<details>
<summary>TC_007</summary>
<br/>

- **실행 화면**

![TC007](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/a8ca0b29-1588-467c-a07d-ebab2b2bb4f4)

- **쿼리문**

```sql
SELECT 
       b.Member_name, a.Review_grade, a.Review_contents 
  FROM Review a
  JOIN Member b ON a.dealer_id = b.Member_id
 WHERE a.dealer_id = 2;
```

- **실행 결과**

</details>

<details>
<summary>TC_008</summary>
<br/>

- **실행 화면**

![TC008](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/b529ec8e-ae8c-4f6b-be7f-07cbbc90b896)

- **쿼리문**

```sql
SELECT * FROM Car;
SELECT * FROM Ownership_history;
SELECT * FROM Accident_history;
SELECT * FROM Inundation;

-- Transaction 시작
START TRANSACTION;

-- 예시: 자동차 정보 삽입
INSERT INTO Car
(
  Car_ID, Car_field, Car_model, Car_year, Car_mileage, Car_condition
, Car_transmission, Car_oiltype, Car_engine, Car_fuel_efficiency
, Accident_check, Inundation_check, Selling_price, Picture_URL
, Picture_origin, Picture_rename, Model_ID, Insepction_record_URL
)
VALUES 
(
  99, 'Hyundai', 'Sonata', 2019, 50000, 'Good', 'Automatic'
, 'Gasoline', '2.0L', 15, 0, 0, 20000, '/images/sonata.jpg'
, 'sonata_original.jpg', 'sonata_rename.jpg', 'M2', '/inspection/M2'
);

-- 다른 테이블에도 삽입 또는 업데이트 등 필요한 작업 수행
-- Ownership_history insert
INSERT INTO Ownership_history
(
  Previous_Owner, Current_Owner, Ownership_start, Ownership_end
, Reason_transfer, Descript_transfer, Car_ID
)
VALUES 
(
  '이재원', '이준형', '2021-04-03 09:00:00', '2023-03-15 17:30:00'
, '직장 지역이동에 의한 판매', '차량 상태 우수, 주행거리 낮음', 99
);

-- Accident_history insert
SELECT * FROM Accident_history;
INSERT INTO Accident_history
(
  Accident_damage_degree, Accident_date
, Insurance_claim_check, Car_ID
)
VALUES 
(
  2, '2022-05-20 16:00:00'
, 1, 99
);

-- Inundation insert
SELECT * from Inundation;
INSERT INTO Inundation
(
  Inundation_degree, Inundation_date, Car_ID
)
VALUES 
(
  3, '2022-07-10 10:15:00', 99
);

-- Transaction 종료
COMMIT;

SELECT * FROM Car;
SELECT * FROM Ownership_history;
SELECT * FROM Accident_history;
SELECT * FROM Inundation;
```

- **실행 결과**

</details>

<details>
<summary>TC_009</summary>
<br/>

- **실행 화면**

![TC009_1st](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/e53f2ab5-deb7-4d0f-972a-6f6d75cda1dd)

![TC009_2nd](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/a3a95e52-0643-4b6a-b965-3f81389dd689)

- **쿼리문**

```sql
-- Member 테이블에 대한 Trigger 정의
DELIMITER //

CREATE TRIGGER AfterReportUpdate
    BEFORE UPDATE ON Member
    FOR EACH ROW
BEGIN
  -- 누적신고횟수가 5의 배수일 때 제재 적용
  IF NEW.Report_issue_stack % 5 = 0 AND NEW.Report_issue_stack < 30 THEN
    SET NEW.Member_blacklist = 1;
    SET NEW.Restriction_date = NOW();
    SET NEW.Restriction_end_date = DATE_ADD(NOW(), INTERVAL NEW.Report_issue_stack DAY);
  END IF;

  -- 누적신고횟수가 30이 넘어가면 회원의 회원탈퇴 여부가 1(탈퇴)로 업데이트
  IF NEW.Report_issue_stack >= 30 THEN
    SET NEW.Member_withdraw_check = 1;
    SET NEW.Member_withdraw_date = NOW();
  END IF;
END;//

DELIMITER ;

-- Trigger 적용 확인
SELECT * FROM Member;
INSERT INTO Member
(
  Member_ID, Member_name, Member_nickname, Member_password, Member_email, Member_phoneNum
, Member_address, Member_birth, Member_sign_up_date, Member_coupon, Dealer_company
, Dealer_region, Dealer_grade, Member_type, Member_blacklist, Restriction_date, Restriction_end_date
, Login_fail_stack, Report_issue_stack, Login_restriction_check, Member_withdraw_check
, Member_withdraw_date 
)
VALUES 
(
  99, '홍길동', '회원닉네임이영', 'qlalfqjsgh1234', 'hongmail@daum.net', '010-2222-5555'
, '부산', '1993-1-3 00:00:00', NOW(), NULL, NULL, NULL 
, NULL, 0, NULL,	NULL,	NULL,	NULL
, 4, NULL,	0, NULL
)
,
(
  100, '홍구구', '회원닉네임이영', 'qlalfqjsgh1234', 'hongmail@daum.net', '010-2222-5555'
, '대구', '1996-1-3 00:00:00',  NOW(), NULL, NULL, NULL
, NULL, 0,	1, '2023-12-1 00:00:00', '2023-12-26 00:00:00'
, NULL, 28, NULL, 0,	NULL
);

SELECT * FROM Member;

UPDATE Member 
   SET report_issue_stack = report_issue_stack + 1 
 WHERE Member_ID IN (99, 100);

SELECT * FROM Member;

UPDATE Member
   SET report_issue_stack = report_issue_stack + 5 
 WHERE Member_ID IN (99, 100);

SELECT * FROM Member;
```

- **실행 결과**

</details>

<details>
<summary>TC_010</summary>
<br/>

- **실행 화면**

![TC010](https://github.com/beyond-sw-camp/be04-1st-EarlyFar-FaaarCar/assets/152199695/80423afd-51be-4129-94de-5c2ab6afa38b)

- **쿼리문**

```sql
CREATE VIEW CarOwnershipView AS
SELECT Car.Car_ID, Car.Car_model, Model.Model_name, Ownership_history.Current_Owner
  FROM Car
  JOIN Model ON Car.Model_ID = Model.Model_ID
  JOIN Ownership_history ON Car.Car_ID = Ownership_history.Car_ID;

SELECT * FROM CarOwnershipView;
```

- **실행 결과**

</details>

# 5. 프로젝트 회고

- **백동현** :  

- **손세림** : 

- **송동준** : 

- **양지혜** : 

- **정태원** : 






