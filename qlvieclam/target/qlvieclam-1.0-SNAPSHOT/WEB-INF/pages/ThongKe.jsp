<%-- 
    Document   : ThongKe
    Created on : Aug 20, 2023, 8:48:46 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <h2 style="margin-left: 500px;">THỐNG KÊ</h2>

    <canvas id="myChart" style="width: auto;">

    </canvas>
</div>
<script>
    const ctx = document.getElementById('myChart');
    let name = [];
    let number = [];
    function GetName() {
        $.ajax({
            url: "http://localhost:8080/QLViecLam/api/GetThongKeByNameMajor/",
            method: "GET",
            success: function (n) {
                name = n;
                console.log(name);
                $.ajax({
                    url: "http://localhost:8080/QLViecLam/api/GetThongKeByNumberMajor/",
                    method: "GET",
                    success: function (res) {
                        number = res;
                        console.log(number);
                        new Chart(ctx, {
                            type: 'bar',
                            data: {
                                labels: name,
                                datasets: [{
                                        label: 'Số lượng đơn ứng tuyển của các ngành nghề',
                                        data: res,
                                        borderWidth: 1
                                    }]
                            },
                            options: {
                                scales: {
                                    y: {
                                        beginAtZero: true
                                    }
                                }
                            }
                        });
                    }
                })
            }
        });
    }
    $(document).ready(function () {
        GetName();
    });
</script>

<script>




</script>
