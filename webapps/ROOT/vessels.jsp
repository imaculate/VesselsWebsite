
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>

<%@page import= "java.io.IOException"%>
<%@page import ="java.io.PrintWriter" %>
<%@page import =  "java.io.BufferedReader" %>
<%@page import =  "java.io.FileNotFoundException" %>
<%@page import =  "java.io.FileReader" %>
<%@page import  = "java.io.IOException"%>
<%@page import  = "java.util.*"%>

  



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Hello World</title>
 <script src="http://maps.google.com/maps/api/js?sensor=false" 
          type="text/javascript"></script>
  <script src= "http://www.google.com/jsapi" type="text/javascript"></script>
</head>
<body>

<form name="searchform"  action="" method="get">
  <input type = "text" name="searchtext"  placeholder = "Enter search text">
  <input  type="button" class= "buttons"name="searchbuton" Value="Search" onclick="replaceSearch(this.form)">
  
</form>


<%!
  ArrayList<String[]> readCsv() {  
String csvFileToRead = "vessels.csv";  
  BufferedReader br = null;  
  String line = "";  
  String splitBy = "\\|"; 
 ArrayList<String[]> outs = new  ArrayList<String[]>();
  
  try {  
  
   br = new BufferedReader(new FileReader(csvFileToRead)); 
  
   line = br.readLine(); //discard heading
   while ((line = br.readLine()) != null) {  

    
    String[] vessel = line.split(splitBy);
    outs.add(vessel);


    

    
    
  
   } 
  
   
  
  } catch (FileNotFoundException e) {
   
   e.printStackTrace();  
  } catch (IOException e) {  
   e.printStackTrace();  
  } finally {  
   if (br != null) {  
    try {  
     br.close();  
    } catch (IOException e) {  
     e.printStackTrace();  
    }  
   }  
  }
  return outs;
  }  
  
 
   %>
 
	




   <table id = "datatable">
  
        <tr class="firstrow">
        

            <th > Vessel Name <button onclick="mysort('vesselname')">Sort</button> </th>
            <th > Imo <button onclick="mysort('imo')">Sort</button></th>
            <th > Mmsi <button onclick="mysort('mmsi')">Sort</button></th>
            <th > Type <button onclick="mysort('type')">Sort</button></th>

       
         </tr>
      
        <%  ArrayList<String[]> data = readCsv();
          int data_length= data.size();
            for(int i = 0 ; i< data_length; i++ ) { %>
        <tr class = "datarow">
            <td > <%= data.get(i)[0]%></td>
            <td> <%= data.get(i)[1]%> </td>
            <td> <%= data.get(i)[2]%></td>
            <td> <%= data.get(i)[3]%></td>
            

            <td style="display:none;"><%= data.get(i)[5]%> </td>
            <td style="display:none;"><%= data.get(i)[4]%> </td>
            
          </tr>

      



 

  <%  }%>



</table>


<script type="text/javascript">
      var data_rows = document.getElementById("datatable").rows;
    var len = data_rows.length;
    var index;
    
    var vessels = [];
    
    for(index = 1; index< len; index++){
      var vessel = { vesselname: String(data_rows[index].cells[0].innerHTML) , imo: String(data_rows[index].cells[1].innerHTML), mmsi:String(data_rows[index].cells[2].innerHTML), typev: String(data_rows[index].cells[3].innerHTML), latitude:Number(data_rows[index].cells[4].innerHTML), longitude:Number(data_rows[index].cells[5].innerHTML) };
     
      vessels.push(vessel);


    }
</script>
<div id="map" style="width: 80%; height: 500px;"></div>

<script type="text/javascript">

    
   data_rows = document.getElementById("datatable").rows;
     len = data_rows.length;
   var j;
   var locations = [];

   for(j=1; j<len; j++){
    var loca = new Array( String(data_rows[j].cells[0].innerHTML), Number(data_rows[j].cells[4].innerHTML) , Number(data_rows[j].cells[5].innerHTML));
    locations.push(loca);

   }

   
    var map = new google.maps.Map(document.getElementById('map'), {
      zoom: 2,
      center: new google.maps.LatLng(45, 0),
      mapTypeId: google.maps.MapTypeId.ROADMAP
    });

    var infowindow = new google.maps.InfoWindow();

    var marker, i;

    for (i = 0; i < locations.length; i++) {  
      marker = new google.maps.Marker({
        position: new google.maps.LatLng(locations[i][1], locations[i][2]),
        map: map
      });

      google.maps.event.addListener(marker, 'click', (function(marker, i) {
        return function() {
          infowindow.setContent(locations[i][0]);
          infowindow.open(map, marker);
        }
      })(marker, i));
    }
  </script>

  <script type= "text/javascript">
  function mysort(column){
      var newtable = document.createElement("table");
      newtable.id = 'datatable';
      if(column == "vesselname"){
        vessels.sort(function(a, b) {
             return a.vesselname.localeCompare(b.vesselname);
        });

      }else if(column=="imo"){
        vessels.sort(function(a, b) {
             return Number(a.imo) - Number(b.imo);
      
        });
      }else if(column == "mmsi"){
        vessels.sort(function(a, b) {
             return Number(a.mmsi) - Number(b.mmsi);
        });
      }else{
        vessels.sort(function(a, b) {
             return (a.typev.localeCompare(b.typev));
        });
      } 
      var hrow = document.createElement('tr');
      hrow.setAtribute = ('class', "firstrow");
     

      var h1 = document.createElement('th');
      h1.textContent = "Vessel Name";
      var b1 = document.createElement('button');
      b1.setAttribute('onclick', "mysort('vesselname')");
      b1.innerHTML = 'Sort'
      h1.appendChild(b1);
      hrow.appendChild(h1);

      var h2 = document.createElement('th');
      h2.textContent = "Imo";
      var b2 = document.createElement('button');
     b2.setAttribute('onclick', "mysort('imo')");
      b2.innerHTML = 'Sort';
      h2.appendChild(b2);
      hrow.appendChild(h2);

      var h3 = document.createElement('th');
      h3.textContent = "Mmsi";
      var b3 = document.createElement('button');
      b3.setAttribute('onclick', "mysort('mmsi')");
      b3.innerHTML = 'Sort';
      h3.appendChild(b3);
      hrow.appendChild(h3);

      var h4 = document.createElement('th');
      h4.textContent = "Type";
      var b4 = document.createElement('button');
      b4.setAttribute('onclick', "mysort('type')");
      b4.innerHTML = 'Sort';
      h4.appendChild(b4);
      hrow.appendChild(h4);

       newtable.appendChild(hrow); 
        
      for (var k = 0; k < vessels.length; k++) {
  
        var vals = vessels[k];
    
         var row = document.createElement('tr');
       
        var cell1 = document.createElement('td');
        cell1.textContent = vals.vesselname;    
        row.appendChild(cell1);


        var cell2 = document.createElement('td');
        cell2.textContent = vals.imo;    
        row.appendChild(cell2);


        var cell3 = document.createElement('td');
        cell3.textContent = vals.mmsi;    
        row.appendChild(cell3);


        var cell4 = document.createElement('td');
        cell4.textContent = vals.typev;
        row.appendChild(cell4);

      

        var cell5 = document.createElement('td');
        cell5.textContent = vals.latitude;
        cell5.style.display = 'none';
        row.appendChild(cell5);

        var cell6 = document.createElement('td');
        cell6.textContent = vals.longitude;
        cell6.style.display = 'none';
        row.appendChild(cell6);

            newtable.appendChild(row);
    }
    

  

    document.body.replaceChild(newtable, document.getElementById("datatable"));
  }
  </script>
  <script type = "text/javascript">

  function replaceSearch(form){
    console.log("in search function");
    var txt =  form.searchtext.value;

    console.log(txt);
    var select= [];
    for(var i = 0; i< vessels.length; i++){

        var v = vessels[i];
        if((v.vesselname.indexOf(txt) > -1)||(v.imo.indexOf(txt) > -1)||(v.mmsi.indexOf(txt) > -1)||(v.typev.indexOf(txt) > -1)){

            select.push(v);
        }
        
    }

    if(select.length ==0){
      alert("No search results found");
      
    }else{

      console.log(select.length);
      var newtable = document.createElement("table");
       newtable.id = 'datatable';
      var hrow = document.createElement('tr');
      hrow.setAtribute = ('class', "firstrow");
     

      var h1 = document.createElement('th');
      h1.textContent = "Vessel Name";
      var b1 = document.createElement('button');
      b1.setAttribute('onclick', "mysort('vesselname')");
      b1.innerHTML = 'Sort'
      h1.appendChild(b1);
      hrow.appendChild(h1);

      var h2 = document.createElement('th');
      h2.textContent = "Imo";
      var b2 = document.createElement('button');
     b2.setAttribute('onclick', "mysort('imo')");
      b2.innerHTML = 'Sort';
      h2.appendChild(b2);
      hrow.appendChild(h2);

      var h3 = document.createElement('th');
      h3.textContent = "Mmsi";
      var b3 = document.createElement('button');
      b3.setAttribute('onclick', "mysort('mmsi')");
      b3.innerHTML = 'Sort';
      h3.appendChild(b3);
      hrow.appendChild(h3);

      var h4 = document.createElement('th');
      h4.textContent = "Type";
      var b4 = document.createElement('button');
      b4.setAttribute('onclick', "mysort('type')");
      b4.innerHTML = 'Sort';
      h4.appendChild(b4);
      hrow.appendChild(h4);

       newtable.appendChild(hrow); 
        
      for (var k = 0; k < select.length; k++) {
  
        var vals = select[k];
    
         var row = document.createElement('tr');
       
        var cell1 = document.createElement('td');
        cell1.textContent = vals.vesselname;    
        row.appendChild(cell1);


        var cell2 = document.createElement('td');
        cell2.textContent = vals.imo;    
        row.appendChild(cell2);


        var cell3 = document.createElement('td');
        cell3.textContent = vals.mmsi;    
        row.appendChild(cell3);


        var cell4 = document.createElement('td');
        cell4.textContent = vals.typev;
        row.appendChild(cell4);

      

        var cell5 = document.createElement('td');
        cell5.textContent = vals.latitude;
        cell5.style.display = 'none';
        row.appendChild(cell5);

        var cell6 = document.createElement('td');
        cell6.textContent = vals.longitude;
        cell6.style.display = 'none';
        row.appendChild(cell6);

            newtable.appendChild(row);
    }
    

  

    document.body.replaceChild(newtable, document.getElementById("datatable"));
  

    }
    
  }
</script>

 

</body>
</html>