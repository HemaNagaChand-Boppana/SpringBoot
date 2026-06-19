var users =[
    {
        "name":"John Doe",
        "gender":"Male",
        "imgae": "../images/john.png"
    },
    {
        "name":"Jane Doe",
        "gender":"Female",
        "imgae": "../images/jane.png"
    }
];

var id = 0;

function toggle() {
    id = (id+1)%2;
    var user = users[id];
    document.getElementById("username").innerHTML = user.name;
    document.getElementById("user-gender").innerHTML = user.gender;
    document.getElementById("user-img").src = user.imgae;
    console.log(user);
}