# planefinder to reactive

1.
CrudRepository to ReactiveCrudRepository

2.
<pre>
<xmp>
Iterable<Aircraft> to Flux<Aircraft>
</xmp></pre>

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
```
3.\
maybe you need to create table with SQL code, naw we do it by class DbConxInit (we used to do it by @entity)

4.\
WebFlux lib and 