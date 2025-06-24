# 🚗 파킹메이트 백엔드

> 본 레포는 팀 프로젝트에서 **직접 구현한 백엔드 기능만 정리한 포트폴리오용**입니다.

## 📁 프로젝트 개요

- **프로젝트명**: ParkingMate (서울시 일부 공영주차장 추천 서비스)
- **설명**: 실시간 및 시계열 공영주차장 정보를 기반으로, **사용자 선호도와 혼잡도 예측을 반영해 주차장을 추천**하는 웹 서비스
- **진행기간**: 2025.03 ~ 2025.06 (약 3개월)
- **참여인원**: 4명 (프론트 1, 백엔드 2, AI 1)
- **개발방식**: 협업 (GitHub + Notion)
- **역할**: 백엔드 전반(하단 구현 기능 요약 참고)

## 🛠 사용 기술 스택

- **Language**: Java
- **Framework**: Spring Boot
- **Database**: MariaDB
- **Build Tool**: Gradle
- **Version Control**: Git & GitHub
- **Others**: Spring Security, ProcessBuilder (Python AI 연동), REST API 설계

## ☑️ 구현 기능 요약

| 기능 구분     | 상세 내용 |
|---------------|-----------|
| 회원 관리     | 회원가입, 로그인/로그아웃, 세션 기반 인증, 예외 처리 |
| 주차장 추천   | 사용자 선호 가중치 기반 추천 구성. AI 출력 중 필요한 값만 선별해 JSON 응답 |
| 마이페이지    | 설정 변경, 비밀번호 수정, 내 평점 목록 보기 |
| AI 연동       | `ProcessBuilder`로 XGBoost 기반 Python 예측 모델 실행 → 주차장 추천 점수 수신 및 가공 |
| 공통 응답     | 상태코드 + 메시지 + 데이터 형태로 통일된 응답 구조 |
| 보안          | Spring Security + BCryptPasswordEncoder + 세션 인증 |
