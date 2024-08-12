# BIS to Tago Interface
BIS 시스템에서 타고와 연동하기 위한 모듈

### - 프로젝트 구조
root : com.geon.bis.tago.bistotagointerface
root \
&nbsp; ㄴ config : Application 관련 컴포넌트 정의 \
&nbsp; ㄴ packet : 송수신에 필요한 데이터 타입을 정의 \
&nbsp; ㄴ mapper : MyBatis 연동을 위한 맵퍼 정의 \
&ensp;&emsp; ㄴ model : 맵퍼에 사용될 모델 정의 ( resultType, parameterType ) \
&nbsp; ㄴ netty : NETTY 설정을 위한 핸들러 정의 및 설정 \
&ensp;&emsp; ㄴ config : Netty 기본 컴포넌트와 빈 정의 \
&ensp;&emsp; ㄴ handler : PipeLine에 적재될 핸들러 정의 \


### - 정보교환 기술기준

아래 링크 본문 참고
* <a href="https://www.law.go.kr/admRulLsInfoP.do?admRulId=32717&efYd=0">국가법령정보센터 > 행정규칙 > 본문</a>

### - 통신 코드 정리


| 코드  | 구현 클래스          | 설명     | 
|-----|-----------------|--------|
| 201 | BusLocationInfo | 버스위치정보 |   



### Mapper 구조 
* 1개의 코드당 ( 201, 202, 203, ... ) 아래 정의 된 1개의 파일만으로 구성을 기본으로 한다.
* 예시 ) 
  1. BusLocationInfoMapper.xml 
  2. public interface BusLocationMapper{}
  3. ParamBusLocationInfo 
  4. ResultBusLocationInfo




---------------------------------------------






For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.2/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.2/gradle-plugin/packaging-oci-image.html)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#using.devtools)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)

### Guides

The following guides illustrate how to use some features concretely:

* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

