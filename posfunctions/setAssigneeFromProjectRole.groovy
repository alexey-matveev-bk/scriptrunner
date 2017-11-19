import com.atlassian.jira.issue.CustomFieldManager
import com.atlassian.jira.issue.IssueManager
import com.atlassian.jira.issue.fields.CustomField
import com.atlassian.crowd.embedded.api.User
import com.atlassian.jira.user.util.UserManager
import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.issue.MutableIssue
import com.atlassian.jira.issue.UpdateIssueRequest
import com.atlassian.jira.event.type.EventDispatchOption
import com.atlassian.jira.bc.projectroles.ProjectRoleService;
import com.atlassian.jira.project.Project;
import com.atlassian.jira.project.ProjectManager;
import com.atlassian.jira.security.roles.ProjectRole;
import com.atlassian.jira.security.roles.ProjectRoleActors;
import com.atlassian.jira.security.roles.ProjectRoleManager;
import com.atlassian.jira.security.roles.RoleActor;
 ProjectRoleManager projectRoleManager = ComponentAccessor.getComponentOfType(ProjectRoleManager.class) as ProjectRoleManager
// name of role here
ProjectRole devsRole = projectRoleManager.getProjectRole("PRODUCT OWNERS")
ProjectRoleActors actors = projectRoleManager.getProjectRoleActors(devsRole, issue.getProjectObject())

// if there is only one member of the role or you only want the first you could do:
if (actors.getUsers().size() == 0) {
//users not found
} else {
def productOwner = actors.getUsers().toList()?.first()
}
if (issue.issueTypeObject.name == "Bug") {
issue.setAssignee(productOwner); (what do i need to pass here)
}
