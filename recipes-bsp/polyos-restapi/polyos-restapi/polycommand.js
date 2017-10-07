var exec 	= require('child_process').exec;
var fs 		= require('fs');


var volupCMD 	="amixer set 'Digital',0 '0.1dB+' | egrep -o '[0-9]+%'";
var voldownCMD 	="amixer set 'Digital',0 '0.1dB-'| egrep -o '[0-9]+%'";

var playCMD 	="mpc play 1";
var pauseCMD 	="mpc stop";




function volSet(res,postData){

}




function volUp(res,postData){

	exec(volupCMD,{timeout:100000, maxBuffer:20000*1024},
			function (error, stdout, stderr){
				res.writeHead(200, {"Content-Type": "text/plain"});
				res.write(stdout);
				res.end();
			})
	console.log("Called VOLUP");

}





function volDown(res,postData){

exec(voldownCMD,{timeout:100000, maxBuffer:20000*1024},
			function (error, stdout, stderr){
				res.writeHead(200, {"Content-Type": "text/plain"});
				res.write(stdout);
				res.end();
			})
	console.log("Called VOLDOWN");


}





function play(res,postData){

exec(playCMD,{timeout:100000, maxBuffer:20000*1024},
			function (error, stdout, stderr){
				res.writeHead(200, {"Content-Type": "text/plain"});
				res.write(stdout);
				res.end();
			})
	console.log("Called PLAY");

}






function pause(res,postData){

exec(pauseCMD,{timeout:100000, maxBuffer:20000*1024},
			function (error, stdout, stderr){
				res.writeHead(200, {"Content-Type": "text/plain"});
				res.write(stdout);
				res.end();
			})
	console.log("Called PLAY");

}







function notImplemented(res){

	console.log("requesthandler was called with WRONG method");
	res.writeHead(405, {"Content-Type": "text/plain"});
	res.write("Method not allowed.");
	res.end();

}



exports.volUp 	= volUp;
exports.volDown	= volDown;
exports.volSet	= volSet;
exports.play	= play;
exports.pause	= pause;
