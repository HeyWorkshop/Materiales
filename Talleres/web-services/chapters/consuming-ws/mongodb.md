# Mongoose  
![Mongoose](http://mongodb-tools.com/img/mongoose.png) 
  
  
Mongoose provides a straight-forward, schema-based solution to model your application data. It includes built-in type casting, validation, query building, business logic hooks and more, out of the box.  

## Installing  
```
$ npm install mongoose
```  

## Getting started  
Now say we like fuzzy kittens and want to record every kitten we ever meet in MongoDB. The first thing we need to do is include mongoose in our project and open a connection to the `test` database on our locally running instance of MongoDB.  
```javascript
// getting-started.js
var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/test');  
```  
We have a pending connection to the test database running on localhost. We now need to get notified if we connect successfully or if a connection error occurs:  
```javascript
var db = mongoose.connection;
db.on('error', console.error.bind(console, 'connection error:'));
db.once('open', function() {
  // we're connected!
});
```  

Once our connection opens, our callback will be called. For brevity, let's assume that all following code is within this callback.  
With Mongoose, everything is derived from a  [Schema](http://mongoosejs.com/docs/guide.html). Let's get a reference to it and define our kittens.

```javascript
var kittySchema = mongoose.Schema({
  name: String
});
```  


So far so good. We've got a schema with one property,  `name`, which will be a  `String`. The next step is compiling our schema into a  [Model](http://mongoosejs.com/docs/models.html).

```javascript
var Kitten = mongoose.model('Kitten', kittySchema);  
```  


Say time goes by and we want to display all the kittens we've seen. We can access all of the kitten documents through our Kitten  [model](http://mongoosejs.com/docs/models.html).

```javascript
Kitten.find(function (err, kittens) {
  if (err) return console.error(err);
  console.log(kittens);
})
```  

Each document can be saved to the database by calling its  [save](http://mongoosejs.com/docs/api.html#model_Model-save)  method. The first argument to the callback will be an error if any occured.

```javascript
  fluffy.save(function (err, fluffy) {
    if (err) return console.error(err);
    fluffy.speak();
  });
```  


[Next](../nodejs/first.md)



