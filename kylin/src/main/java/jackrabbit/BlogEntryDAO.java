package jackrabbit;

import java.io.InputStream;
import java.util.ArrayList;

public interface BlogEntryDAO {
    public void insertBlogEntry(BlogEntryDTO blogEntryDTO)
            throws BlogApplicationException;
    public void updateBlogEntry(BlogEntryDTO blogEntryDTO)
            throws BlogApplicationException;
    public ArrayList getBlogList()
            throws BlogApplicationException;
    public BlogEntryDTO getBlogEntry(String blogTitle)
            throws BlogApplicationException;
    public void removeBlogEntry(String blogTitle)
            throws BlogApplicationException;
    public ArrayList searchBlogList(String userName)
            throws BlogApplicationException;
    public void attachFileToBlogEntry(String blogTitle, InputStream uploadInputStream)
            throws BlogApplicationException;
    public InputStream getAttachedFile(String blogTitle)
            throws BlogApplicationException;
}