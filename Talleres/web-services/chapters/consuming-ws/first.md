# NodeJS  
First we need to know about NodeJS and how it works.  

## What is NodeJS?  
Is a JavaScript runtime built on Chrome's V8 JavaScript engine. NodeJS uses an event-driven, non-blocking I/O model that makes it lightweight and efficient. NodeJS package ecosystem, npm, is the largest ecosystem of open source libraries in the world.  
As an asynchronous event driven JavaScript runtime, Node is designed to build scalable network applications. In the following "hello world" example, many connections can be handled concurrently. Upon each connection the callback is fired, but if there is no work to be done, Node will sleep.   
```javascript
const http = require('http');

const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello World\n');
});

server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});
```  

## Basic concepts of servers  
A server is a running application (software) capable of responding to a client's requests and returning a response accordingly. The servers can be run on any type of computer, even on dedicated computers that are known individually as "the server". In most cases, the same computer can provide multiple services and have several servers in operation.  

### The classic architecture
**Client-Server**  
A software client send a request to specific server for data processing, then the server listen the request in specific endpoint, process the data and response to the client.  
The advantage here is that the client doesn't has to use its own resources to processing. Also this way multiple clients can send request to the server.  
![Client-Server](https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Server-based-network.svg/1200px-Server-based-network.svg.png)  

### Services  
A computer can offer several services, and another computer can consuming it.  

**How to access a specific service**  
Through an IP address and a Port.  
For example:  
````
/localhost:8010
/localhost:8440
````  
Each **port** can offer a specific service.  

### Endpoints  
A service may have different functions to consuming.  
For example:  
```
/localhost:8010/facebook/create-user
/localhost:8010/facebook/update-user
/localhost:8010/facebook/find-friend?id=Xas10
```  

  
 
 
**Async vs Sync**  
[Next](./async.md)
