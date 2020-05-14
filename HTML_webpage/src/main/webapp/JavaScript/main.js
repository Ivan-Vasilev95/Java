function postUserInfo(){
	const formData=toJSONString(document.querySelector ('form.user-info'))
	
	 fetch('user?id=0',{
		method:'POST',
		header:{
			'Content-Type':'application/json','Accept':'application/json'
		},
		body:formData
	})
	.then((response)=>{
		return response.json();
	})
	.then((data)=>{
		var element = document.getElementById('user_info_message');
		element.innerHTML=data.message;
		console.log(data);
		console.log(data.user);
	})
	return false;
}

function postUserSkill(){
	const formData=toJSONString(document.querySelector ('form.user-skill'));
	
	fetch('upSkills',{
		method:'POST',
		header:{
			'Content-Type':'application/json','Accept':'application/json'
		},
		body:formData
	})
	.then((response)=>{
		return response.json();
	})
	.then((data)=>{
		var element = document.getElementById('user_skill_message');
		element.innerHTML=data.message;
		console.log(data);
		console.log(data.user);
	})
	return false;
}

function postUserAddress(){
	const formData=toJSONString(document.querySelector ('form.user-address'))
	
	 fetch('updateContacts',{
		method:'POST',
		header:{
			'Content-Type':'application/json','Accept':'application/json'
		},
		body:formData
	})
	.then((response)=>{
		return response.json();
	})
	.then((data)=>{
		var element = document.getElementById('user_address_message');
		element.innerHTML=data.message;
		console.log(data);
		console.log(data.user);
	})
	return false;
}

function toJSONString(form){
	var obj={};
	var elemets=form.querySelectorAll("input, select, textarea");
	for(var i=0;i<elemets.length;i++){
		var element=elemets[i];
		var name=element.name;
		var value=element.value;
		
		if(name){
			obj[name]=value;
		}
	}
	return JSON.stringify(obj);
}