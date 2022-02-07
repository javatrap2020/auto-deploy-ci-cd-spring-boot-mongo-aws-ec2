#!/bin/bash
cd /home/ec2-user/auto-deploy-ci-cd-spring-boot-mongo-aws-ec2
docker-compose build --no-cache
docker-compose up -d