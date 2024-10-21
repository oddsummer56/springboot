#!/bin/bash

echo "DOCKER STOP"
docker stop app

echo "DOCKER RM"
docker rm app

echo "DOCKER RUN"
docker run --name app -p 8080:8080 -d oddsummer/greeting:latest


echo "DONE"
