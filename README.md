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




* 문제점
  - 데이터 퍼블리케이션 생성 하는 스케줄러에서 데이터 처리 과정 중 <br>
ctx.writeAndFlush 이후에 인코더에서 인코딩 하는 과정에 문제가 생겼을 경우
ctx.writeAndFlush 이전에 예외가 생겼을 경우는 try ~ catch 에서 예외처리로 스케줄러의 중지가 가능하지만
 데이터가 인코더 핸들러로 넘어간 후에는 예외가 발생해도 스케줄러를 중지 할 수가 없다. <br>
: ctx.writeAndFlush 이전에 테스트 인코딩 후 이상없을시 넘김 

### 작업 필요
  - 버스도착예정 정보 싱글모드 구현
  - 쿼리 구현
  - procSinglePublication 메소드 구현

---------------------------------------------