package top.simuhunluo.salary.dao.model;

public class UsersWithBLOBs extends UsersKey {
    private String marklist;

    private String commentids;

    public String getMarklist() {
        return marklist;
    }

    public void setMarklist(String marklist) {
        this.marklist = marklist == null ? null : marklist.trim();
    }

    public String getCommentids() {
        return commentids;
    }

    public void setCommentids(String commentids) {
        this.commentids = commentids == null ? null : commentids.trim();
    }
}