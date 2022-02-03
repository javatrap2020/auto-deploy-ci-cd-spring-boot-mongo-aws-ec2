#!/bin/bash
cd /auto-deploy-ci-cd-spring-boot-mongo-aws-ec2
docker-compose build --no-cache
docker-compose up -d