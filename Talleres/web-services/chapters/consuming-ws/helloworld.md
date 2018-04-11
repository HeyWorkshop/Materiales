# Hello world  

First, let’s take a look at the “Hello, World” application included in the Node documentation. To re-create the application, create a text document with the following JavaScript, using your favorite text editing tool. I use Nodepad++ in Windows, and Vim in Linux.  
````javascript
var http = require('http');
http.createServer(function (request, response) {
response.writeHead(200, {'Content-Type': 'text/plain'});
response.end('Hello World\n');
}).listen(8124);

console.log('Server running at http://127.0.0.1:8124/');
````  
Save the file as hello.js. To run the application, open a terminal if you’re using Mac OS or Linux, or the Node Command window with Windows. Change to the directory where your saved file is located and type the following to run the application:  

``
$ node hello.js
``  

## Response to specific endpoints using HTTP module  

```javascript
var http = require('http');

http.createServer((request, response) => {
  if (request.method === 'POST' && request.url === '/echo') {
    let body = [];
    request.on('data', (chunk) => {
      body.push(chunk);
    }).on('end', () => {
      body = Buffer.concat(body).toString();
      response.end(body);
    });
  } else {
    response.statusCode = 404;
    response.end();
  }
}).listen(8080);
```

### Express Framework  
[Next](./express.md)  
