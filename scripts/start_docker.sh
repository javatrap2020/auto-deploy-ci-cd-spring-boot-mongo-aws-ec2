#!/bin/sh

sudo amazon-linux-extras install docker
sudo curl -L https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
sudo service docker start
sudo mv /usr/local/bin/docker-compose /usr/bin/docker-compose
sudo usermod -aG docker ec2-user
sudo service docker start
cd server/
sudo docker-compose up