open sts right click ->
 run as maven build -> 
 add groupname as package and enter -> 
 in target folder jar will load

✔️to build image ➡️ docker build -t 412sid1999/springapp:0.0.1 .

✔️to push image to dockerhub ➡️ docker push 412sid1999/springapp:0.0.1

✔️for deleting images ➡️ docker rmi imagename
✔️for deleting container ➡️ docker rm containername


✔️running a container ➡️ docker run -d -p 9000:8080 --name springAppContainer 412sid1999/springapp:0.0.1

✔️check logs with timestamp ➡️ docker logs -t containername
