# Express framework  

![Express](http://mean.io/wp-content/themes/twentysixteen-child/images/express.png)  

Express is a minimal and flexible Node.js web application framework that provides a robust set of features to develop web and mobile applications. It facilitates the rapid development of Node based Web applications. Following are some of the core features of Express framework:  

-   Allows to set up middlewares to respond to HTTP Requests.
    
-   Defines a routing table which is used to perform different actions based on HTTP Method and URL.
    
-   Allows to dynamically render HTML Pages based on passing arguments to templates.  

## Installing  
```
$ npm install express --save
```  

## Hello World example  

````javascript
const express = require('express')
const app = express()

app.get('/', (req, res) => res.send('Hello World!'))

app.listen(3000, () => console.log('Example app listening on port 3000!'))
````  

**Reference**
http://expressjs.com/  

[Next](./mongodb.md)
