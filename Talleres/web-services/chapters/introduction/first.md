
# Introduction   
![Javascript](https://cdn-images-1.medium.com/max/785/0*Co9Hk-VtMLfM08KH.png)    
First we need to know what JavaScript is  

### What is JavaScript?  
JavaScript is a cross-platform, object-oriented scripting language. It is a small and lightweight language. Inside a host environment (for example, a web browser), JavaScript can be connected to the objects of its environment to provide programmatic control over them.  

JavaScript contains a standard library of objects, such as `Array`, `Date`, and `Math`, and a core set of language elements such as operators, control structures, and statements. Core JavaScript can be extended for a variety of purposes by supplementing it with additional objects; for example:

-   _Client-side JavaScript_  extends the core language by supplying objects to control a browser and its Document Object Model (DOM). For example, client-side extensions allow an application to place elements on an HTML form and respond to user events such as mouse clicks, form input, and page navigation.  

-   _Server-side JavaScript_  extends the core language by supplying objects relevant to running JavaScript on a server. For example, server-side extensions allow an application to communicate with a database, provide continuity of information from one invocation to another of the application, or perform file manipulations on a server.  

### Basic concepts of JavaScript  
**Typing**  
As with most scripting languages, JavaScript is dynamically typed; a type is associated with each value, rather than just with each expression. For example, a variable that is at one time bound to a number may later be re-bound to a string. 

**Syntax:** Variables in JavaScript can be defined using the var keyword:  

    var nickname = 'My nickname';  
  
  **Functions:** A JavaScript function can be coded like following:  
``` 
function sum(a, b){
	return a + b;
} 
```  

**Array and Objects literals:**  
Like many scripting languages, arrays and objects can each be created with a succinct shortcut syntax. In fact, these literals form the basis of the JSON data format.  

``` 
var person = {
	name: 'Developer',
	age: 20,
	nationality: 'Mexican'
}
```  

### JavaScript on the client side  
````
<!DOCTYPE html>
<html>
  <head>
    <title>Example</title>
  </head>
  <body>
    <button id="hellobutton">Hello</button>
    <script>
        document.getElementById('hellobutton').onclick = function() {
            alert('Hello world!');                     // Show a dialog
            var myTextNode = document.createTextNode('Some new words.');
            document.body.appendChild(myTextNode);     // Append "Some new words" to the page
        };
    </script>
  </body>
</html>
````  

### JavaScript on the server side  
There are several frameworks to develop on the server side with JavaScript, so you can running apps and web services.  
![Server-Side](https://cdn-images-1.medium.com/max/1280/1*HCkIRZ22MoQzUMKNJBSFWQ.png)  

## Framework
[Next](./frameworks.md)  
  
