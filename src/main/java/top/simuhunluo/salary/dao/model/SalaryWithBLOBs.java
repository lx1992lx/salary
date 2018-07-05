package top.simuhunluo.salary.dao.model;

public class SalaryWithBLOBs extends Salary {
    private String note;

    private String commentids;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getCommentids() {
        return commentids;
    }

    public void setCommentids(String commentids) {
        this.commentids = commentids == null ? null : commentids.trim();
    }
}