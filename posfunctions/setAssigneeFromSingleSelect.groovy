import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.issue.MutableIssue
String userName;
def csProduct = ComponentAccessor.getCustomFieldManager().getCustomFieldObjectByName("Product")
switch(issue.getCustomFieldValue(csProduct)){
case "Cloud": userName = "gwll";break;
case "Server": userName = "Johnl";break;

}
log.error(userName)
log.error(issue.getCustomFieldValue(csProduct));
issue.setAssignee(ComponentAccessor.getUserManager().getUserByName(userName))
