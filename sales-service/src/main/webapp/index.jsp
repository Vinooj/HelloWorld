<html>
<body>
<h2>Sales Data</h2>
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
