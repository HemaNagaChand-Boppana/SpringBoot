function randomUser(){
    fetch("https://randomuser.me/api/")
    .then(function(res){
        return res.json();
    })
    .then(function(data){
        var user = data.results[0];
        var fullName = user.name.title+" "+user.name.first+" "+user.name.last;
        var gender = user.gender;
        var image = user.picture.large;
        document.getElementById("username").innerHTML = fullName;
        document.getElementById("user-gender").innerHTML = gender;
        document.getElementById("user-img").src = image;
    })
    .catch(function(err){
        console.log("Error: "+err);
    })
}