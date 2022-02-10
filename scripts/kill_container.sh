#!/bin/sh
cd /home/ec2-user
sudo docker ps -a
sudo docker stop spring-boot-docker
sudo docker rm spring-boot-docker
sudo docker images
sudo docker image rmi -f javatrap/spring-boot-docker
cd /home/ec2-user/server
sudo rm docker-compose.yml
