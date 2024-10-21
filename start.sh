#!/bin/bash

# Start the application
nohup java \
    -jar greeting-0.0.1-SNAPSHOT.jar &

echo ">  Application Started with PID $!"
