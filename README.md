# planefinder to reactive

1.
CrudRepository to ReactiveCrudRepository

2.
```java
Iterable<Aircraft> to  Flux<Aircraft>
```

3.
add in maven
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-r2dbc</artifactId>
</dependency>
<dependency>
    <groupId>io.r2dbc</groupId>
    <artifactId>r2dbc-h2</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-rsocket</artifactId>
</dependency>
```
3.
maybe you need to create table with SQL code, naw we do it by class DbConxInit (we used to do it by @entity)

4. add this method
```java
@MessageMapping("acstream")
    public Flux<Aircraft> getCurrentACStream() throws IOException {
        return pfService.getAircraft().concatWith(
                Flux.interval(Duration.ofSeconds(1))
                        .flatMap(l -> pfService.getAircraft()));
    }
```
and port for this RSocket endpoint
```properties
spring.rsocket.server.port=7635
```
now, app ready to have RSocket communication