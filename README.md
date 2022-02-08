# Auto  Build Deploy Spring-Boot MongoDB  Docker ci/cd   AWS - EC2

This project has Spring-boot and MongoDb database
I have created project GiT Action 
when - push to github branch main 
- auto build
- auto deploy
- image to DockerHub
- deploy to AWS-EC2
- old app processes stopped   
- install new app
- start app

# Run

`mvn clean package`

`docker-compose up`

Navigate to `http://localhost:8080/patient`

Postman POST  `localhost:8080/patient`
 {
        "name": "Java",
        "email": "java@gmail.com"    
 }
 
Postman PUT  `localhost:8080/patient`
 {
        "name": "JavaTrap",
        "email": "java@gmail.com",
 }
 
Postman GET  `localhost:8080/patient` 

# javatrap2020 created  `https://github.com/javatrap2020/auto-deploy-ci-cd-spring-boot-mongo-aws-ec2`