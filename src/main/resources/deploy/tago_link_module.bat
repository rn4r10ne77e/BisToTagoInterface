@echo off
REM Set JAVA_HOME (JDK 경로를 설정해야 합니다)
set JAVA_HOME=C:\Users\itp-001\.jdks\jbr-17.0.11
set PATH=%JAVA_HOME%\bin;%PATH%

REM 애플리케이션 경로
set JAR_FILE=TagoLinkModule.jar
set JAVA_OPTS=-Xms512m -Xmx1024m
set ACTIVE_PROFILE=vpn



REM Spring Boot 애플리케이션 실행
echo Starting TagoLinkModule...
java %JAVA_OPTS% -Dspring.profiles.active=%ACTIVE_PROFILE% -jar %JAR_FILE%

REM 실행이 끝난 후 종료 메시지
echo TagoLinkModule has been stopped.
pause