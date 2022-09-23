From openjdk:8
EXPOSE 8080
ADD target/springboot-AKS.jar springboot-AKS.jar
ENTRYPOINT ["java","-jar","/springboot-AKS.jar"]