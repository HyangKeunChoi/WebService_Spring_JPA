## 스프링과 JPA 기반 웹 애플리케이션 개발 (인프런, 백기선)

### 개발환경
+ IntelliJ
+ java 11
+ spring boot
+ spring security
+ spring data JPA
+ QueryDSL
+ maven
+ Postgresql
+ H2
+ Thymeleaf

### 1. 회원가입 컨트롤러
#### 목표
+ GET "/sign-up" 요청을 받아서 account/sing-up.html 페이지를 보여준다.
+ 회원 가입 폼에서 입력 받을 수 있는 정보를 "닉네임", "이메일", "패스워드" 폼 객체로 제공한다

### 2. 회원 가입 뷰

#### 부트스트랩
+ 네비게이션 바 만들기
+ 폼 만들기
#### 타임리프
+ SignUpForm 타입 객체를 폼 객체로 설정하기
#### 웹(HTML, CSS, JavaScript)
+ 제약 검증 기능 사용하기
  - 닉네임 (3~20자, 필수 입력)
  - 이메일 (이메일 형식, 필수 입력)
  - 패스워드 (8~50자, 필수 입력)

+ 타입리프 렌더링 시 아래 코드추가해야 스키마 사용가능 
  - ```<html lang="en" xmlns:th="http://www.thymeleaf.org">```
+ thymeleaf : 타임리프로 렌더링, 타임리프로 렌더링 안하는 경우 둘다 사용가능
  - ```href="/" th:href="@{/}"```
+ needs-validation을 충족하지못하면 invalid-feedback을 보여주게 된다 
