# Alcohol Hub(Ahub Project)
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/09e4c600-a088-4b1b-97d8-9f67b80e7e03)

### 팀명: 불4조(Team Phoenix)
### 팀원

- 팀원 : **백동현**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/dongh810)

- 팀원 : **손세림**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/bucky1005)

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
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/9992df3e-e372-44e4-b8c9-1a6983197ce3)
    
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
<summary>AH-FAIR-001</summary>

- **Request Header**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/30153165-0355-4ab3-bae6-730185418208)


- **Request Body**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/ae39714f-9659-444a-a112-170787e5749e)


- **Response Header**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/f6bd9ff2-784f-4b27-8e07-b08c20295942)


- **Response Body**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/03d827fc-c29b-4dc8-be61-fc257fa2b589)

</details>

<details>
<summary>AH-FAIR-002</summary>

- **Request Header**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/b647e946-24d1-40ab-a815-9dc1cd62fad5)

- **Request Body**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/a3674c76-8800-47b2-a813-a63d4894af5b)

- **Response Header**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/0ba40c75-7a8c-463d-904d-fe041a0373cb)

- **Response Body**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/5cc822a3-094e-45ab-8ed0-10855009cf7c)

</details>

<details>
<summary>AH-FAIR-003</summary>

- **Request Header**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/5c68e1e5-f237-4845-b3bf-67e1cf556e02)


- **Request Body**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/7eb39173-01f4-4fb9-8810-4c45aa230c04)


- **Response Header**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/c69ea215-f0e8-43e5-9fdf-6c7aecbfa693)


- **Response Body**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/c37e0b4d-6443-4528-ace9-97ec0558e200)


</details>

<details>
<summary>AH-FAIR-004</summary>

- **Request Header**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/2abfb133-032e-4806-a3d7-da70e3dd9526)


- **Request Body**
<br> none


- **Response Header**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/2a7d7ecb-0f0f-44e2-a664-a50b42ba3ded)


- **Response Body**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/666727c0-ad43-473b-9694-ca7282ce2169)

</details>

<details>
<summary>AH-FAIR-005</summary>

- **Request Header**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/e94b8408-35e9-49d0-b89b-d5bca4bac090)


- **Request Body**
<br> none

- **Response Header**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/a3a2388d-6e78-4c38-bb5c-ceb4452d4528)


- **Response Body**
  
![image](https://github.com/4jo-Phoenix/Alcohol_hub/assets/108782390/40ca06d6-0685-481e-b5fe-ead7f32f121d)

</details>

---

<details>
<summary>AH-REPLY-001</summary>

- **Request Header**
  
![스크린샷 2024-03-10 오후 7 32 41](https://github.com/dongh810/alcohol_test/assets/105986200/d68c85e2-ab63-412e-bcaf-f5893d045686)


- **Request Body**
<br> none


- **Response Header**
  
![스크린샷 2024-03-10 오후 7 33 03](https://github.com/dongh810/alcohol_test/assets/105986200/c43c3763-91c8-4b6c-a80e-5e42a4545d14)


- **Response Body**
  
![스크린샷 2024-03-10 오후 7 33 18](https://github.com/dongh810/alcohol_test/assets/105986200/3d6ba0df-f559-4ca0-b2ee-27461c5e292c)

</details>

<details>
<summary>AH-REPLY-002</summary>

- **Request Header**
  
![스크린샷 2024-03-10 오후 7 33 37](https://github.com/dongh810/alcohol_test/assets/105986200/32a3eed9-d496-45b0-9a6d-9c7453df93ce)


- **Request Body**
<br> none


- **Response Header**
  
![스크린샷 2024-03-10 오후 7 33 50](https://github.com/dongh810/alcohol_test/assets/105986200/481b4f58-5779-43d3-9c19-57ba1d188231)


- **Response Body**
  
![스크린샷 2024-03-10 오후 7 34 06](https://github.com/dongh810/alcohol_test/assets/105986200/19d58123-6bde-4cdc-bd7a-8a198043dd79)

</details>

<details>
<summary>AH-REPLY-003</summary>

- **Request Header**
  
![스크린샷 2024-03-10 오후 7 34 19](https://github.com/dongh810/alcohol_test/assets/105986200/b04891e9-4d4b-411d-8d4e-2b906944106e)


- **Request Body**
<br> none


- **Response Header**
  
![스크린샷 2024-03-10 오후 7 34 33](https://github.com/dongh810/alcohol_test/assets/105986200/0e580ff0-b97c-43a6-a8ce-33556e1a386a)


- **Response Body**
  
![스크린샷 2024-03-10 오후 7 34 49](https://github.com/dongh810/alcohol_test/assets/105986200/46eb40bf-ed56-4743-92ef-21f1f6b890ee)

</details>

<details>
<summary>AH-REPLY-004</summary>

- **Request Header**
  
![스크린샷 2024-03-10 오후 7 35 03](https://github.com/dongh810/alcohol_test/assets/105986200/17bdcc81-bc7e-4202-b806-b23584a00757)


- **Request Body**

![스크린샷 2024-03-10 오후 7 35 10](https://github.com/dongh810/alcohol_test/assets/105986200/fe42e9bc-c6cf-43f7-a78a-1434d4d64f9c)


- **Response Header**
  
![스크린샷 2024-03-10 오후 7 35 21](https://github.com/dongh810/alcohol_test/assets/105986200/29067157-c626-46f4-b53f-f8c7e89575e2)


- **Response Body**
  
![스크린샷 2024-03-10 오후 7 35 33](https://github.com/dongh810/alcohol_test/assets/105986200/492ffccd-8159-4a35-a935-0e6259654131)

</details>

<details>
<summary>AH-REPLY-005</summary>

- **Request Header**

![스크린샷 2024-03-10 오후 7 35 52](https://github.com/dongh810/alcohol_test/assets/105986200/73c807be-e629-4fe4-a0b9-ae601a99f850)


- **Request Body**

![스크린샷 2024-03-10 오후 7 35 44](https://github.com/dongh810/alcohol_test/assets/105986200/0db0c353-cfe0-45b9-ab76-8907879f0085)


- **Response Header**
  
![스크린샷 2024-03-10 오후 7 36 06](https://github.com/dongh810/alcohol_test/assets/105986200/a15a52c2-2991-4fa8-823e-eca044be5a7d)


- **Response Body**
  
![스크린샷 2024-03-10 오후 7 36 01](https://github.com/dongh810/alcohol_test/assets/105986200/ba907070-e64a-4389-bf6c-2a4d6153044d)

</details>

<details>
<summary>AH-REPLY-006</summary>

- **Request Header**
  
![스크린샷 2024-03-10 오후 7 36 20](https://github.com/dongh810/alcohol_test/assets/105986200/7f5c1e33-2f89-43f7-9477-c3c097328409)


- **Request Body**
<br>none


- **Response Header**
  
![스크린샷 2024-03-10 오후 7 36 33](https://github.com/dongh810/alcohol_test/assets/105986200/617b4f69-52c7-4694-8efb-8289a623c560)


- **Response Body**
  
![스크린샷 2024-03-10 오후 7 36 40](https://github.com/dongh810/alcohol_test/assets/105986200/44ec18e6-0599-4ae5-b475-ba0685db70b1)

</details>

<details>
<summary>AH-REPLY-007</summary>

- **Request Header**
  
![스크린샷 2024-03-10 오후 7 36 49](https://github.com/dongh810/alcohol_test/assets/105986200/f3ecb25a-ba4f-4bf8-8790-c6387ed0a2d7)


- **Request Body**
<br>none


- **Response Header**
  
![스크린샷 2024-03-10 오후 7 37 03](https://github.com/dongh810/alcohol_test/assets/105986200/3f0e78a8-973a-413f-9848-604fb64a15e6)


- **Response Body**
  
![스크린샷 2024-03-10 오후 7 36 58](https://github.com/dongh810/alcohol_test/assets/105986200/b260c286-f23c-43f3-a01b-648597f752ee)

</details>

---

<details>
<summary>AH-MEMBER-001</summary>

- **Request Header**
![01_Request_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/1dd83fed-5c6c-4706-ac3d-6895c6f61bb6)

- **Response Header**
![01_Response_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/5f27a935-ed7a-4337-884e-c235429819a9)

- **Response Body**
![01_GET_findAllmembers](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/88b0f378-5162-4611-be3b-d4ad3703adac)
![01_GET_findAllmembers_2](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/b08b802b-2196-4f61-ba0c-8237b6736019)

</details>

<details>
<summary>AH-MEMBER-002</summary>

- **Request Header**
![02_Request_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/aa051b8b-29c6-4041-a073-2343e6489033)

- **Response Header**
![02_Response_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/0dc9d380-17fc-44c1-abc6-91c1de1d074c)

- **Response Body**
![02_GET_findBymemberCode](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/2f115a8b-d589-4018-a4f1-36cfeaf8dc2c)

</details>

<details>
<summary>AH-MEMBER-003</summary>

- **Request Header**
![03_Request_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/2c075c2e-8ff4-4a19-ae7e-6551c83cece1)

- **Response Header**
![03_Response_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/7c8205dc-19dc-46ba-8ae2-c6b01b9ee586)

- **Response Body**
![03_GET_findByMemberId](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/9cfd8947-e85e-45f3-8e49-75d67b07f2fc)

</details>

<details>
<summary>AH-MEMBER-004</summary>

- **Request Header**
![04_Request_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/d3a4da21-d87b-4662-b2ff-df8ae07e152d)

- **Response Header**
![04_Response_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/1cc6b4bf-1858-465e-972a-d02889ccfd27)

- **Response Body**
![04_GET_findMyProfile](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/317232ae-f488-482b-a33c-5fffc97a3e75)

</details>

<details>
<summary>AH-MEMBER-005</summary>

- **Request Header**
![05_Request_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/9129642f-e650-4bb5-885a-b43584af56bc)

- **Response Header**
![05_Response_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/04e900fb-0288-410d-96fe-2e4e657f57f6)

- **Request Body**
- **Response Body**
![05_POST_registMember](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/cb3486d0-dce1-42c8-8f55-62536fb6478f)

</details>

<details>
<summary>AH-MEMBER-006</summary>

- **Request Header**
![06_Request_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/3afe8b34-5217-4beb-bc8f-c9bb4587cfa4)

- **Response Header**
![06_Response_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/aa3c3e0c-07df-496c-86fb-7f2da5b5e431)

- **Request Body**
- **Response Body**
![06_POST_login](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/9f419f39-e775-4826-be44-a65a42316c01)

</details>

<details>
<summary>AH-MEMBER-007</summary>

- **Request Header**
![07_Request_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/bdfcaf0c-1c21-478e-9928-a5cf7f61ec53)

- **Response Header**
![07_Response_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/8c2c4fbe-0729-440a-9a15-baa25bf11a95)

- **Request Body**
- **Response Body**
![07_PUT_modifyMember](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/241f819c-efb9-4dc8-9449-4f84e70155ed)

</details>

<details>
<summary>AH-MEMBER-002</summary>

- **Request Header**
![08_Request_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/2e512694-5e7d-46e7-81d8-0c70e4f7542b)

- **Response Header**
![08_Response_Header](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/882c5d3e-2d97-4ff8-b6f3-8864f6f60cb3)

- **Request Body**
- **Response Body**
![08_DELETE_removeMember](https://github.com/4jo-Phoenix/Alcohol_hub/assets/87284220/c7c7a4f3-c8a5-48ab-9d61-bceb8f47def2)

</details>

# 5. 프로젝트 회고

- **백동현** :  

- **손세림** : 

- **송동준** : 

- **양지혜** : 

- **정태원** : 






