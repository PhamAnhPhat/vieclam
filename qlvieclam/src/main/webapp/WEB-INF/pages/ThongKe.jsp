<%-- 
    Document   : ThongKe
    Created on : Aug 20, 2023, 8:48:46 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <h2 style="margin-left: 500px;">THỐNG KÊ</h2>

    <canvas id="myChart">

    </canvas>
</div>
<script>
    let x = [];
    const ctx = document.getElementById('myChart');
    $.ajax({
        url: "/api/major",
        method: "GET",
        success: function (data) {
            x = data
        }
    });


    new Chart(ctx, {
        type: 'bar',
        data: {
            labels: x,
            datasets: [{
                    label: 'Nghề nghiệp theo năm',
                    data: x,
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
</script>
