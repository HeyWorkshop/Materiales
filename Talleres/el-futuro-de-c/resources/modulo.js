'use strict'

const child_exec = require('child_process').exec;

child_exec('./bombillas', (error, stdout, stderr) => {
	if (error) throw(error);
	let bombillas = stdout.slice(0, stdout.length - 1).split('\n').map(elemento => Number(elemento));

	console.log('Bombillas encendidas', bombillas);
});