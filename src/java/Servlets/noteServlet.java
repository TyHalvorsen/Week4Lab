package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author TyHalvorsen
 */
public class noteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

       String title = br.readLine();
       String contents = br.readLine();

        Note newNote = new Note(title, contents);
        
        request.setAttribute("newNote", newNote);
        
        String edit = request.getParameter("edit");
        
        if (edit != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/EditNote.jsp").forward(request, response);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/ViewNote.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/Note.txt");
        String newTitle = request.getParameter("title");
        String newContents = request.getParameter("contents");

        if (newTitle == null || newTitle.equals("") || newContents == null || newContents.equals("")) {
            newTitle = request.getParameter("title");
            newContents = request.getParameter("contents");
            Note newNote = new Note(newTitle, newContents);
            request.setAttribute("newNote", newTitle);
            request.setAttribute("newNote", newContents);
            request.setAttribute("invalid", true);

            getServletContext().getRequestDispatcher("/WEB-INF/EditNote.jsp").forward(request, response);
            return;
        }
        
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        printWriter.println(newTitle);
        printWriter.println(newContents);
        printWriter.close();
        Note newNote = new Note(newTitle, newContents);
        
        response.sendRedirect("note");
        return;
    }

}
