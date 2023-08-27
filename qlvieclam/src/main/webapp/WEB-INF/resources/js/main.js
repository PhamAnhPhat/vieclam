function delJob(path,id){
    fetch(path,{
        method:"delete"
        
    }).then(res=>{
        if(res.status==204)
            location.reload();
        else 
            alert("ERROR");
    });
}

 let name = [];
    let number = [];
    function GetName() {
        $.ajax({
            url: "http://localhost:8080/QLViecLam/api/GetThongKeByNameMajor/",
            method: "GET",
            success: function (n) {
                name = n;
                        console.log(name);
            }
        });
    }
    $(document).ready(function () {
    GetName();
    });

