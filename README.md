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
## 3. 구조는 아래와 같습니다.
![AntiCorruptionLayerPattern](https://github.com/Nanninggu/Anti-Corruption-Layer-Pattern/assets/54211801/ec6afd78-714b-411f-a214-a9f92bf28cf3)
## 4. 활용 사례는 아래를 참고
신규로 시스템을 개발하고, 이전하는 과정에서 일부만 일단 개발하고 나머지 시스템은 추후에 개발하는 케이스도 있을 것이다.
이렇게 되면 일부 기능만 신규로 개발이 되고 나머지는 그대로 사용해야 하는 상황이 발생한다.
그런 상황에 대비하라고 나온 게 이 부패 방지 계층 패턴이다. 아래와 같은 상황에 이 패턴을 사용하면 유용할 거 같다.
- 타 시스템 연계 (3rd party system)
- 서로 다른 통신 프로토콜을 사용할때
- 서로 다른 도메인 모델 설계
- 서로 다른 데이터 타입 사용
- 서로 다른 플랫폼 인프라 계층의 연계
서로 다른 두 시스템이 망가지는것을 방지하기 위해 중간에 도메인 모델을 변경하거나 프로토콜을 맞춰주는 부패 방지 계층을 만든다.
그러므로 서로다른 두 시스템 간의 원활한 서비스가 되도록 수행한다.

### - 정리 끝 -
