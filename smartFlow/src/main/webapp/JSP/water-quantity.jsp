<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Flow data</title>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/quantity-style.css">
  <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/navigation.css">
  <link rel="icon" type="image/x-icon" href="<%= request.getContextPath() %>/IMAGE/smartflow.png">
  <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
    <header>
        <div class="logo">
            <img src="<%= request.getContextPath() %>/IMAGE/smartflow.png" alt="zbi logo" usemap="#logo">
        </div>
        <div class="top">
            <nav class="topnav">      
                    <a  class="other-nav" href="new-tank" >New Tank</a>
                    <a  class ="other-nav" href="new-motor" >New Motor</a>
                    <a  class ="other-nav" href="new-sensor" >New Sensor</a>
                    <a  class ="other-nav" href="new-connection">New Connection</a>
                    <a class="other-nav" href="new-project"> New Project</a>
            </nav>
        </div>
    </header>
   
    <div class="page" >
   
        <div class="side-nav">
            <div class="this-side-nav">
                <a >Water Quantity</a>
            </div>
            <div class="other-side-nav">
                <a  href="water-quality">Water Quality</a>
            </div>
           
            <div class="other-side-nav">
                <a  href="voltage-data">Voltage-data</a>
            </div>
           
           
         
        </div>
        <div class="time-select">
            <a class="this-period">Last Weak</a>
            <a class="other-period"  href="flow-30.html">Last 30 Days</a>
            <a class="other-period">This Month</a>
            <a class="other-period">Previous Month</a>
        </div>
        <div class="chart">
        <canvas id="myChart"></canvas>

        <script>
          
          var ctx = document.getElementById('myChart').getContext('2d');
          var myChart = new Chart(ctx, {
          type: 'line',
          data: {
              labels: ['25/3', '26/3', '27/3', '28/3', '29/3','30/3','31/3'],
              datasets: [{
              label: 'Water flow',
              data: [0, 0, 126724, 41537, 59998,8200,5398],
              borderColor: '#113b23',
              borderWidth: 2
          }]
        },
        options: {
      scales: {
        x: {
          display: true,
          title: {
            display: true,
            text: 'Time/Date'
          },
          ticks: {
            fontSize: 16
          }
        },
        y: {
          display: true,
          title: {
            display: true,
            text: 'Water in Liter'
          },
          ticks: {
            fontSize: 39 
          }
        }
      }
    }
    });
      
        </script>
       </div>
    </div>

</body>
</html>
