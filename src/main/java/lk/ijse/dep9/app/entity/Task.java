package lk.ijse.dep9.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Task implements SuperEntity{
    private int id;

    private String content;
    private Status status;
    private Project project;
    private int projectId;

    public Task(String content, Status status, Project project) {
        this.content = content;
        this.status = status;
        this.project = project;
    }

    public Task(int id, String content, Status status, int project_id) {

    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public static enum Status{
        COMPLETED,NOT_COMPLETED

    }
}
