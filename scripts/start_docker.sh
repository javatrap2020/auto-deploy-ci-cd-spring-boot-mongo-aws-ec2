#!/bin/sh

sudo amazon-linux-extras install docker
sudo curl -L https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
sudo mv /usr/local/bin/docker-compose /usr/bin/docker-compose
sudo service docker start
sudo usermod -a -G docker ec2-user

sudo service docker start
cd home/ec2-user/server

sudo docker-compose up