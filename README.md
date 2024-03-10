# Alcohol Hub(Ahub Project)
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/09e4c600-a088-4b1b-97d8-9f67b80e7e03)

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

## 4. TEST 

### 4-1. TESTCASE Definition
- **TESTCASE Definition Table**

<details>
<summary>TC-001</summary>

- **Request**

- **Response Header**

- **Response Body**

- **Success Example**

</details>


### 4-2. REST-API Definition
- **REST-API Definition Table**

<details>
<summary>AHUB-MEMBER-001</summary>

- **Request**

- **Response Header**

- **Response Body**

- **Success Example**

</details>


# 5. 프로젝트 회고

- **백동현** :  

- **손세림** : 

- **송동준** : 

- **양지혜** : 

- **정태원** : 






