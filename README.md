# planefinder to reactive

1.
CrudRepository to ReactiveCrudRepository

2.
```java
Iterable<Aircraft> to  Flux<Aircraft>
```

3.
add to maven R2DBC (and help r2dbc for h2)
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
```
db=h2\
4
maybe you need to create table with SQL code, naw we do it by class DbConxInit (we used to do it by @entity)

5.
WebFlux lib and 