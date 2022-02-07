#!/bin/sh

sudo amazon-linux-extras install docker
sudo curl -L https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
sudo service docker start
sudo mv /usr/local/bin/docker-compose /usr/bin/docker-compose
sudo usermod -aG docker ec2-user
sudo service docker start
sudo su
yum update -y
aws s3 cp s3://deploy-git-bucket-user3/.env /home/ec2-user/server
cd server/
sudo docker-compose up