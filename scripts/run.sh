#!/bin/bash
cd /home/ec2-user/server
docker-compose build --no-cache
docker-compose up -d