package video;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "VideoServlet", value = "/VideoServlet")
public class VideoServlet extends HttpServlet {

    private List<Video> videos = new ArrayList<Video>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        PrintWriter sendToClient = response.getWriter();

        for(Video v: this.videos){
            sendToClient.write(v.getName() + ": " + v.getUrl() + "\n");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain");
        String name  = request.getParameter("name");
        String url  = request.getParameter("url");
        String durationString  = request.getParameter("duration");
        int duration = 0;
        duration = Integer.parseInt(durationString);

        if (name == null || url == null || durationString == null
                || name.trim().length() < 1 || url.trim().length() < 1 || durationString.trim().length() < 1 || duration <= 0 ) {
            response.sendError(400, "Missing ['name', 'url', 'duration'].");
        } else {
            Video v = new Video(name, url, duration);
            videos.add(v);
            response.getWriter().println("VIDEO ADDED");
        }
    }
}
