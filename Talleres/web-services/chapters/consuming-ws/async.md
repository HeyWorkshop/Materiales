# Async vs Sync  
First we need to understand asynchronous programming.  

![Async-Sync](http://www.phpmind.com/blog/wp-content/uploads/2017/05/synchronous-asynchronous-javascript.png)  

## Synchronous  programming  
In traditional programming practice, most I/O operations happen synchronously. If you think about Java, and about how you would read a file using Java, you would end up with something like this:  
```java
try(FileInputStream inputStream = new
	FileInputStream("foo.txt")) { 
	Session IOUtils; 
	StringfileContent =
		IOUtils.toString(inputStream); 
}
```  

What happens in the background? The main thread will be blocked until the file is read, which means that nothing else can be done in the meantime. To solve this problem and utilize your CPU better, you would have to manage threads manually.  

## Asynchronous programming in NodeJS  

Asynchronous I/O is a form of input/output processing that permits other processing to continue before the transmission has finished.  
```javascript
const fs = require('fs');

fs.readFile('file.md', 'utf-8', function (err, content) {
	 if (err) { 
		 return  console.log(err) 
	 } 
	 console.log(content) 
 });
```  


**Hello World**  
[Next](./helloworld.md)