# eGovFrame Project (egovproject)

전자정부 표준프레임워크(eGovFrame)를 기반으로 한 웹 애플리케이션 프로젝트입니다. 이 프로젝트는 Apple Silicon(M1/M2/M3) Mac 환경에서의 개발 및 테스트를 고려하여 설정되었습니다.

## 🛠 개발 환경 (Environment)

* **OS**: macOS (Apple Silicon)
* **Framework**: eGovFrame 3.x / 4.x (버전에 맞춰 수정)
* **Java**: JDK 1.8 (또는 사용 중인 버전)
* **Build Tool**: Apache Maven
* **WAS**: Apache Tomcat 8.5.99

## ⚙️ 설정 가이드 (Setup Guide)

### 1. Maven 설정 (격리된 환경)

기존 시스템의 Maven 설정과 충돌을 방지하기 위해 별도의 `settings.xml`과 로컬 저장소를 사용합니다.

* **Settings 파일**: `[프로젝트경로]/maven/settings_egov.xml`
* **로컬 저장소**: `[프로젝트경로]/maven/repository`

#### IDE(Eclipse) 적용 방법:

1. `Preferences > Maven > User Settings` 이동
2. `User Settings` 경로를 프로젝트 내 `settings_egov.xml`로 지정
3. `Update Settings` 클릭 후 `Local Repository` 경로 확인

### 2. WAS 설정 (Tomcat 8.5.99)

* **Tomcat 위치**: `/Users/[User]/Documents/egov_dev/apache-tomcat-8.5.99`

## 🚀 시작하기 (Getting Started)

1. 저장소를 클론합니다.
```zsh
git clone https://github.com/dopal2/egovproject.git

```


2. IDE에서 Maven 프로젝트로 Import 합니다.
3. 위 가이드에 따라 Maven User Settings를 변경합니다.
4. `Maven > Update Project (Alt+F5)`를 수행하여 의존성을 내려받습니다.
5. Tomcat 8.5 서버를 등록하고 프로젝트를 실행합니다.

## 📁 주요 디렉토리 구조

* `src/main/java`: Java 소스 코드
* `src/main/resources`: 설정 파일 (egovProps, context 등)
* `src/main/webapp`: Web Resource (JSP, JS, CSS)
* `maven/`: 프로젝트 전용 메이븐 설정 및 레포지토리 (선택 사항)
