# Junit & Mockito

## Mockito란?

Mock(진짜 객체 처럼 동작하지만 프로그래머가 직접 컨트롤 할 수 있는 객체)을 지원하는 프레임워크. Mock 객체를 만들고 관리하고 검증 할 수 있는 방법을 제공.

## Test Double

테스팅에서 실제 객체를 대신하여 사용되는 모든 방법을 일컫는다.

실제 객체를 사용하지 어렵고 모호할 때, 이를 대신해줄 객체를 만들어 테스트 수행을 돕는다.

(이 이름은 영화의 Stunt Double-스턴트맨-이라는 개념에서 나왔다.)

### Dummy

Dummy 객체는 전달되기만하고 실제 사용되지는 않는다.

단지 인스턴스화된 객체가 필요한 경우(해당 객체의 기능이 필요하지 않을 때)

### Fake

Fake 객체는 실제로 동작하는 구현체가 있으나, 운영시에는 사용할 수 없는 간단한 형태이다.

여러개의 인스턴스를 대표할 수 있는 경우.

보통 `List`나 `Map`을 이용해서 DB같은 외부 의존 환경을 대체한다. 즉, 복잡한 로직or외부 서비스의 동작을 비교적 단순화하여 구현한 객체.

(e.g. in memory database)

### Stub

Dummy 객체가 마치 실제로 동작하는 것처럼보이게 만들어놓은 객체

Stub는 테스트 시 호출되면 미리 준비된 Answers로 응답하므로 테스트에 사용하기 위해 미리 프로그램된 것 이외의 것에 대해서는 응답하지 않는다.

### Spy

Stub의 역할을 가지면서 호출된 내용에 대해 테스트에서 확인하기 위한 약간의 정보를 기록하는 객체이다.

호출 여부를 감시해서 기록했다가 나중에 요청이 들어오면 해당 기록 정보를 전달해준다.

기록 정보 : 특정 객체가 사용됐는가? 그 객체의 예상된 메소드가 정상적으로 호출됐는가?

### Mock

Mock 객체는 호출에 대한 기대를 명세하고, 해당 내용에 따라 동작하도록 프로그래밍 된 객체이다.

## Mockito와 행위 기반 테스트

Mockito는 Stub 작성과 Verify가 중심을 이룬다.

CreateMock : 인터페이스에 해당하는 Mock 객체 생성

Stub : 필요한 경우 테스트에 필요한 Mock 객체의 동작 지정

Exercise : 테스트 메소드 내에서 Mock 객체를 사용

Verify : 메소드가 예상대로 호출됐는지 검증

## How to install

- Junit

```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter</artifactId>
  <version>5.7.2</version>
  <scope>test</scope>
</dependency>
```

- Mockito

```xml
<dependency>
  <groupId>org.mockito</groupId>
  <artifactId>mockito-junit-jupiter</artifactId>
  <version>3.10.0</version>
  <scope>test</scope>
</dependency>
```

## 참고

https://site.mockito.org

https://beomseok95.tistory.com/295

https://nesoy.github.io/articles/2018-09/Mockito
