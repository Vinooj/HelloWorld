<html>
<body>
<h2>Sales Dashboard</h2>
<img src="dashboard.png" style='width:100%;height:100%' alt="Sales Dashboard"/>  
<%@ page import="java.net.*" %> 
<%
            String hostname, serverAddress;
            hostname = "error";
            serverAddress = "error";
            try {
                InetAddress inetAddress;
                inetAddress = InetAddress.getLocalHost();
                hostname = inetAddress.getHostName();
                serverAddress = inetAddress.toString();
            } catch (UnknownHostException e) {

                e.printStackTrace();
            }
%>
<li>InetAddress: <%=serverAddress %>
<li>InetAddress.hostname: <%=hostname %>  
</body>
</html>
