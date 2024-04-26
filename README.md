# Anti-Corruption-Layer-Pattern
About Anti-Corruption Layer-Pattern of Sample code with SpringBoot

# 환경 구성 방법
## 1. localhost에 postgresql이 설치 되어 있어야 합니다.
   ### - 구성환경은 application.properties 파일을 참고 하면 됩니다.
## 2. Postgresql에 Database를 2개의 테이블을 생성 합니다.
   ### - 첫번째 테이블 생성 스크립트는 아래를 참고.
     CREATE TABLE IF NOT EXISTS public.legacy_table  
     (  
     id character varying(255) COLLATE pg_catalog."default",  
     username character varying(255) COLLATE pg_catalog."default",  
     email character varying(255) COLLATE pg_catalog."default"  
     )  
   ### - 두번째 테이블 생성 스크립트는 아래를 참고.
     CREATE TABLE IF NOT EXISTS public.modern_table  
     (  
     id character varying(255) COLLATE pg_catalog."default",  
     username character varying(255) COLLATE pg_catalog."default",  
     email character varying(255) COLLATE pg_catalog."default"  
     )  
3. 구조는 아래와 같습니다.
